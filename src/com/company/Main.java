package com.company;

import java.util.Scanner;

public class Main {

    public static double sidesCalc(double firstX, double lastX, double firstY, double lastY) {
        return Math.sqrt((firstX - lastX) * (firstX - lastX) + (firstY - lastY) * (firstY - lastY));
    }

    static double angleCalc(double a, double b, double c) {
        return Math.round(Math.toDegrees(Math.acos((Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) / (-2 * b * c))) * 100 / 100.0);
    }

    static void allAngleCalc(double a, double b, double c) {
        double calcA = angleCalc(a, b, c);
        double calcB = angleCalc(b, a, c);
        double calcC = angleCalc(c, b, a);
        System.out.println("The 3 angles are: " + calcA + " " + calcB + " " + calcC);
    }

    static void convertCoordsToAngles() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double aSide = sidesCalc(x2, x3, y2, y3);
        double bSide = sidesCalc(x1, x3, y1, y3);
        double cSide = sidesCalc(x1, x2, y1, y2);

        allAngleCalc(aSide, bSide, cSide);
    }

    public static void main(String[] args) {
        convertCoordsToAngles();
    }
}
