package com.geekbrains.nasalib.model.entity;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Link {
    @Expose
    @SerializedName("href")
    private String href;
}
