package com.ldt.springback2.view;

public class SpringOperator {
    private final double damping;
    private final double tension;

    public SpringOperator(float f, float f2) {
        double d = (double) f2;
        this.tension = Math.pow(6.283185307179586d / d, 2.0d);
        this.damping = (((double) f) * 12.566370614359172d) / d;
    }

    public double updateVelocity(double d, float f, double d2, double d3) {
        double d4 = (double) f;
        return (d * (1.0d - (this.damping * d4))) + ((double) ((float) (this.tension * (d2 - d3) * d4)));
    }
}
