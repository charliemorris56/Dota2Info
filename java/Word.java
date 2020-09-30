package com.example.android.dota2info;

import java.net.FileNameMap;

/**
 * Created by Time Travling Gamer on 25/09/2017.
 */

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultName;
    private String mLoreName;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private String mClassResource = "ClarityActivity";

    public Word(String defaultName, String loreName) {
        mDefaultName = defaultName;
        mLoreName = loreName;
    }

    public Word(String defaultName, String loreName, int imageResourceId) {
        mDefaultName = defaultName;
        mLoreName = loreName;
        mImageResourceId= imageResourceId;
    }

    public Word(String defaultName, String loreName, int imageResourceId, String classResource) {
        mDefaultName = defaultName;
        mLoreName = loreName;
        mImageResourceId= imageResourceId;
        mClassResource = classResource;
    }

    public String getDefaultName()   {
        return mDefaultName;
    }

    public  String getLoreName()    {
        return mLoreName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage()   {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public String getClassResource()  {
        return mClassResource;
    }
}
