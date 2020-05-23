package com.ldt.springback.view;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* compiled from: SpringBackLayoutHelper */
 class SpringBackLayoutHelper {

    /* renamed from: a reason: collision with root package name */
    private int f6429a;

    /* renamed from: b reason: collision with root package name */
    float f6430b;

    /* renamed from: c reason: collision with root package name */
    float f6431c;

    /* renamed from: d reason: collision with root package name */
    int f6432d = -1;

    /* renamed from: e reason: collision with root package name */
    int f6433e;

    /* renamed from: f reason: collision with root package name */
    int f6434f;
    private ViewGroup g;

    public SpringBackLayoutHelper(ViewGroup viewGroup, int i) {
        this.g = viewGroup;
        this.f6434f = i;
        this.f6429a = ViewConfiguration.get(viewGroup.getContext()).getScaledTouchSlop();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r0 != 3) goto L_0x0078;
     */
    public void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i = 1;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.f6432d;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex >= 0) {
                            float y = motionEvent.getY(findPointerIndex);
                            float f2 = y - this.f6430b;
                            float x = motionEvent.getX(findPointerIndex) - this.f6431c;
                            if (Math.abs(x) > ((float) this.f6429a) || Math.abs(f2) > ((float) this.f6429a)) {
                                if (Math.abs(x) <= Math.abs(f2)) {
                                    i = 2;
                                }
                                this.f6433e = i;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            this.f6433e = 0;
            this.g.requestDisallowInterceptTouchEvent(false);
        } else {
            this.f6432d = motionEvent.getPointerId(0);
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f6432d);
            if (findPointerIndex2 >= 0) {
                this.f6430b = motionEvent.getY(findPointerIndex2);
                this.f6431c = motionEvent.getX(findPointerIndex2);
                this.f6433e = 0;
            }
        }
    }
}
