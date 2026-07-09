package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class uc {
    static final CharSequence a(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final Appendable b(Appendable appendable, Iterator it, String str) throws IOException {
        if (it.hasNext()) {
            appendable.append(a(it.next()));
            while (it.hasNext()) {
                appendable.append(",");
                appendable.append(a(it.next()));
            }
        }
        return appendable;
    }
}
