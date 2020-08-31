package com.S2kael.Unity;

public class User{
    String name;
    String id;


    public User(){

    }

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

}