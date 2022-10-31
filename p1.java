package assignment1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class p1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("number.in"));
        PrintWriter outFile = new PrintWriter("result");
        int num = inFile.nextInt() ;
        while (num!=0) {
            boolean arm;
            boolean per;
            int sum1 = 0;
            int sum2 = 0;
            String n = num + "";
            for (int i = 0; i < n.length(); i++) {
                sum1 += Math.pow(Integer.parseInt(n.charAt(i) + ""), n.length());
            }
            if (sum1 == num) {
                arm = true;
            } else {
                arm = false;
            }

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum2 += i;
                }
            }

            if (sum2 == num) {
                per = true;
            } else {
                per = false;
            }

            if (arm && per) {
                outFile.println(num + " is an Armstrong number and it is a perfect number. ");
            } else if (arm) {
                outFile.println(num + " is an Armstrong number but it is not a perfect number. ");
            } else if (per) {
                outFile.println(num + " is not an Armstrong number but it is a perfect number. ");
            } else {
                outFile.println(num + " is not an Armstrong number and it is not a perfect number. ");
            }
            num = inFile.nextInt();
        }
        outFile.close();
    }
}
