package com.example.che.rcyclerviewcodingflowfirst;

public class ExampleIetm {
    private int mImageResource;
    private String mText1;
    private String mText2;

    public ExampleIetm(int imageResource, String text1, String text2) {
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
    }

    public void chengeText1(String text) {
        mText1 = text;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }
}
