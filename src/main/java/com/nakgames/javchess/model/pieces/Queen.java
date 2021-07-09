package com.nakgames.javchess.model.pieces;

import com.nakgames.javchess.status.Color;

public class Queen extends Piece implements PieceInt {
    public Queen(Color color) {
        super(color);
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
