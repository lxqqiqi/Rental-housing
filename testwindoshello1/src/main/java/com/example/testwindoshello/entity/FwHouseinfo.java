package com.example.testwindoshello.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "fw_houseinfo", schema = "crebas", catalog = "")
public class FwHouseinfo {
    private String houseinfoid;
    private String userid;
    private Long housedeclareid;
    private String systemid;
    private String islast;
    private Long idsyfw;
    private String lvfwlbdm;
    private String lvfwytdm;
    private String lvfwcqxzzldm;
    private String lvczwbs;
    private String lvfwczyt;
    private BigDecimal lvfwczmj;
    private Integer lvfwczjs;
    private String lvfzxm;
    private String lvfzgmsfhm;
    private String lvfzlxdh;
    private String lvtgrxm;
    private String lvtgrgmsfhm;
    private String lvtgrlxdh;
    private String wtglyxm;
    private String wtglygmsfhm;
    private String wtglylxdh;
    private String ifverify;
    private Timestamp verifytime;
    private String verifyperson;
    private String verifydesc;
    private String orgid;
    private String remark;

    @Id
    @Column(name = "houseinfoid")
    public String getHouseinfoid() {
        return houseinfoid;
    }

    public void setHouseinfoid(String houseinfoid) {
        this.houseinfoid = houseinfoid;
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
    @Column(name = "housedeclareid")
    public Long getHousedeclareid() {
        return housedeclareid;
    }

    public void setHousedeclareid(Long housedeclareid) {
        this.housedeclareid = housedeclareid;
    }

    @Basic
    @Column(name = "systemid")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "islast")
    public String getIslast() {
        return islast;
    }

    public void setIslast(String islast) {
        this.islast = islast;
    }

    @Basic
    @Column(name = "idsyfw")
    public Long getIdsyfw() {
        return idsyfw;
    }

    public void setIdsyfw(Long idsyfw) {
        this.idsyfw = idsyfw;
    }

    @Basic
    @Column(name = "lvfwlbdm")
    public String getLvfwlbdm() {
        return lvfwlbdm;
    }

    public void setLvfwlbdm(String lvfwlbdm) {
        this.lvfwlbdm = lvfwlbdm;
    }

    @Basic
    @Column(name = "lvfwytdm")
    public String getLvfwytdm() {
        return lvfwytdm;
    }

    public void setLvfwytdm(String lvfwytdm) {
        this.lvfwytdm = lvfwytdm;
    }

    @Basic
    @Column(name = "lvfwcqxzzldm")
    public String getLvfwcqxzzldm() {
        return lvfwcqxzzldm;
    }

    public void setLvfwcqxzzldm(String lvfwcqxzzldm) {
        this.lvfwcqxzzldm = lvfwcqxzzldm;
    }

    @Basic
    @Column(name = "lvczwbs")
    public String getLvczwbs() {
        return lvczwbs;
    }

    public void setLvczwbs(String lvczwbs) {
        this.lvczwbs = lvczwbs;
    }

    @Basic
    @Column(name = "lvfwczyt")
    public String getLvfwczyt() {
        return lvfwczyt;
    }

    public void setLvfwczyt(String lvfwczyt) {
        this.lvfwczyt = lvfwczyt;
    }

    @Basic
    @Column(name = "lvfwczmj")
    public BigDecimal getLvfwczmj() {
        return lvfwczmj;
    }

    public void setLvfwczmj(BigDecimal lvfwczmj) {
        this.lvfwczmj = lvfwczmj;
    }

    @Basic
    @Column(name = "lvfwczjs")
    public Integer getLvfwczjs() {
        return lvfwczjs;
    }

    public void setLvfwczjs(Integer lvfwczjs) {
        this.lvfwczjs = lvfwczjs;
    }

    @Basic
    @Column(name = "lvfzxm")
    public String getLvfzxm() {
        return lvfzxm;
    }

    public void setLvfzxm(String lvfzxm) {
        this.lvfzxm = lvfzxm;
    }

    @Basic
    @Column(name = "lvfzgmsfhm")
    public String getLvfzgmsfhm() {
        return lvfzgmsfhm;
    }

    public void setLvfzgmsfhm(String lvfzgmsfhm) {
        this.lvfzgmsfhm = lvfzgmsfhm;
    }

    @Basic
    @Column(name = "lvfzlxdh")
    public String getLvfzlxdh() {
        return lvfzlxdh;
    }

    public void setLvfzlxdh(String lvfzlxdh) {
        this.lvfzlxdh = lvfzlxdh;
    }

    @Basic
    @Column(name = "lvtgrxm")
    public String getLvtgrxm() {
        return lvtgrxm;
    }

    public void setLvtgrxm(String lvtgrxm) {
        this.lvtgrxm = lvtgrxm;
    }

