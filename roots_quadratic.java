// Day 6 : Roots of Quadratic Equation

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class roots_quadratic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int root = y*y - 4*x*z;
        double roots = sqrt(root);
        if (root>0) {
            System.out.println("Real and Distinct");
            System.out.println(((-y - (int) roots) / (2*x)) + " " + ((-y + (int) roots) / (2*x)));
        } else if (root<0) {
            System.out.println("Imaginary");
        } else {
            System.out.println("Real and Equal");
            System.out.println(((-y + (int) roots) / (2*x)) + " " + ((-y - (int) roots) / (2*x)));
        }
    }

}
