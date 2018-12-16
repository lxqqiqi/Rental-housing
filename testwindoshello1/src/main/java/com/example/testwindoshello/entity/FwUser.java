package com.example.testwindoshello.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "fw_user", schema = "crebas", catalog = "")
public class FwUser {
    private String userid;
    private String username;
    private String sfzhm;
    private String xm;
    private String sjhm;
    private Timestamp zcsj;
    private String openid;
    private String unionid;
    private String wxhm;
    private String yhzt;
    private String xb;
    private String mz;
    private String csrq;
    private String hjdz;
    private String pfdj;
    private String dqjf;

    @Id
    @Column(name = "userid")
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "sfzhm")
    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    @Basic
    @Column(name = "xm")
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Basic
    @Column(name = "sjhm")
    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    @Basic
    @Column(name = "zcsj")
    public Timestamp getZcsj() {
        return zcsj;
    }

    public void setZcsj(Timestamp zcsj) {
        this.zcsj = zcsj;
    }

    @Basic
    @Column(name = "openid")
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "unionid")
    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    @Basic
    @Column(name = "wxhm")
    public String getWxhm() {
        return wxhm;
    }

    public void setWxhm(String wxhm) {
        this.wxhm = wxhm;
    }

    @Basic
    @Column(name = "yhzt")
    public String getYhzt() {
        return yhzt;
    }

    public void setYhzt(String yhzt) {
        this.yhzt = yhzt;
    }

    @Basic
    @Column(name = "xb")
    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    @Basic
    @Column(name = "mz")
    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    @Basic
    @Column(name = "csrq")
    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    @Basic
    @Column(name = "hjdz")
    public String getHjdz() {
        return hjdz;
    }

    public void setHjdz(String hjdz) {
        this.hjdz = hjdz;
    }

    @Basic
    @Column(name = "pfdj")
    public String getPfdj() {
        return pfdj;
    }

    public void setPfdj(String pfdj) {
        this.pfdj = pfdj;
    }

    @Basic
    @Column(name = "dqjf")
    public String getDqjf() {
        return dqjf;
    }

    public void setDqjf(String dqjf) {
        this.dqjf = dqjf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FwUser fwUser = (FwUser) o;
        return Objects.equals(userid, fwUser.userid) &&
                Objects.equals(username, fwUser.username) &&
                Objects.equals(sfzhm, fwUser.sfzhm) &&
                Objects.equals(xm, fwUser.xm) &&
                Objects.equals(sjhm, fwUser.sjhm) &&
                Objects.equals(zcsj, fwUser.zcsj) &&
                Objects.equals(openid, fwUser.openid) &&
                Objects.equals(unionid, fwUser.unionid) &&
                Objects.equals(wxhm, fwUser.wxhm) &&
                Objects.equals(yhzt, fwUser.yhzt) &&
                Objects.equals(xb, fwUser.xb) &&
                Objects.equals(mz, fwUser.mz) &&
                Objects.equals(csrq, fwUser.csrq) &&
                Objects.equals(hjdz, fwUser.hjdz) &&
                Objects.equals(pfdj, fwUser.pfdj) &&
                Objects.equals(dqjf, fwUser.dqjf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, username, sfzhm, xm, sjhm, zcsj, openid, unionid, wxhm, yhzt, xb, mz, csrq, hjdz, pfdj, dqjf);
    }
}
