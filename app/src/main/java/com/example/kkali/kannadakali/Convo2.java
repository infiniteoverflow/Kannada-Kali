package com.example.kkali.kannadakali;

public class Convo2 {

    private int image1Id;
    private int image2Id;
    private String kannadaText1;
    private String kannadaText2;
    private String englishText1;
    private String englishText2;

    Convo2(int image1Id,int image2Id,String kannadaText1,String kannadaText2,String englishText1,String englishText2)
    {
        this.image1Id = image1Id;
        this.image2Id = image2Id;
        this.kannadaText1 = kannadaText1;
        this.kannadaText2 = kannadaText2;
        this.englishText1 = englishText1;
        this.englishText2 = englishText2;
    }

    public int getImage1Id() { return image1Id;}
    public int getImage2Id() { return image2Id;}
    public String getKannadaText1() { return kannadaText1;}
    public String getKannadaText2() { return kannadaText2;}
    public String getEnglishText1() { return englishText1;}
    public String getEnglishText2() { return englishText2;}

}
