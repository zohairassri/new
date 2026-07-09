package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class y0 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f46057a;

        void a(Object obj, int i11) {
            try {
                this.f46057a.set(obj, Integer.valueOf(i11));
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        void b(Object obj, Object obj2) {
            try {
                this.f46057a.set(obj, obj2);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        private b(Field field) {
            this.f46057a = field;
            field.setAccessible(true);
        }
    }

    static b a(Class cls, String str) {
        try {
            return new b(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e11) {
            throw new AssertionError(e11);
        }
    }

    static void b(Map map, ObjectInputStream objectInputStream, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    static int c(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    static void d(Map map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static void e(j0 j0Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(j0Var.c().size());
        for (Map.Entry entry : j0Var.c().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
