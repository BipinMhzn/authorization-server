package com.example.authenticationserver.entity;

import javax.persistence.Entity;

@Entity(name = "PERMISSION")
public class Permission extends BaseIdEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
