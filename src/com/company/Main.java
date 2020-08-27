package com.company;

import java.util.Scanner;

public class Main {

    public static double sidesCalc(double firstX, double lastX, double firstY, double lastY) {
        return Math.sqrt((firstX - lastX) * (firstX - lastX) + (firstY - lastY) * (firstY - lastY));
    }

    static void angleCalc(double a, double b, double c) {
        double calcA = Math.round(Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c))) * 100 / 100.0);
        double calcB = Math.round(Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c))) * 100 / 100.0);
        double calcC = Math.round(Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b))) * 100 / 100.0);
        System.out.println("The 3 angles are: " + calcA + " " + calcB + " " + calcC);
    }

    public static void main(String[] args) {

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

        angleCalc(aSide, bSide, cSide);
    }
}
