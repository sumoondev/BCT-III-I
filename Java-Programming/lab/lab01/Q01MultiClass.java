import java.util.Scanner;

public class Q01MultiClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        float radius = sc.nextFloat();

        sc.close();

        Circle c = new Circle(radius);

        float area = c.calcArea();

        System.out.println("Area of Circle: " + area);
    }
}

class Circle {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    float calcArea() {
        return 3.14f * radius * radius;
    }
}