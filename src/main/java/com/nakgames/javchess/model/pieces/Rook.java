package com.nakgames.javchess.model.pieces;

import com.nakgames.javchess.status.Color;

public class Rook implements PieceInt {


    public  Rook(Color color)   {

    }

    @Override
    public boolean isLegalMove(int[][] position) {
        return false;
    }

    @Override
    public int[][] getPosition() {
        return new int[0][];
    }

    @Override
    public void setPosition(int[][] position) {

    }

    @Override
    public void capture() {

    }
}
