import java.util.Scanner;
public class areaofcone {
    public static void main(String[] args) {
        int r;
        int h;
        double pi = 3.14, area;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter ur radius:");
        r = sc.nextInt();
        System.out.println("enter ur height:");
        h = sc1.nextInt();
        area = (pi*r*r*h)/3;
        System.out.println("ur area is:" + area);
    }
}