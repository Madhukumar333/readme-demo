package com.example.triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void equilateralTriangle() {
        assertEquals(Triangle.Type.EQUILATERAL, Triangle.classify(5, 5, 5));
    }

    @Test
    void isoscelesTriangle() {
        assertEquals(Triangle.Type.ISOSCELES, Triangle.classify(4, 4, 6));
    }

    @Test
    void scaleneTriangle() {
        assertEquals(Triangle.Type.SCALENE, Triangle.classify(3, 4, 5));
    }

    @Test
    void invalidTriangle() {
        assertEquals(Triangle.Type.INVALID, Triangle.classify(1, 1, 3));
    }

    @Test
    void invalidSideLength() {
        assertEquals(Triangle.Type.INVALID, Triangle.classify(0, 5, 5));
    }
}
