package com.example.testwindoshello.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "fw_message", schema = "crebas", catalog = "")
public class FwMessage {
    private long messageid;
    private String userid;
    private String messagetype;
    private Timestamp messagetime;
    private String title;
    private String ifread;
    private Timestamp readtime;
    private Long eventid;

    @Id
    @Column(name = "messageid")
    public long getMessageid() {
        return messageid;
    }

    public void setMessageid(long messageid) {
        this.messageid = messageid;
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
    @Column(name = "messagetype")
    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype;
    }

    @Basic
    @Column(name = "messagetime")
    public Timestamp getMessagetime() {
        return messagetime;
    }

    public void setMessagetime(Timestamp messagetime) {
        this.messagetime = messagetime;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "ifread")
    public String getIfread() {
        return ifread;
    }

    public void setIfread(String ifread) {
        this.ifread = ifread;
    }

    @Basic
    @Column(name = "readtime")
    public Timestamp getReadtime() {
        return readtime;
    }

    public void setReadtime(Timestamp readtime) {
        this.readtime = readtime;
    }

    @Basic
    @Column(name = "eventid")
    public Long getEventid() {
        return eventid;
    }

    public void setEventid(Long eventid) {
        this.eventid = eventid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FwMessage fwMessage = (FwMessage) o;
        return messageid == fwMessage.messageid &&
                Objects.equals(userid, fwMessage.userid) &&
                Objects.equals(messagetype, fwMessage.messagetype) &&
                Objects.equals(messagetime, fwMessage.messagetime) &&
                Objects.equals(title, fwMessage.title) &&
                Objects.equals(ifread, fwMessage.ifread) &&
                Objects.equals(readtime, fwMessage.readtime) &&
                Objects.equals(eventid, fwMessage.eventid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageid, userid, messagetype, messagetime, title, ifread, readtime, eventid);
    }
}
