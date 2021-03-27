package com.company.homework08.tictactoe.enums;

public enum DotType {
    X, O, EMPTY;

    public static DotType getEnemyType(DotType playerType) {
        return playerType == DotType.X ? DotType.O : DotType.X;
    }
}
