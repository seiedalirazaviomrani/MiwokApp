package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE = -1;
    private String mEnglishWord;
    private String mTranslatedWord;
    private int mImageResourceId = NO_IMAGE;
    private int mAudioResourceId;

    public Word(String englishWord, String translatedWord, int audioResourceId) {
        this.mEnglishWord = englishWord;
        this.mTranslatedWord = translatedWord;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String englishWord, String translatedWord, int imageResourceId, int audioResourceId) {
        this.mEnglishWord = englishWord;
        this.mTranslatedWord = translatedWord;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public void setEnglishWord(String englishWord) {
        this.mEnglishWord = englishWord;
    }

    public String getEnglishWord() {
        return this.mEnglishWord;
    }

    public void setTranslatedWord(String translatedWord) {
        this.mTranslatedWord = translatedWord;
    }

    public String getTranslatedWord() {
        return this.mTranslatedWord;
    }

    public void setImageResouceId(int imageResouceId) {
        this.mImageResourceId = imageResouceId;
    }

    public int getImageResourceId() {
        return this.mImageResourceId;
    }

    public void setAudioResourceId(int audioResourceId) {
        this.mAudioResourceId = audioResourceId;
    }

    public int getAudioResourceId() {
        return this.mAudioResourceId;
    }
}
