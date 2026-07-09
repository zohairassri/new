package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f47084a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f47084a = field;
    }

    public String toString() {
        return this.f47084a.toString();
    }
}
