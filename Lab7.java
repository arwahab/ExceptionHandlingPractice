package Lab07;

import java.util.*;
import java.io.IOException;

class Lab7 {

// Lab 7
// Abdul Wahab
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int fa;

        System.out.println("Enter an integer to be factorialized.");

        fa = scan.nextInt();

        System.out.println(fa + "!" + " " + "=" + " " + f(fa));

    }

    public static long f(long j) { // the method itself, takes 1 param. 

        try {

            if (j <= 1) // takes care of negative #s and zero // base case
            {
                return 1; // default value for anything less than 1!
            }
        } catch (InputMismatchException e) {
            System.out.println("Number can't be Negative.");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong input. Enter an integer.");
        } catch (Exception e) {

        }
        return j * f(j - 1);
    }
}
