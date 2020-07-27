package com.myuuutime.entity;

public class apUser {
//    private Integer user_id;
    private String username;
    private String uiphone;
    private String uemail;
    private String ucomment;
    private String ifappointment;
    private String insert_ts;

//    public Integer getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(Integer user_id) {
//        this.user_id = user_id;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUiphone() {
        return uiphone;
    }

    public void setUiphone(String uiphone) {
        this.uiphone = uiphone;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUcomment() {
        return ucomment;
    }

    public void setUcomment(String ucomment) {
        this.ucomment = ucomment;
    }

    public String getIfappointment() {
        return ifappointment;
    }

    public void setIfappointment(String ifappointment) {
        this.ifappointment = ifappointment;
    }

    public String getInsert_ts() {
        return insert_ts;
    }

    public void setInsert_ts(String insert_ts) {
        this.insert_ts = insert_ts;
    }

    @Override
    public String toString() {
        return "apUser{" +
                ", username='" + username + '\'' +
                ", uiphone='" + uiphone + '\'' +
                ", uemail='" + uemail + '\'' +
                ", ucomment='" + ucomment + '\'' +
                ", ifappointment='" + ifappointment + '\'' +
                ", insert_ts='" + insert_ts + '\'' +
                '}';
    }
}
