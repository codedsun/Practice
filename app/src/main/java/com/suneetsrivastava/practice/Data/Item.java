package com.suneetsrivastava.practice.Data;

/**
 * Created by suneetsrivastava on 12/01/18.
 */

public class Item {
    private int id;
    private String text;

    Item(int id, String text){
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
