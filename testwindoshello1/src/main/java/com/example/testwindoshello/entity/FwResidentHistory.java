package com.example.testwindoshello.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "fw_resident_history", schema = "crebas", catalog = "")
public class FwResidentHistory {
    private String residenthistoryid;
    private Long idsyrk;
    private String lvrylx;
    private String lvxm;
    private String lvzjhm;
    private String lvzjzl;
    private String lvgjhdqdm;
    private String lvywx;
    private String lvywm;
    private String lvxbdm;
    private Integer lvcsrq;
    private String hjdz;
    private Integer checkindate;
    private Integer leavedate;
    private String lvlxdh;
    private String systemid;
    private Long idsyfw;
    private Timestamp djsj;
    private String houseinfoid;

    @Id
    @Column(name = "residenthistoryid")
    public String getResidenthistoryid() {
        return residenthistoryid;
    }

    public void setResidenthistoryid(String residenthistoryid) {
        this.residenthistoryid = residenthistoryid;
    }

    @Basic
    @Column(name = "idsyrk")
    public Long getIdsyrk() {
        return idsyrk;
    }

    public void setIdsyrk(Long idsyrk) {
        this.idsyrk = idsyrk;
    }

    @Basic
    @Column(name = "lvrylx")
    public String getLvrylx() {
        return lvrylx;
    }

    public void setLvrylx(String lvrylx) {
        this.lvrylx = lvrylx;
    }

    @Basic
    @Column(name = "lvxm")
    public String getLvxm() {
        return lvxm;
    }

    public void setLvxm(String lvxm) {
        this.lvxm = lvxm;
    }

    @Basic
    @Column(name = "lvzjhm")
    public String getLvzjhm() {
        return lvzjhm;
    }

    public void setLvzjhm(String lvzjhm) {
        this.lvzjhm = lvzjhm;
    }

    @Basic
    @Column(name = "lvzjzl")
    public String getLvzjzl() {
        return lvzjzl;
    }

    public void setLvzjzl(String lvzjzl) {
        this.lvzjzl = lvzjzl;
    }

    @Basic
    @Column(name = "lvgjhdqdm")
    public String getLvgjhdqdm() {
        return lvgjhdqdm;
    }

    public void setLvgjhdqdm(String lvgjhdqdm) {
        this.lvgjhdqdm = lvgjhdqdm;
    }

    @Basic
    @Column(name = "lvywx")
    public String getLvywx() {
        return lvywx;
    }

    public void setLvywx(String lvywx) {
        this.lvywx = lvywx;
    }

    @Basic
    @Column(name = "lvywm")
    public String getLvywm() {
        return lvywm;
    }

    public void setLvywm(String lvywm) {
        this.lvywm = lvywm;
    }

    @Basic
    @Column(name = "lvxbdm")
    public String getLvxbdm() {
        return lvxbdm;
    }

    public void setLvxbdm(String lvxbdm) {
        this.lvxbdm = lvxbdm;
    }

    @Basic
    @Column(name = "lvcsrq")
    public Integer getLvcsrq() {
        return lvcsrq;
    }

    public void setLvcsrq(Integer lvcsrq) {
        this.lvcsrq = lvcsrq;
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
    @Column(name = "checkindate")
    public Integer getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(Integer checkindate) {
        this.checkindate = checkindate;
    }

    @Basic
    @Column(name = "leavedate")
    public Integer getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(Integer leavedate) {
        this.leavedate = leavedate;
    }

    @Basic
    @Column(name = "lvlxdh")
    public String getLvlxdh() {
        return lvlxdh;
    }

    public void setLvlxdh(String lvlxdh) {
        this.lvlxdh = lvlxdh;
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
    @Column(name = "idsyfw")
    public Long getIdsyfw() {
        return idsyfw;
    }

    public void setIdsyfw(Long idsyfw) {
        this.idsyfw = idsyfw;
    }

    @Basic
    @Column(name = "djsj")
    public Timestamp getDjsj() {
        return djsj;
    }

    public void setDjsj(Timestamp djsj) {
        this.djsj = djsj;
    }

    @Basic
    @Column(name = "houseinfoid")
    public String getHouseinfoid() {
        return houseinfoid;
    }

    public void setHouseinfoid(String houseinfoid) {
        this.houseinfoid = houseinfoid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FwResidentHistory that = (FwResidentHistory) o;
        return Objects.equals(residenthistoryid, that.residenthistoryid) &&
                Objects.equals(idsyrk, that.idsyrk) &&
                Objects.equals(lvrylx, that.lvrylx) &&
                Objects.equals(lvxm, that.lvxm) &&
                Objects.equals(lvzjhm, that.lvzjhm) &&
                Objects.equals(lvzjzl, that.lvzjzl) &&
                Objects.equals(lvgjhdqdm, that.lvgjhdqdm) &&
                Objects.equals(lvywx, that.lvywx) &&
                Objects.equals(lvywm, that.lvywm) &&
                Objects.equals(lvxbdm, that.lvxbdm) &&
                Objects.equals(lvcsrq, that.lvcsrq) &&
                Objects.equals(hjdz, that.hjdz) &&
                Objects.equals(checkindate, that.checkindate) &&
                Objects.equals(leavedate, that.leavedate) &&
                Objects.equals(lvlxdh, that.lvlxdh) &&
                Objects.equals(systemid, that.systemid) &&
                Objects.equals(idsyfw, that.idsyfw) &&
                Objects.equals(djsj, that.djsj) &&
                Objects.equals(houseinfoid, that.houseinfoid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(residenthistoryid, idsyrk, lvrylx, lvxm, lvzjhm, lvzjzl, lvgjhdqdm, lvywx, lvywm, lvxbdm, lvcsrq, hjdz, checkindate, leavedate, lvlxdh, systemid, idsyfw, djsj, houseinfoid);
    }
}
