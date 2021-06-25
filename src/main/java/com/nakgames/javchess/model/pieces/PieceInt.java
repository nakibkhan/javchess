package com.nakgames.javchess.model.pieces;

public interface PieceInt {
    boolean isLegalMove(int [][] position);
    int [][] getPosition();
    void setPosition(int [][] position);
    void capture();
}
