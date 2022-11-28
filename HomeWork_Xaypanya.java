import java.util.Scanner;

public class HomeWork_Xaypanya {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Insert First Number: ");
        int FirstNumber = Sc.nextInt();
        System.out.print("Insert Second Number: ");
        int SecondNumber = Sc.nextInt();
        int sum = FirstNumber + SecondNumber;
        System.out.println(" = " + sum);
    }
}