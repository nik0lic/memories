package com.slick.memories;

/**
 * Created by Aleksandar on 18.8.2016.
 */
public class HighScore {
    protected String mName;
    protected long mTime;
    protected String mLevel;

    public HighScore(long time, String name, String level) {
        mTime = time;
        mName = name;
        mLevel = level;
    }

    public String getName() {
        return mName;
    }

    public long getTime() {
        return mTime;
    }

    public String getLevel() {
        return mLevel;
    }
}
