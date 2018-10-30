package com.example.kkali.kannadakali;

public class Word {

    private String mDefaultTranslation;
    private String mKannadaTranslation;
    private int iconId;
    private String colorId;

    Word(String defaultTranslation, String KannadaTranslation,int iconId2,String color) {
        mDefaultTranslation = defaultTranslation;
        mKannadaTranslation = KannadaTranslation;
        iconId = iconId2;
        colorId = color;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getKannadaTranslation() {
        return mKannadaTranslation;
    }

    public int getIconId() {
        return iconId;
    }

    public String getColorId() {
        return colorId;
    }
}
