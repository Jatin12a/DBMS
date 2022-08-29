import java.util.Scanner;

public class volummeofsphere {
    public static void main(String[] args) {
        int r;
        double pi=3.14, volummeofsphere;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur radius:");
        r = sc.nextInt();
        volummeofsphere = pi*r*r*r;
        System.out.println("ur area is:" + volummeofsphere);
    }
}
