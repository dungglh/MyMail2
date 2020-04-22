package com.example.mymail2;

import java.util.Random;

public class MyMailItemModel {
    String name;
    String subject;
    String content;
    String time;
    boolean isCheck;
    int color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean favorite) {
        isCheck = favorite;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public MyMailItemModel(String name, String subject, String content, String time) {
        this.name = name;
        this.subject = subject;
        this.content = content;
        this.time = time;

        isCheck = false;
        Random random = new Random();
        color = random.nextInt();
    }
}
