package com.slick.memories;

/**
 * Created by Aleksandar on 18.8.2016.
 */
public class Cell {
    protected boolean mCellOpen;
    protected int mContent;
    protected int mBackground;

    public Cell(boolean cellOpen, int content, int background) {
        mCellOpen = cellOpen;
        mContent = content;
        mBackground = background;
    }

    public int getContent() {
        return mContent;
    }

    public void setContent(int content) {
        mContent = content;
    }

    public boolean isCellOpen() {
        return mCellOpen;
    }

    public void setmCellOpen(boolean cellOpen) {
        mCellOpen = cellOpen;
    }


    public int getmBackground() {
        return mBackground;
    }

    public void setmBackground(int mBackground) {
        this.mBackground = mBackground;
    }


}
