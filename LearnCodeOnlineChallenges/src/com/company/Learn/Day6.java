package com.company.Learn;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        int freeBytes = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current number of free bytes available : ");
        int f = scanner.nextInt();
        System.out.print("Enter the current number of  bytes used : ");
        int u = scanner.nextInt();
        System.out.print("Enter the bytes of file deleted : ");
        int o = scanner.nextInt();
        System.out.print("Enter the bytes of new file : ");
        int n = scanner.nextInt();

        freeBytes = ((f+u) -((u-o)+n));
        System.out.println("Free bytes on the floppy disk : "+freeBytes);
    }
}
