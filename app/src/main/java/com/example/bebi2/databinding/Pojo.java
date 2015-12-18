package com.example.bebi2.databinding;

/**
 * Created by bebi2 on 12/18/2015.
 */
public class Pojo {
    String imageURL;
    String name;

    public Pojo(String imageURL, String name) {
        this.imageURL = imageURL;
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
