package com.example.kkali.kannadakali;

public class Swaragalu
{
    private String alphaWords;
    private int imageId;
    private String color;

    Swaragalu(String alphaWords,int imageId,String color)
    {
        this.alphaWords = alphaWords;
        this.imageId = imageId;
        this.color = color;
    }

    public String getAlphaWords()
    {
        return alphaWords;
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
