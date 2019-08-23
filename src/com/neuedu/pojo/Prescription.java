package com.neuedu.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Prescription {
    private Integer id;

    private Integer medicalid;

    private Integer registid;

    private Integer userid;

    private String prescriptionname;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date prescriptiontime;

    private Integer prescriptionstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalid() {
        return medicalid;
    }

    public void setMedicalid(Integer medicalid) {
        this.medicalid = medicalid;
    }

    public Integer getRegistid() {
        return registid;
    }

    public void setRegistid(Integer registid) {
        this.registid = registid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPrescriptionname() {
        return prescriptionname;
    }

    public void setPrescriptionname(String prescriptionname) {
        this.prescriptionname = prescriptionname == null ? null : prescriptionname.trim();
    }

    public Date getPrescriptiontime() {
        return prescriptiontime;
    }

    public void setPrescriptiontime(Date prescriptiontime) {
        this.prescriptiontime = prescriptiontime;
    }

    public Integer getPrescriptionstate() {
        return prescriptionstate;
    }

    public void setPrescriptionstate(Integer prescriptionstate) {
        this.prescriptionstate = prescriptionstate;
    }
}