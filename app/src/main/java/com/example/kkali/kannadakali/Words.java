package com.example.kkali.kannadakali;

public class Words
{
    private String englishWords;
    private String kannadaWords;

    Words(String eWords,String kWords)
    {
        englishWords = eWords;
        kannadaWords = kWords;
    }

    public String getEnglishWords()
    {
        return englishWords;
    }


    public String getKannadaWords()
    {
        return kannadaWords;
    }

}
