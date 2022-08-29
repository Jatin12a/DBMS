import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args){
        int base;
        int height;
        float area;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("enter base:");
        base = s1.nextInt();
        System.out.println("enter height");
        height=s2.nextInt();
        area = (base*height)/2;
        System.out.println("ur area is:"+area);

    }
}
