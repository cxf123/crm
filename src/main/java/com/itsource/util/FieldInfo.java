package com.itsource.util;

public class FieldInfo {

    private String filed;
    private String title;

    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FieldInfo(String filed, String title) {
        this.filed = filed;
        this.title = title;
    }
}
