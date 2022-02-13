public class CheckISBN {


    public static void checkISBNLastDigit(int ISBN1, int ISBN2, int ISBN3, int ISBN4, int ISBN5, int ISBN6,
                                          int ISBN7, int ISBN8, int ISBN9){
        int checkSum = (ISBN1 * 1 + ISBN2 * 2 + ISBN3 * 3 + ISBN4 * 4 + ISBN5 * 5 +
                        ISBN6 * 6 + ISBN7 * 7 + ISBN8 * 8 + ISBN9 * 9) % 11;

        if(checkSum == 10){
            System.out.println("The ISBN-10 number is " + ISBN1 + ISBN2 + ISBN3 + ISBN4 + ISBN5 + ISBN6 +
                               ISBN7 + ISBN8 + ISBN9 + "X");
        }
        else {
            System.out.println("The ISBN-10 number is " + ISBN1 + ISBN2 + ISBN3 + ISBN4 + ISBN5 + ISBN6 + +
                               ISBN7 + ISBN8 + ISBN9 + checkSum);
        }

    }
}
