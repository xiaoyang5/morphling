package com.lianqu1990.morphling.dao.jpa.entity;
// Generated 2017-11-8 17:20:02 by Hibernate Tools 5.2.1.Final

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Client generated by hbm2java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "client")
@Where(clause = "state=1")
public class Client implements java.io.Serializable {

    private Integer id;
    private String name;
    private String hostAddress;
    private int port;
    private String env;
    private String remark;
    private String packVersion;
    private int createUserid;
    private String createUsername;
    private Date createTime;
    private byte state;


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "host_address", unique = true, nullable = false, length = 20)
    public String getHostAddress() {
        return this.hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    @Column(name = "port", nullable = false)
    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Column(name = "env", nullable = false, length = 20)
    public String getEnv() {
        return this.env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    @Column(name = "remark", nullable = false, length = 20)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Column(name = "pack_version", nullable = false, length = 20)
    public String getPackVersion() {
        return packVersion;
    }

    public void setPackVersion(String packVersion) {
        this.packVersion = packVersion;
    }

    @Column(name = "create_userid", nullable = false)
    public int getCreateUserid() {
        return this.createUserid;
    }

    public void setCreateUserid(int createUserid) {
        this.createUserid = createUserid;
    }

    @Column(name = "create_username", nullable = false, length = 50)
    public String getCreateUsername() {
        return this.createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time", nullable = false, length = 19)
    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "state", nullable = false)
    public byte getState() {
        return this.state;
    }

    public void setState(byte state) {
        this.state = state;
    }

}