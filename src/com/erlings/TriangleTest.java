package com.erlings;

import com.sun.tools.javac.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by emm on 21/03/2017.
 */
class TriangleTest {
// 1=scalene, 2=isosceles, 3=equilateral, 4=error
    @org.junit.jupiter.api.Test
    void classifyEquilateralTriangle() {
        int eq = Main.classifyTriangle(1,1,1);
        Assert.check(eq == 3, "Triangle classification did not match");
    }

    @org.junit.jupiter.api.Test
    void classifyIsoscelesTriangle211() {
        int eq = Main.classifyTriangle(2,1,1);
        Assert.check(eq == 2, "Triangle classification did not match");
    }

    @org.junit.jupiter.api.Test
    void classifyIsoscelesTriangle121() {
        int eq = Main.classifyTriangle(1,2,1);
        Assert.check(eq == 2, "Triangle classification did not match");
    }

    @org.junit.jupiter.api.Test
    void classifyIsoscelesTriangle112() {
        int eq = Main.classifyTriangle(1,1,2);
        Assert.check(eq == 2, "Triangle classification did not match");
    }

    @org.junit.jupiter.api.Test
    void classifyScaleneTriangle123() {
        int eq = Main.classifyTriangle(1,2, 3);
        Assert.check(eq == 1, "Triangle classification did not match");
    }

    @org.junit.jupiter.api.Test
    void classifyNegativeTriangle() {
        int eq = Main.classifyTriangle(1,2, -3);
        Assert.check(eq == 4, "Triangle classification did not match");
    }

    @org.junit.jupiter.api.Test
    void classifyZeroTriangle() {
        int eq = Main.classifyTriangle(1,0, 3);
        Assert.check(eq == 4, "Triangle classification did not match");
    }

}