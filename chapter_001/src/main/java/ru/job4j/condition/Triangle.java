package ru.job4j.condition;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private final double EXIST_EPSILON = 0.001;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    /**
     * Метод должен вычислять расстояние между точками left и right.
     * <p>
     * Для вычисления расстояния использовать формулу.
     * √(xb - xa)^2 + (yb - ya)^2
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     * <p>
     * ^ - степень.
     *
     * @param left  Точка слева
     * @param right Точка с права.
     * @return расстояние между точками left и right.
     */
    public double distance(Point left, Point right) {
        return Math.sqrt(Math.pow((left.getX() - right.getX()), 2) + Math.pow((left.getY() - right.getY()), 2));
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (ab + ac + bc) / 2
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Перимент.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод должен вычислить прощадь треугольканива.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть прощадь, если треугольник существует или -1.
     */
    public double area() {

        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
        double rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));

        return rsl < EXIST_EPSILON ? -1 : rsl;
    }

}
