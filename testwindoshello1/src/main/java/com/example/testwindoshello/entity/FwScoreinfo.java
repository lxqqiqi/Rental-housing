package com.example.testwindoshello.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "fw_scoreinfo", schema = "crebas", catalog = "")
public class FwScoreinfo {
    private String scoreinfoid;
    private String userid;
    private String pflx;
    private String pfms;
    private String fz;
    private Timestamp dfsj;

    @Id
    @Column(name = "scoreinfoid")
    public String getScoreinfoid() {
        return scoreinfoid;
    }

    public void setScoreinfoid(String scoreinfoid) {
        this.scoreinfoid = scoreinfoid;
    }

    @Basic
    @Column(name = "userid")
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "pflx")
    public String getPflx() {
        return pflx;
    }

    public void setPflx(String pflx) {
        this.pflx = pflx;
    }

    @Basic
    @Column(name = "pfms")
    public String getPfms() {
        return pfms;
    }

    public void setPfms(String pfms) {
        this.pfms = pfms;
    }

    @Basic
    @Column(name = "fz")
    public String getFz() {
        return fz;
    }

    public void setFz(String fz) {
        this.fz = fz;
    }

    @Basic
    @Column(name = "dfsj")
    public Timestamp getDfsj() {
        return dfsj;
    }

    public void setDfsj(Timestamp dfsj) {
        this.dfsj = dfsj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FwScoreinfo that = (FwScoreinfo) o;
        return Objects.equals(scoreinfoid, that.scoreinfoid) &&
                Objects.equals(userid, that.userid) &&
                Objects.equals(pflx, that.pflx) &&
                Objects.equals(pfms, that.pfms) &&
                Objects.equals(fz, that.fz) &&
                Objects.equals(dfsj, that.dfsj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scoreinfoid, userid, pflx, pfms, fz, dfsj);
    }
}
