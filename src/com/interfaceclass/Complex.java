package com.interfaceclass;

class Complex implements INorm {
    private double x;
    private double y;


    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }


    @Override
    public double calculateNorm() {
        return Math.pow(calculateModule(), 2);
    }

    @Override
    public double calculateModule() {
        return Math.sqrt(x * x + y * y);
    }
}
