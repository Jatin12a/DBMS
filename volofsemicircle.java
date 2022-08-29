import java.util.Scanner;

public class volofsemicircle{
        public static void main(String[] args) {
            int r;
            double pi=3.14, vol;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter ur radius:");
            r = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            vol = 2*(pi*r*r*r)/3;
            System.out.println("ur area is:" + vol);
        }
}
