package ru.job4j.condition;


public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;//x0,xk
        this.y = y;//y0, yk result=Math.sqrt(  Math.pow(xk-x0)-yl-y0)
    }

    public double distanceTo( Point that) {
        double result = Math.sqrt(
                Math.pow(that.x  - this.x, 2) + Math.pow(that.y - this.x, 2)
        );
        return result;
    }
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        // сделаем вызов метода
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }


}
