package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner navn = new Scanner (System.in);
    System.out.println("Enter username");
    String username = navn.nextLine();
    System.out.println("Your username is "+ username);
    }
}
