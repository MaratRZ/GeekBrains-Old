package com.company.homework_01_08.enums;

public enum DotType {
    X, O, EMPTY;

    public static DotType getEnemyType(DotType playerType) {
        return playerType == DotType.X ? DotType.O : DotType.X;
    }
}
