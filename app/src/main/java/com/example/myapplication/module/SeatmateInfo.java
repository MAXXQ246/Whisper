package com.example.myapplication.module;


import com.example.myapplication.util.ConstUtil;

import org.litepal.crud.LitePalSupport;

import java.util.Date;

public class SeatmateInfo extends LitePalSupport {

    String idSeatmate = "";
    String person1 = "";
    String person2 = "";
    Date startTime = null;
    Date endTime = null;
    Integer status = ConstUtil.SeatmateStatus.STATUS_PROCESSING;
    Integer processingDay = 0;  //目前处于第几天

    public SeatmateInfo() {
    }

    public SeatmateInfo(String idSeatmate, String person1, String person2, Date startTime, Date endTime, Integer status, Integer processingDay) {
        this.idSeatmate = idSeatmate;
        this.person1 = person1;
        this.person2 = person2;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.processingDay = processingDay;
    }

    public String getIdSeatmate() {
        return idSeatmate;
    }

    public void setIdSeatmate(String idSeatmate) {
        this.idSeatmate = idSeatmate;
    }

    public String getPerson1() {
        return person1;
    }

    public void setPerson1(String person1) {
        this.person1 = person1;
    }

    public String getPerson2() {
        return person2;
    }

    public void setPerson2(String person2) {
        this.person2 = person2;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getProcessingDay() {
        return processingDay;
    }

    public void setProcessingDay(Integer processingDay) {
        this.processingDay = processingDay;
    }
}
