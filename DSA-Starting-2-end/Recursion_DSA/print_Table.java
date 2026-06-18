package Recursion_DSA;

import java.util.Scanner;

public class print_Table {
    public static void printTable(int i, int n){

        if(i > 10) {
            return;
        }
        System.out.println(n + " x " + i + " = " + (n * i));
        printTable(i + 1, n);
    
    }
    public static void main(String[] args) {
        // write a table program using recrusion take input number n and print its table
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printTable(1, num);
    }
    
}