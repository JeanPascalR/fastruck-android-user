package com.fastruck.fastruck.model;

/**
 * Created by jean-pascal on 09/02/2015.
 */
public class Foodtruck {

    private final String name;

    private final String description;

    private final int imageResourceId;

    public Foodtruck() {
        name = new String();
        description = new String();
        imageResourceId = -1;
    }

    public Foodtruck(String name, String description, int imgResourecId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imgResourecId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}
