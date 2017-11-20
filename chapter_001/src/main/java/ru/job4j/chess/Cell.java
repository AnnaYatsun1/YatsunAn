package ru.job4j.chess;

/**
 * Created by Анна on 11.11.2017.
 */
public class Cell {

  private int  x, y;




    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y) {

        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cell)) return false;

        Cell cell = (Cell) o;

        if (getX() != cell.getX()) return false;
        return getY() == cell.getY();
    }

    @Override
    public int hashCode() {
        int result = getX();
        result = 31 * result + getY();
        return result;
    }

}
