package com.example.testwindoshello.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "fw_img", schema = "crebas", catalog = "")
public class FwImg {
    private String imgid;
    private String zplx;
    private String zplxid;
    private String tplx;
    private String tpurl;
    private Timestamp scsj;

    @Id
    @Column(name = "imgid")
    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid;
    }

    @Basic
    @Column(name = "zplx")
    public String getZplx() {
        return zplx;
    }

    public void setZplx(String zplx) {
        this.zplx = zplx;
    }

    @Basic
    @Column(name = "zplxid")
    public String getZplxid() {
        return zplxid;
    }

    public void setZplxid(String zplxid) {
        this.zplxid = zplxid;
    }

    @Basic
    @Column(name = "tplx")
    public String getTplx() {
        return tplx;
    }

    public void setTplx(String tplx) {
        this.tplx = tplx;
    }

    @Basic
    @Column(name = "tpurl")
    public String getTpurl() {
        return tpurl;
    }

    public void setTpurl(String tpurl) {
        this.tpurl = tpurl;
    }

    @Basic
    @Column(name = "scsj")
    public Timestamp getScsj() {
        return scsj;
    }

    public void setScsj(Timestamp scsj) {
        this.scsj = scsj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FwImg fwImg = (FwImg) o;
        return Objects.equals(imgid, fwImg.imgid) &&
                Objects.equals(zplx, fwImg.zplx) &&
                Objects.equals(zplxid, fwImg.zplxid) &&
                Objects.equals(tplx, fwImg.tplx) &&
                Objects.equals(tpurl, fwImg.tpurl) &&
                Objects.equals(scsj, fwImg.scsj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imgid, zplx, zplxid, tplx, tpurl, scsj);
    }
}
