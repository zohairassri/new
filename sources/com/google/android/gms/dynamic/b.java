package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.dynamic.a;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends a.AbstractBinderC0319a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22963a;

    private b(Object obj) {
        this.f22963a = obj;
    }

    public static Object I0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f22963a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i11 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i11++;
                field = field2;
            }
        }
        if (i11 != 1) {
            int length = declaredFields.length;
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 53);
            sb2.append("Unexpected number of IObjectWrapper declared fields: ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        n.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e11) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
        } catch (NullPointerException e12) {
            throw new IllegalArgumentException("Binder object is null.", e12);
        }
    }

    public static a k1(Object obj) {
        return new b(obj);
    }
}
