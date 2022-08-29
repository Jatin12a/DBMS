import java.util.Scanner;

public class volumeofcube {
    public static void main(String[] args) {
        int L;
        double volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur Lenght:");
        L = sc.nextInt();
        volume = L*L*L;
        System.out.println("ur area is:" + volume);
    }
}
