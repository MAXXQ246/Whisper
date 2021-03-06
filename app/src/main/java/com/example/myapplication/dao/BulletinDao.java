package com.example.myapplication.dao;

import com.example.myapplication.module.BulletinInfo;

import java.util.List;

public interface BulletinDao {

    /**
     * 新增公告
     * @param bulletinInfo
     * @return
     */
    public boolean addBulletin(BulletinInfo bulletinInfo);

    /**
     * 查询所有公告
     * @return
     */
    public List<BulletinInfo> getBulletins();

    /**
     * 删除指定公告
     * @param bulletinInfo
     * @return
     */
    public boolean deleteBulletin(BulletinInfo bulletinInfo);

    /**
     * 根据公告号查询公告
     * @param Id
     * @return
     */
    public List<BulletinInfo> getBulletinsById(Integer Id);

    /**
     * 更新公告
     * @param bulletinInfo
     * @return
     */
    public boolean updateBulletinById(BulletinInfo bulletinInfo);

    /**
     * 点赞
     * @param bulletinInfo
     * @return
     */
    public boolean clickHeart(BulletinInfo bulletinInfo);

    /**
     * 取赞
     * @param bulletinInfo
     * @return
     */
    public boolean cancelHeart(BulletinInfo bulletinInfo);

    /**
     * 更新点击量
     * @param bulletinInfo
     * @return
     */
    public boolean updateClickNum(BulletinInfo bulletinInfo);

    /**
     * 获取最新5条公告
     * @return
     */
    public List<BulletinInfo> getRecentBullets();

    /**
     * 根据类型获取说明或公告
     * @param type
     * @return
     */
    public List<BulletinInfo> getBulletsByType(Integer type);
}
