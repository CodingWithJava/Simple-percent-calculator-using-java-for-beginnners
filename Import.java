import java.util.Scanner;
public class Import {
    public static void main(String[] args) {
        System.out.println("This is an percentage calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the total marks for single subject:");
        int tot = sc.nextInt();
        System.out.print("Please enter your english mark:");
        float eng = sc.nextFloat();
        System.out.print("Please enter your 2lang mark:");
        float lang = sc.nextFloat();
        System.out.print("Please enter your maths mark:");
        float mat = sc.nextFloat();
        System.out.print("Please enter your science mark:");
        float sci = sc.nextFloat();
        System.out.print("Please enter your social science mark:");
        float ssc = sc.nextFloat();
        float sum = eng + lang + mat + sci + ssc;
        int marks = tot * 5;
        float res = sum/marks;
        float fi = res*100;
        System.out.println("You will get "+fi+"%");
        
    }
}
