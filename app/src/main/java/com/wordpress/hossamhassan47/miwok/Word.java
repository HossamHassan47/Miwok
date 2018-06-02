package com.wordpress.hossamhassan47.miwok;

/**
 * Created by Hossam on 2/22/2018.
 */

public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    private int mImageResouceId;
    private int mAudioResouceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResouceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResouceId = audioResouceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResouceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResouceId = imageResourceId;
        mAudioResouceId = audioResouceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResouceId;
    }

    public int getAudioResourceId() {
        return mAudioResouceId;
    }

    public boolean hasImage() {
        return mImageResouceId > 0;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResouceId +
                ", mImageResourceId=" + mImageResouceId +
                '}';
    }
}
