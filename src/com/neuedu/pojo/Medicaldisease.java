package com.neuedu.pojo;

import java.util.Date;

public class Medicaldisease {
    private Integer id;

    private Integer medicalid;

    private Integer registid;

    private Integer diseaseid;

    private Integer diagnosetype;

    private Date getsiskdate;

    private Integer diagnosecate;

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

    public Integer getDiseaseid() {
        return diseaseid;
    }

    public void setDiseaseid(Integer diseaseid) {
        this.diseaseid = diseaseid;
    }

    public Integer getDiagnosetype() {
        return diagnosetype;
    }

    public void setDiagnosetype(Integer diagnosetype) {
        this.diagnosetype = diagnosetype;
    }

    public Date getGetsiskdate() {
        return getsiskdate;
    }

    public void setGetsiskdate(Date getsiskdate) {
        this.getsiskdate = getsiskdate;
    }

    public Integer getDiagnosecate() {
        return diagnosecate;
    }

    public void setDiagnosecate(Integer diagnosecate) {
        this.diagnosecate = diagnosecate;
    }
}