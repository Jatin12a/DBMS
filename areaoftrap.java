import java.util.Scanner;

public class areaoftrap {
        public static void main(String[] args) {
            int a;
            int h;
            int b;
            double area;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter ur a:");
            a = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter ur height:");
            h = sc1.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("enter ur b:");
            b = sc.nextInt();
            area = ((a+b)*h)/2;
            System.out.println("ur area is:" + area);
        }
}
