import java.util.Scanner;

public class areaofellipse {
        public static void main(String[] args) {
            int a;
            int b;
            double pi=3.14, area;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter ur a:");
            a = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter ur b:");
            b = sc1.nextInt();
            area = (pi*a*b);
            System.out.println("ur area is:" + area);
        }
}
