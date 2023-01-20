package org.example;

public class Triangle {
    public static boolean isRectangular(int sideA, int sideB, int hypotenuse){
        return (sideA * sideA + sideB * sideB == hypotenuse * hypotenuse);
    }
}
