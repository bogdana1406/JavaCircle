import java.util.Scanner;

public class Circle {

    public double r;
    public Point c;

    public String toString() {
        return "center is: " + c + "radius is: " + r;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public void move(double a, double b) {
        c.move(a, b);
    }

    public void set(double a, double b, double m) {
        c.set(a, b);
        r = m;
    }

    Circle() {
        System.out.println("set center of circle: ");
        c = new Point();
        boolean err;

        do {
            err = false;
            System.out.println("set radius: ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextDouble()) {
                r = scan.nextDouble();
                if (r < 0) {
                    System.out.println("radius mast be more then 0");
                    err = true;
                }

            } else {
                System.out.println("your input is not a number, try again");

            }

        } while (err);
    }

    Circle(double a, double b, double m) {
        c = new Point(a, b);
        //c.set(a, b);
        r = m;
    }

    public double lenght (Point p) {
        return 2*Math.PI*r;
    }

    public boolean equalsCircle(Circle o) {
        if (this.r == o.r && c.equalsPoint(o.c)) {
            return true;
        } else {
            return false;
        }
    }
}
