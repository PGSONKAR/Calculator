import java.util.Scanner;

public class Divison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = (a / b) / c;
        System.out.println("The result of the divison is: " + result);
    }
}
