package com.company.homework08.tictactoe.core;

import com.company.homework08.tictactoe.core.domain.MatrixCoordinate;
import com.company.homework08.tictactoe.enums.DotType;

public interface GameService {

    MatrixCoordinate aiTurn();

    void humanTurn(int rowIndex, int columnIndex);

    boolean checkWin(DotType dotType);

    boolean isMapFull();

}
