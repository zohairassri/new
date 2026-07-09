package com.google.android.gms.internal.pal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class wu implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    xu f41936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    xu f41937b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f41938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yu f41939d;

    wu(yu yuVar) {
        this.f41939d = yuVar;
        this.f41936a = yuVar.f42255e.f42221d;
        this.f41938c = yuVar.f42254d;
    }

    final xu a() {
        xu xuVar = this.f41936a;
        yu yuVar = this.f41939d;
        if (xuVar == yuVar.f42255e) {
            throw new NoSuchElementException();
        }
        if (yuVar.f42254d != this.f41938c) {
            throw new ConcurrentModificationException();
        }
        this.f41936a = xuVar.f42221d;
        this.f41937b = xuVar;
        return xuVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41936a != this.f41939d.f42255e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        xu xuVar = this.f41937b;
        if (xuVar == null) {
            throw new IllegalStateException();
        }
        this.f41939d.g(xuVar, true);
        this.f41937b = null;
        this.f41938c = this.f41939d.f42254d;
    }
}
