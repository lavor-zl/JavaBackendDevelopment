package com.lavor.springboot.sql.jdbc;

/**
 * Created by lei.zeng on 2017/8/2.
 */
public class User {
    private Integer id;
    private String name;
    public User() {
    }
    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
