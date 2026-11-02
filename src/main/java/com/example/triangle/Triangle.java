package com.example.triangle;

public class Triangle {
    public enum Type {
        EQUILATERAL,
        ISOSCELES,
        SCALENE,
        INVALID
    }

    public static Type classify(int sideA, int sideB, int sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return Type.INVALID;
        }

        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            return Type.INVALID;
        }

        if (sideA == sideB && sideB == sideC) {
            return Type.EQUILATERAL;
        }

        if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return Type.ISOSCELES;
        }

        return Type.SCALENE;
    }
}
