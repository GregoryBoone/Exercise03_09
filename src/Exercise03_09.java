import java.util.Scanner;

public class Exercise03_09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CheckISBN myObject = new CheckISBN();

        System.out.println("Enter the first 9 digits of an ISBN as integer");
        int ISBN1 = scanner.nextInt();
        int ISBN2 = scanner.nextInt();
        int ISBN3 = scanner.nextInt();
        int ISBN4 = scanner.nextInt();
        int ISBN5 = scanner.nextInt();
        int ISBN6 = scanner.nextInt();
        int ISBN7 = scanner.nextInt();
        int ISBN8 = scanner.nextInt();
        int ISBN9 = scanner.nextInt();

        myObject.checkISBNLastDigit(ISBN1, ISBN2, ISBN3, ISBN4, ISBN5, ISBN6, ISBN7, ISBN8, ISBN9);
    }
}
