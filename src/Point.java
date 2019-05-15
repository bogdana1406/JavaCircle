import java.util.Scanner;

public class Point {
    public double x;
    public double y;

    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    public void print() {
        System.out.println(this.toString());
    }

    public void move(double a, double b) {
        x = x + a;
        y = y + b;
    }

    public void set(double a, double b) {
        x = a;
        y = b;
    }

    public Point() {
        boolean err;
        do {
            err = false;
            System.out.println("imput x: ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
            } else {
                System.out.println("your input not number, try again ");
                err = true;
            }
        } while (err);

        do {
            err = false;
            System.out.println("input y: ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextDouble()) {
                y = scan.nextDouble();
            } else {
                System.out.println("your input not number, try again ");
                err = true;
            }

        } while (err);
    }

    public Point(double a, double b) {
        x = a;
        y = b;
    }

    public double lenth(Point p) {
        return Math.sqrt( Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    public boolean equalsPoint(Point p) {
        if (this.x == p.x && this.y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}
