package com.interfaceclass;
public class Main {
    public static void main(String[] args) {
        Fprint fp = new Fclasprint();
        INorm complex = new Complex(3.5, 7.8);
        System.out.println("Complex:");
        fp.forprintmod(complex.calculateModule());
        fp.forprintnor(complex.calculateNorm());
        System.out.println();
        System.out.println("Vector3D:");
        INorm vector = new Vector3D(8.6, 6.3,5.7);
        fp.forprintmod(vector.calculateModule());
        fp.forprintnor(vector.calculateNorm());
    }
}