package com.nakgames.javchess.status;

public enum BoardPosition {
    ONE(0, Axis.Y),
    TWO(1,  Axis.Y),
    THREE(2,  Axis.Y),
    FOUR(3, Axis.Y),
    FIVE(4, Axis.Y),
    SIX(5, Axis.Y),
    SEVEN(6, Axis.Y),
    EIGHT(7, Axis.Y),

    A(0, Axis.X),
    B(1, Axis.X),
    C(2, Axis.X),
    D(3, Axis.X),
    E(4, Axis.X),
    F(5, Axis.X),
    G(6, Axis.X),
    H(7, Axis.X),
    ;

    private final int positionNumber;
    private final Axis axis;
    BoardPosition(int positionNumber, Axis axis) {
        this.positionNumber = positionNumber;
        this.axis = axis;
    }

    public int getPosition()    {
        return positionNumber;
    }

    public Axis getAxis()   {
        return axis;
    }
}
