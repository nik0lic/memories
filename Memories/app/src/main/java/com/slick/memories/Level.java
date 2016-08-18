package com.slick.memories;

/**
 * Created by Aleksandar on 18.8.2016.
 */
public class Level {
    protected int mDimensionX, mDimensionY, mMatrixCell;

    public Level(int dimensionX, int dimensionY, int matrixCell) {
        mDimensionX = dimensionX;
        mDimensionY = dimensionY;
        mMatrixCell = matrixCell;
    }

    public int getDimensionX() {
        return mDimensionX;
    }

    public int getDimensionY() {
        return mDimensionY;
    }

    public int getMatrixCell() {
        return mMatrixCell;
    }

    public void setMatrixCell(int matrixCell) {
        mMatrixCell = matrixCell;
    }

    public boolean isValidate (int dimensionX, int dimensionY) {
        return dimensionX > 0 && dimensionY > 0 && (dimensionX % 2 == 0 || dimensionY % 2 == 0);
    }
}
