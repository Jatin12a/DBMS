import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args){
        int r;
        double pi=3.14,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur radius:");
        r=sc.nextInt();
        area = pi*r*r;
        System.out.println("ur area is:"+area);



    }



}
