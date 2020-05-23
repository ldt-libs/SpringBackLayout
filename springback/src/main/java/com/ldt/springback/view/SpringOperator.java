package com.ldt.springback.view;

/* compiled from: SpringOperator */
class SpringOperator {

    /* renamed from: a reason: collision with root package name */
    private final double f6435a;

    /* renamed from: b reason: collision with root package name */
    private final double f6436b;

    public SpringOperator(float f2, float f3) {
        double d2 = (double) f3;
        this.f6436b = Math.pow(6.283185307179586d / d2, 2.0d);
        this.f6435a = (((double) f2) * 12.566370614359172d) / d2;
    }

    public double a(double d2, float f2, double d3, double d4) {
        double d5 = (double) f2;
        return (d2 * (1.0d - (this.f6435a * d5))) + ((double) ((float) (this.f6436b * (d3 - d4) * d5)));
    }
}
