package ru.job4j.chess;

/**
 * Created by Анна on 20.11.2017.
 */
public class Queen extends Figure {
    @Override
    public String toString() {
        return isBlack() ? "Q" : "q";
    }


    public Queen(Cell position) {
        super(position);
    }
    @Override
    public boolean isMoveValid(Cell source, Cell dest, Figure[][] desc) {
        if (source.equals(dest)) {
            return false;
        }

    return  source.getX() == dest.getX() || source.getY() == dest.getY() || (source.getX() - source.getY()) == (dest.getX() - dest.getY()) || (source.getX() + source.getY()) == (dest.getX() + dest.getY());
      //  return (((source.getX() - dest.getX()) == (source.getY() - dest.getY())) ||  ((source.getX() - dest.getX()) == (dest.getY() - source.getY())) || (source.getX() == dest.getX()) || (source.getY() == dest.getY()) && !((source.getX()==dest.getX()) && (source.getY()==dest.getY())));
      //  return source.getY()== dest.getY() && source.getX()!= dest.getX() || (source.getX()-source.getY()==(dest.getX()-dest.getY())||(source.getX()+source.getY()==(dest.getX()+dest.getY())));
    }



    @Override
    public boolean checkShapesTheWay(Cell source, Cell dest, Figure[][] desc) {
        for (int i = source.getX(); i <dest.getX() ; i++) {
            for (int j = source.getY(); j <dest.getY() ; j++) {
                if (desc[i][j] != null) {
                    return false;
                }

            }
        }
        return true;
    }

}
