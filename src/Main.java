public class Main {
    public static void main(String[] args) {


        Circle o2 = new Circle(3, 5, 8);

        o2.print();

        Circle o1 = new Circle();
        o1.print();

        if (o1.equalsCircle(o2)) {
            System.out.println("they are equals");
        } else {
            System.out.println("circles not equals");
        }
    }
}