    @Basic
    @Column(name = "lvtgrgmsfhm")
    public String getLvtgrgmsfhm() {
        return lvtgrgmsfhm;
    }

    public void setLvtgrgmsfhm(String lvtgrgmsfhm) {
        this.lvtgrgmsfhm = lvtgrgmsfhm;
    }

    @Basic
    @Column(name = "lvtgrlxdh")
    public String getLvtgrlxdh() {
        return lvtgrlxdh;
    }

    public void setLvtgrlxdh(String lvtgrlxdh) {
        this.lvtgrlxdh = lvtgrlxdh;
    }

    @Basic
    @Column(name = "wtglyxm")
    public String getWtglyxm() {
        return wtglyxm;
    }

    public void setWtglyxm(String wtglyxm) {
        this.wtglyxm = wtglyxm;
    }

    @Basic
    @Column(name = "wtglygmsfhm")
    public String getWtglygmsfhm() {
        return wtglygmsfhm;
    }

    public void setWtglygmsfhm(String wtglygmsfhm) {
        this.wtglygmsfhm = wtglygmsfhm;
    }

    @Basic
    @Column(name = "wtglylxdh")
    public String getWtglylxdh() {
        return wtglylxdh;
    }

    public void setWtglylxdh(String wtglylxdh) {
        this.wtglylxdh = wtglylxdh;
    }

    @Basic
    @Column(name = "ifverify")
    public String getIfverify() {
        return ifverify;
    }

    public void setIfverify(String ifverify) {
        this.ifverify = ifverify;
    }

    @Basic
    @Column(name = "verifytime")
    public Timestamp getVerifytime() {
        return verifytime;
    }

    public void setVerifytime(Timestamp verifytime) {
        this.verifytime = verifytime;
    }

    @Basic
    @Column(name = "verifyperson")
    public String getVerifyperson() {
        return verifyperson;
    }

    public void setVerifyperson(String verifyperson) {
        this.verifyperson = verifyperson;
    }

    @Basic
    @Column(name = "verifydesc")
    public String getVerifydesc() {
        return verifydesc;
    }

    public void setVerifydesc(String verifydesc) {
        this.verifydesc = verifydesc;
    }

    @Basic
    @Column(name = "orgid")
    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FwHouseinfo that = (FwHouseinfo) o;
        return Objects.equals(houseinfoid, that.houseinfoid) &&
                Objects.equals(userid, that.userid) &&
                Objects.equals(housedeclareid, that.housedeclareid) &&
                Objects.equals(systemid, that.systemid) &&
                Objects.equals(islast, that.islast) &&
                Objects.equals(idsyfw, that.idsyfw) &&
                Objects.equals(lvfwlbdm, that.lvfwlbdm) &&
                Objects.equals(lvfwytdm, that.lvfwytdm) &&
                Objects.equals(lvfwcqxzzldm, that.lvfwcqxzzldm) &&
                Objects.equals(lvczwbs, that.lvczwbs) &&
                Objects.equals(lvfwczyt, that.lvfwczyt) &&
                Objects.equals(lvfwczmj, that.lvfwczmj) &&
                Objects.equals(lvfwczjs, that.lvfwczjs) &&
                Objects.equals(lvfzxm, that.lvfzxm) &&
                Objects.equals(lvfzgmsfhm, that.lvfzgmsfhm) &&
                Objects.equals(lvfzlxdh, that.lvfzlxdh) &&
                Objects.equals(lvtgrxm, that.lvtgrxm) &&
                Objects.equals(lvtgrgmsfhm, that.lvtgrgmsfhm) &&
                Objects.equals(lvtgrlxdh, that.lvtgrlxdh) &&
                Objects.equals(wtglyxm, that.wtglyxm) &&
                Objects.equals(wtglygmsfhm, that.wtglygmsfhm) &&
                Objects.equals(wtglylxdh, that.wtglylxdh) &&
                Objects.equals(ifverify, that.ifverify) &&
                Objects.equals(verifytime, that.verifytime) &&
                Objects.equals(verifyperson, that.verifyperson) &&
                Objects.equals(verifydesc, that.verifydesc) &&
                Objects.equals(orgid, that.orgid) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseinfoid, userid, housedeclareid, systemid, islast, idsyfw, lvfwlbdm, lvfwytdm, lvfwcqxzzldm, lvczwbs, lvfwczyt, lvfwczmj, lvfwczjs, lvfzxm, lvfzgmsfhm, lvfzlxdh, lvtgrxm, lvtgrgmsfhm, lvtgrlxdh, wtglyxm, wtglygmsfhm, wtglylxdh, ifverify, verifytime, verifyperson, verifydesc, orgid, remark);
    }
}
