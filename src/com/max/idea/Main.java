package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(in).useLocale(Locale.ENGLISH);;
        System.out.println("Input array length");
        int n = inp.nextInt();
        if (n<1) {
            System.out.println("Incorrect input");
            return;
        }

        double[] Arr;
        Arr = new double[n];
        double r;
        double av=0;
        System.out.println("Input array contents");
        for (int i=0; i<n; i++) {
            r = inp.nextDouble();
            Arr[i]=r;
            av+=r;
        }
        av/=n;
        System.out.println("Array multiplied by average: ");

        for (int j=0; j<n; j++) {
            r=Arr[j] * av;
            System.out.printf("%f\n", r);
        }

        return;

    }
}