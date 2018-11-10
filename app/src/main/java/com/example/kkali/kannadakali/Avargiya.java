package com.example.kkali.kannadakali;

public class Avargiya
{
    private String avargiyaWords;
    private int imageId;
    private String color;

    Avargiya(String alphaWords,int imageId,String color)
    {
        this.avargiyaWords = alphaWords;
        this.imageId = imageId;
        this.color = color;
    }

    public String getAlphaWords()
    {
        return avargiyaWords;
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
