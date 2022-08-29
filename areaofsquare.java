import java.util.Scanner;

public class areaofsquare {
    public static void main(String[] args) {
        int L;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur Lenght:");
        L = sc.nextInt();
        area = L * L;
        System.out.println("ur area is:" + area);
    }
}