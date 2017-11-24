package ru.job4j.chess;


import ru.job4j.exeptions.*;

/**
 * Created by Анна on 11.11.2017.
 */
public class Board {

    private final int numberFigeres = 32;


    private Figure[] figures = new Figure[numberFigeres];

    public Figure[][] desc = new Figure[8][8];


    public void add(Figure figure) {
        this.desc[figure.getPosition().getX()][figure.getPosition().getY()] = figure;

    }

    public void move(Cell source, Cell dest) throws ChessExeption {
        if (dest != null && source != null) {
            Figure figure = desc[source.getX()][source.getY()];
          if (!figure.checkShapesTheWay(source, dest, desc))  throw new OccupiedWayException();
       if (!figure.isMoveValid(source, dest, desc)) throw new MoveNotValidException();
                desc[source.getX()][source.getY()] = null;
                desc[dest.getX()][dest.getY()] = figure;
   //         }

//            else {
//                throw new CellExeption();
//            }

        }
    }


    public static void main(String[] args) throws ChessExeption {
        Board board = new Board();
        Figure figure = new Rook(new Cell(0, 0));
        Figure figure1 = new Queen(new Cell(0, 3));
        Figure figure2 = new Bishop(new Cell(0, 2));
        board.add(figure);
        board.add(figure1);
        board.add(figure2);
        board.draw();
      // board.move(new Cell(0, 0), new Cell(3,0));
        board.move(new Cell(0, 2), new Cell(1, 3));
        board.move(new Cell(0, 3), new Cell(0, 4));
        board.move(new Cell(0, 4), new Cell(2, 4));
        board.move(new Cell(1, 3), new Cell(2, 4));
        board.move(new Cell(2, 4), new Cell(0, 6));
       // board.move(new Cell(1, 1), new Cell(2, 2));
     //   board.move(new Cell(2, 2), new Cell(3, 3));
    //    board.move(new Cell(3, 3), new Cell(1, 6));
        board.draw();
    }

    public void draw() {
        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < desc.length; ) {
            System.out.print(++i + " ");
        }
        for (int i = 0; i < desc.length; i++) {
            System.out.println();
            System.out.print(i + 1 + " ");
            for (int j = 0; j < desc.length; j++) {
                System.out.print(desc[i][j] != null ? desc[i][j] : '·');
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
