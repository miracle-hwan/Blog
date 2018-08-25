package com.miraclehwan.aboutrecyclerview;

/**
 * Created by miraclehwan on 2018-07-13.
 */

public class MyData {

    String text;
    int viewType;

    public MyData(String text, int viewType) {
        this.text = text;
        this.viewType = viewType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }
}
