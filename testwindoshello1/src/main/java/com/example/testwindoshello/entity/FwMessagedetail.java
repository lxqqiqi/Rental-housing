package com.example.testwindoshello.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "fw_messagedetail", schema = "crebas", catalog = "")
public class FwMessagedetail {
    private long messagedetailid;
    private Long messageid;
    private String columnname;
    private String columnvalue;

    @Id
    @Column(name = "messagedetailid")
    public long getMessagedetailid() {
        return messagedetailid;
    }

    public void setMessagedetailid(long messagedetailid) {
        this.messagedetailid = messagedetailid;
    }

    @Basic
    @Column(name = "messageid")
    public Long getMessageid() {
        return messageid;
    }

    public void setMessageid(Long messageid) {
        this.messageid = messageid;
    }

    @Basic
    @Column(name = "columnname")
    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    @Basic
    @Column(name = "columnvalue")
    public String getColumnvalue() {
        return columnvalue;
    }

    public void setColumnvalue(String columnvalue) {
        this.columnvalue = columnvalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FwMessagedetail that = (FwMessagedetail) o;
        return messagedetailid == that.messagedetailid &&
                Objects.equals(messageid, that.messageid) &&
                Objects.equals(columnname, that.columnname) &&
                Objects.equals(columnvalue, that.columnvalue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messagedetailid, messageid, columnname, columnvalue);
    }
}
