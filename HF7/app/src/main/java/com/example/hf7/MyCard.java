package com.example.hf7;

public class MyCard {

    private String title;
    private String name;
    private Integer image;

    public MyCard(String title, String name, Integer image) {
        this.title = title;
        this.name = name;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
