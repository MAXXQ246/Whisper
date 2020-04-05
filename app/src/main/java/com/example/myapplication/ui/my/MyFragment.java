package com.example.myapplication.ui.my;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Edit_personActivity;
import com.example.myapplication.R;
import com.example.myapplication.SettingsActivity;
import com.example.myapplication.ShareActivity;
import com.example.myapplication.adapter.RecyclerAdapter;
import com.example.myapplication.ui.find.FindViewModel;
import com.example.myapplication.ui.mail.MailViewModel;
import com.example.myapplication.util.DBUtil;

public class MyFragment extends Fragment{

    private MyViewModel myViewModel;
    private View view;             //定义view用来设置fragment的layout

    /*private TextView t_name; //昵称
    private TextView t_number; //账号
    private Button btn_quit;//退出登录
    private LinearLayout personInfo;//个人资料
    private LinearLayout mySchedule; //我的日程
    private LinearLayout myRanking;//个人评级
    private LinearLayout myPartner;//我的同桌
    private LinearLayout me_share;//分享应用
    private LinearLayout feedback;//留言反馈
    private LinearLayout setUp;//设置

    Handler mTimeHandler; //传递消息

    private  String imageUrl;
    private ImageView img_head; //头像


     */
    /*
    //在消息队列中实现对控件的更改
    private Handler handler=new Handler(){
        public void handleMessage(Message msg){
            switch (msg.what){
                case 0:
                    Bitmap bitmap=(Bitmap)msg.obj;
                    img_head.setImageBitmap(bitmap);
                    break;
            }
        };
    };

     */

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getActivity().getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        }
    }

    /**
     * 继承Fragment类，重写两个方法
     * 第一个方法onCreateView--返回布局
     * 第二个方法onViewCreated--绑定控件
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myViewModel= ViewModelProviders.of(this).get(MyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my, container, false);   //获取fragment的layout

        view=root;

       // initView();

        return root;
    }

    /*
    private void intiView(View view){

        t_name=(TextView)view.findViewById(R.id.t_name);
        t_number=(TextView)view.findViewById(R.id.t_number);

        btn_quit=(Button)view.findViewById(R.id.btn_quit);
        btn_quit.setOnClickListener(this);

        personInfo=(LinearLayout)view.findViewById(R.id.personInfo);
        personInfo.setOnClickListener(this);

        //me_share=view.findViewById(R.id.me_share);
        //me_share.setOnClickListener(this);

        me_share=getActivity().findViewById(R.id.me_share);
        me_share.setOnClickListener({
                Intent intent=new Intent()
                }
        );

        feedback=(LinearLayout)view.findViewById(R.id.feedback);
        feedback.setOnClickListener(this);

        myPartner=(LinearLayout)view.findViewById(R.id.myPartner);
        myPartner.setOnClickListener(this);

        mySchedule=(LinearLayout)view.findViewById(R.id.mySchedule);
        mySchedule.setOnClickListener(this);

        myRanking=(LinearLayout)view.findViewById(R.id.myRanking);
        myRanking.setOnClickListener(this);

        setUp=(LinearLayout)view.findViewById(R.id.setUp);
        setUp.setOnClickListener(this);

        img_head=(ImageView)view.findViewById(R.id.images_head);


    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.personInfo:
                startActivity(new Intent(getActivity(), Edit_personActivity.class));
                break;
            //case R.id.me_share:
              //  startActivity(new Intent(getActivity(), ShareActivity.class));
               // break;
        }
    }

     */



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();//初始化视图
    }

    public void initView(){
        //分享
        LinearLayout me_share=getActivity().findViewById(R.id.me_share);

        //设置
        LinearLayout settings=getActivity().findViewById(R.id.settings);

        //编辑个人资料
        LinearLayout personInfo=getActivity().findViewById(R.id.personInfo);

        me_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),ShareActivity.class);
                startActivity(intent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), SettingsActivity.class);
                startActivity(intent);
            }
        });

        personInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),Edit_personActivity.class);
                startActivity(intent);
            }
        });
    }
}