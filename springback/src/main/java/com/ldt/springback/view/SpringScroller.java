package com.ldt.springback.view;

import android.view.animation.AnimationUtils;

/* compiled from: SpringScroller */
class SpringScroller {

    /* renamed from: a reason: collision with root package name */
    private long f6437a;

    /* renamed from: b reason: collision with root package name */
    private long f6438b;

    /* renamed from: c reason: collision with root package name */
    private double f6439c;

    /* renamed from: d reason: collision with root package name */
    private double f6440d;

    /* renamed from: e reason: collision with root package name */
    private SpringOperator mSpringOperator;

    /* renamed from: f reason: collision with root package name */
    private double f6442f;
    private double g;
    private double h;
    private double i;
    private double j;
    private double k;
    private double l;
    private double m;
    private int n;
    private boolean o = true;
    private boolean p;

    public void a(float f2, float f3, float f4, float f5, float f6, int i2) {
        this.o = false;
        this.p = false;
        double d2 = (double) f2;
        this.g = d2;
        this.h = d2;
        this.f6442f = (double) f3;
        double d3 = (double) f4;
        this.j = d3;
        this.k = d3;
        this.f6440d = (double) ((int) this.j);
        this.i = (double) f5;
        double d4 = (double) f6;
        this.l = d4;
        this.m = d4;
        if (Math.abs(this.m) <= 5000.0d) {
            this.mSpringOperator = new SpringOperator(1.0f, 0.4f);
        } else {
            this.mSpringOperator = new SpringOperator(1.0f, 0.55f);
        }
        this.n = i2;
        this.f6437a = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void b() {
        this.o = true;
    }

    public final int c() {
        return (int) this.f6439c;
    }

    public final int d() {
        return (int) this.f6440d;
    }

    public final boolean e() {
        return this.o;
    }

    public boolean a() {
        if (this.mSpringOperator == null || this.o) {
            return false;
        }
        if (this.p) {
            this.o = true;
            return true;
        }
        this.f6438b = AnimationUtils.currentAnimationTimeMillis();
        float min = Math.min(((float) (this.f6438b - this.f6437a)) / 1000.0f, 0.016f);
        if (min == 0.0f) {
            min = 0.016f;
        }
        this.f6437a = this.f6438b;
        if (this.n == 2) {
            double a2 = this.mSpringOperator.a(this.m, min, this.i, this.j);
            this.f6440d = this.j + (((double) min) * a2);
            this.m = a2;
            if (a(this.f6440d, this.k, this.i)) {
                this.p = true;
                this.f6440d = this.i;
            } else {
                this.j = this.f6440d;
            }
        } else {
            double a3 = this.mSpringOperator.a(this.m, min, this.f6442f, this.g);
            this.f6439c = this.g + (((double) min) * a3);
            this.m = a3;
            if (a(this.f6439c, this.h, this.f6442f)) {
                this.p = true;
                this.f6439c = this.f6442f;
            } else {
                this.g = this.f6439c;
            }
        }
        return true;
    }

    public boolean a(double d2, double d3, double d4) {
        boolean z = true;
        if (d3 < d4 && d2 > d4) {
            return true;
        }
        int i2 = (d3 > d4 ? 1 : (d3 == d4 ? 0 : -1));
        if (i2 > 0 && d2 < d4) {
            return true;
        }
        if (i2 == 0 && Math.signum(this.l) != Math.signum(d2)) {
            return true;
        }
        if (Math.abs(d2 - d4) >= 1.0d) {
            z = false;
        }
        return z;
    }
}
