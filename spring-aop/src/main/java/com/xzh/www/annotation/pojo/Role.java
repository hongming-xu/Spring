package com.xzh.www.annotation.pojo;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-11 15:11
 **/
public class Role {

    private Long id;
    private String roleName;
    private String note;

    public Role() {
    }

    public Role(Long id, String roleName, String note) {
        this.id = id;
        this.roleName = roleName;
        this.note = note;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
