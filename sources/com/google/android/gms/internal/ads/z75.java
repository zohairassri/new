package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class z75 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z75 f39048b = new b75().g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f39049a;

    public final Set a() {
        return this.f39049a.keySet();
    }

    public final void b(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.f39049a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    final /* synthetic */ Map c() {
        return this.f39049a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z75) {
            return this.f39049a.equals(((z75) obj).f39049a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39049a.hashCode();
    }
}
