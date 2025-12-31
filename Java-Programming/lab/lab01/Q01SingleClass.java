import java.util.Scanner;

public class Q01SingleClass {

    static float CalcArea(float r) {
        return 3.14f * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        float radius = sc.nextFloat();

        sc.close();

        float area = CalcArea(radius);

        System.out.println("Area of circle is " + area);
    }
}
