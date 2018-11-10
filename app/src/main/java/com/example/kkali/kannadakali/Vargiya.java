package com.example.kkali.kannadakali;

public class Vargiya
{
    private String vargiyaWords;
    private int imageId;
    private String color;

    Vargiya(String alphaWords,int imageId,String color)
    {
        this.vargiyaWords = alphaWords;
        this.imageId = imageId;
        this.color = color;
    }

    public String getAlphaWords()
    {
        return vargiyaWords;
    }

    public int getImageId()
    {
        return imageId;
    }

    public String getColor()
    {
        return color;
    }

}
