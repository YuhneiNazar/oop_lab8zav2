package com.interfaceclass;

import java.text.DecimalFormat;

public class Fclasprint implements Fprint {
    public void forprintmod(double m) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Module: " + df.format(m));
    }
    public void forprintnor(double n) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Norm: " + df.format(n));
    }
}
