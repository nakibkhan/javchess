package com.nakgames.javchess.model.pieces;

import com.nakgames.javchess.status.BoardPosition;
import com.nakgames.javchess.status.Color;

import java.util.List;

public class Board {
    PieceInt[][] positions = new PieceInt[8][8];
    List<PieceInt> pieceList;

    public Board()   {
        initializePiecePositions();
    }

    private void initializePiecePositions() {
        positions[BoardPosition.A.getPosition()][BoardPosition.ONE.getPosition()] = new Rook(Color.WHITE);
        positions[BoardPosition.B.getPosition()][BoardPosition.ONE.getPosition()] = new Knight(Color.WHITE);
        positions[BoardPosition.C.getPosition()][BoardPosition.ONE.getPosition()] = new Rook(Color.WHITE);
        positions[BoardPosition.D.getPosition()][BoardPosition.ONE.getPosition()] = new Rook(Color.WHITE);
        positions[BoardPosition.E.getPosition()][BoardPosition.ONE.getPosition()] = new Rook(Color.WHITE);
        positions[BoardPosition.F.getPosition()][BoardPosition.ONE.getPosition()] = new Rook(Color.WHITE);
        positions[BoardPosition.G.getPosition()][BoardPosition.ONE.getPosition()] = new Rook(Color.WHITE);
        positions[BoardPosition.H.getPosition()][BoardPosition.ONE.getPosition()] = new Rook(Color.WHITE);
    }


}
