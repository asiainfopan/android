package com.example.panx.listview;

/**
 * Created by panx on 2017/10/21.
 */

public class ListCellData {

    private String username = "lily";
    private String sex = "男";
    private int age = 0;

    public ListCellData(String username, String sex, int age) {
        this.username = username;
        this.sex = sex;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return getUsername();
    }
}
