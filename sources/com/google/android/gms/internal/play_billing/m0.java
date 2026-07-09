package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collector f42479a = Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.a0
        @Override // java.util.function.Supplier
        public final Object get() {
            return new b1(4);
        }
    }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.d0
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((b1) obj).e(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.e0
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            b1 b1Var = (b1) obj;
            b1 b1Var2 = (b1) obj2;
            b1Var.c(b1Var2.f42635a, b1Var2.f42636b);
            return b1Var;
        }
    }, new Function() { // from class: com.google.android.gms.internal.play_billing.f0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((b1) obj).f();
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.g0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new l1();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.h0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((l1) obj).e(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.i0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                l1 l1Var = (l1) obj;
                l1 l1Var2 = (l1) obj2;
                l1Var.c(l1Var2.f42635a, l1Var2.f42636b);
                return l1Var;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                l1 l1Var = (l1) obj;
                int i11 = l1Var.f42636b;
                if (i11 == 0) {
                    return i2.f42435i;
                }
                if (i11 == 1) {
                    Object obj2 = l1Var.f42635a[0];
                    Objects.requireNonNull(obj2);
                    return new l2(obj2);
                }
                m1 m1VarU = m1.u(i11, l1Var.f42635a);
                l1Var.f42636b = m1VarU.size();
                l1Var.f42637c = true;
                return m1VarU;
            }
        }, new Collector.Characteristics[0]);
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.k0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new j1();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.l0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((j1) obj).a((z1) obj2);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.b0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                j1 j1Var = (j1) obj;
                j1Var.b((j1) obj2);
                return j1Var;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.c0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((j1) obj).c();
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector a() {
        return f42479a;
    }
}
