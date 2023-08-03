package com.regiocom.task_regiocom.Classes;

import java.util.Date;

//Aufbau des News Klass
public class News {
    public News(String id, String title, String text, String link, Date valid_from, Date valid_to, boolean allowed) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.link = link;
        this.valid_from = valid_from;
        this.valid_to = valid_to;
        this.allowed = allowed;
    }

    private String id;
    private String title;
    private String text;
    private String link;
    private Date valid_from;
    private Date valid_to;
    boolean allowed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String gettext() {
        return text;
    }

    public void settext(String text) {
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getValid_from() {
        return valid_from;
    }

    public void setValid_from(Date valid_from) {
        this.valid_from = valid_from;
    }

    public Date getValid_to() {
        return valid_to;
    }

    public void setValid_to(Date valid_to) {
        this.valid_to = valid_to;
    }

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }
}
