package ru.job4j.chess;

/**
 * Created by Анна on 21.11.2017.
 */
public class Bishop extends Figure {

    @Override
    public String toString() {
        return isBlack() ? "B" : "b";
    }

    public Bishop(Cell position) {
        super(position);
    }

    @Override
    public boolean isMoveValid(Cell source, Cell dest, Figure[][] desc) {
        if (source.equals(dest)) {
            return false;
        } else {
            return (source.getX() - source.getY()) == (dest.getX() - dest.getY()) || (source.getX() + source.getY()) == (dest.getX() + dest.getY());
        }
    }


    @Override
    public boolean checkShapesTheWay(Cell source, Cell dest, Figure[][] desc) {
        for (int j = source.getX() + 1, i = dest.getX() + 1; j < desc.length && i < desc.length; j++, i++) {
            if (desc[j][i] != null) {
                return false;

            }
        }
        for (int j = source.getX() - 1, i = dest.getX() + 1; j < -1 && i < desc.length; j--, i++) {
            if (desc[j][i] != null) {
                return false;

            }
        }
        for (int j = source.getX() - 1, i = dest.getX() - 1; j > -1 && i > -1; j--, i--) {
            if (desc[j][i] != null) {
                return false;

            }
        }
        for (int j = source.getX() + 1, i = dest.getX() - 1; j < desc.length && i > -1; j++, i--) {
            if (desc[j][i] != null) {
                return false;

            }
        }
        ///////
        for (int j = source.getY() + 1, i = dest.getX() + 1; j < desc.length && i < desc.length; j++, i++) {
            if (desc[j][i] != null) {
                return false;

            }
        }
        for (int j = source.getY() - 1, i = dest.getX() + 1; j < -1 && i < desc.length; j--, i++) {
            if (desc[j][i] != null) {
                return false;

            }
        }
        for (int j = source.getY() - 1, i = dest.getY() - 1; j > -1 && i > -1; j--, i--) {
            if (desc[j][i] != null) {
                return false;

            }
        }
        for (int j = source.getX() + 1, i = dest.getY() - 1; j < desc.length && i > -1; j++, i--) {
            if (desc[j][i] != null) {
                return false;

            }
        }
        return true;


    }
}



