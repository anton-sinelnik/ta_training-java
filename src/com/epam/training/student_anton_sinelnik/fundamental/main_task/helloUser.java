package com.epam.training.student_anton_sinelnik.fundamental.main_task;

import java.util.Scanner;

public class helloUser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name");
        String name = s.nextLine();
        System.out.println("Hello "+name);
    }

}
