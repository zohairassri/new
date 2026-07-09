package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class dx3 {
    static final CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final StringBuilder b(StringBuilder sb2, Iterable iterable, String str) {
        c(sb2, iterable.iterator(), str);
        return sb2;
    }

    public static final StringBuilder c(StringBuilder sb2, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                sb2.append(a(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) str);
                    sb2.append(a(it.next()));
                }
            }
            return sb2;
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public static final String d(Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        StringBuilder sb2 = new StringBuilder();
        c(sb2, it, str);
        return sb2.toString();
    }
}
