package ru.job4j.chess;

import ru.job4j.exeptions.MoveNotValidException;
import sun.invoke.empty.Empty;

/**
 * Created by Анна on 15.11.2017.
 */
public class Rook extends Figure {

    public Rook(Cell position) {
        super(position);
    }

    @Override
    public boolean isMoveValid(Cell source, Cell dest, Figure[][] desc) {
        if (source.equals(dest)) {
            return false;
        } else {
            return source.getX() == dest.getX() || source.getY() == dest.getY();
        }
    }

    @Override
    public boolean checkShapesTheWay(Cell source, Cell dest, Figure[][] desc) {
        int xDelta = dest.getX() - source.getX();
        int yDelta = dest.getY() - source.getY();


        if (xDelta != 0) {
            for (int i = source.getX() + 1; i < source.getX() + xDelta; i++) {
                if (desc[i][source.getY()] != null) {
                    return false;
                }
            }
        }

        if (yDelta != 0) {
            for (int i = source.getY() + 1; i < source.getY() + yDelta; i++) {
                if (desc[source.getX()][i] != null) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return isBlack() ? "R" : "r";
    }
}