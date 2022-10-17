package HomeWork_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = n.nextInt();

        num = (num * (num + 1)) / 2;
        System.out.printf("Your number is : %d", num);
        n.close();
    }
}
