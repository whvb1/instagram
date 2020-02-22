package com.example.instagram.Models;

import android.graphics.Bitmap;

public class post {
    private int id;
    private String caption;
    private Bitmap imageBitMap;


    public post(int id, String caption, Bitmap imageBitMap) {
        this.id = id;
        this.caption = caption;
        this.imageBitMap = imageBitMap;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Bitmap getImageBitMap() {
        return imageBitMap;
    }

    public void setImageBitMap(Bitmap imageBitMap) {
        this.imageBitMap = imageBitMap;
    }
}
