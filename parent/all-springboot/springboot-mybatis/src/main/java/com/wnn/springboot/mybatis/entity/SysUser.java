package com.wnn.springboot.mybatis.entity;

public class SysUser {
    @Override
    public String toString() {
        return "SysUser{" +
                "id='" + id + '\'' +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", pswd='" + pswd + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lastLoginTime='" + lastLoginTime + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String id;

    public String nickName;

    public String email;

    public String pswd;

    public String createTime;

    public String lastLoginTime;

    public String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
