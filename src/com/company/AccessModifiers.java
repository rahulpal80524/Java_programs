package com.company;

import java.util.Scanner;

public class AccessModifiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Cylinder cylinder = new Cylinder(10,2);//by Constructor
//        Cylinder cylinder = new Cylinder();
//       cylinder.setH(1);
//       cylinder.setR(1);

        System.out.println(cylinder.VolumeOfCylineder());
        System.out.println(cylinder.SurfaceArea());

        Rectangle1 rectangle1 = new Rectangle1();
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWeight());
    }
}

class Cylinder {
    private int R;
    private int H;


    public Cylinder(int h, int r) {
        R = r;
        H = h;
    }

    public int getR() {
        return R;
    }

    public int setR(int r) {
        R = r;
        return r;
    }

    public int getH() {
        return H;
    }

    public int setH(int h) {
        H = h;
        return h;
    }

    public float VolumeOfCylineder(){
        return (float) (H*(R*R)*Math.PI);

    }
    public float SurfaceArea() {
        return (float) ((2*Math.PI*R*R) + (2*Math.PI*R*H));
    }
}

class Rectangle1{
    private int length;
    private int weight;

    public Rectangle1() {
        this.length = 4;
        this.weight = 5;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }
}