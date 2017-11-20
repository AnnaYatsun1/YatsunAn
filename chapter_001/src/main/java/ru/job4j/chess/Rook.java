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
    public boolean checkShapesTheWay(Cell source, Cell dest, Figure[][] desc) throws MoveNotValidException {
        for (int i = source.getX(); i <= dest.getX(); i++) {
            for (int j = source.getY(); j < dest.getY(); j++) {
                if (desc[i][j] != null) {
                    desc[i][j]=desc[source.getX()][dest.getY()];
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