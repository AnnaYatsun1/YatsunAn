package ru.job4j.chess;


import ru.job4j.exeptions.MoveNotValidException;

import java.util.Arrays;

/**
 * Created by Анна on 11.11.2017.
 */
public abstract class Figure {
    private Cell position;

    private boolean black;

    public Figure(Cell position) {
        this.position = position;
    }

    public abstract boolean isMoveValid(Cell source, Cell dist, Figure[][] desc);
    public abstract boolean checkShapesTheWay(Cell source, Cell dest,Figure[][] desc  ) throws MoveNotValidException;

    public Cell getPosition() {

        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public boolean isBlack() {

        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }

}
