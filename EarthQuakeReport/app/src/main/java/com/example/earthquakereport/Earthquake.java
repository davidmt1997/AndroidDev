package com.example.earthquakereport;

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    private String mUrl;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){ return mMagnitude;}

    public String getLocation(){ return mLocation;}

    public long getTimeInMilliseconds() { return mTimeInMilliseconds;}

    public String getUrl() {return mUrl;}
}
