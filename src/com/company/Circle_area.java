package com.company;

import java.util.Scanner;

import java.util.*;
public class Circle_area {

    public static void main(String[] args) {
	// write your code here
        float pi= (float) 3.1415;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle");
        float radius = sc.nextFloat();
        float Area= pi*(radius*radius);
        System.out.println(radius);
        System.out.println(Area);

    }
}
