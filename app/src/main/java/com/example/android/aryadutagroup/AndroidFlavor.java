package com.example.android.aryadutagroup;

public class AndroidFlavor {

    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    public String mVersionName;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    public String mVersionNumber;

    // Drawable resource ID
    public int mImageResourceId;



    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public AndroidFlavor(String vName, String vNumber, int imageResourceId)
    {
        mVersionName = vName;
        mVersionNumber = vNumber;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the name of the Android version
     */
    public String getVersionName() {
        return mVersionName;
    }

    /**
     * Get the Android version number
     */
    public String getVersionNumber() {
        return mVersionNumber;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }



}
