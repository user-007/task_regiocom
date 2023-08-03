package com.regiocom.task_regiocom.Classes;

public class Build {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPicture_name() {
        return picture_name;
    }

    public void setPicture_name(String picture_name) {
        this.picture_name = picture_name;
    }

    public String getPic_data() {
        return pic_data;
    }

    public void setPic_data(String pic_data) {
        this.pic_data = pic_data;
    }

    public String getMeta_data() {
        return meta_data;
    }

    public void setMeta_data(String meta_data) {
        this.meta_data = meta_data;
    }

    public Build(String id, String picture_name, String pic_data, String meta_data) {
        this.id = id;
        this.picture_name = picture_name;
        this.pic_data = pic_data;
        this.meta_data = meta_data;
    }

    private String id;
    private String picture_name;
    private String pic_data;
    private String meta_data;

}
