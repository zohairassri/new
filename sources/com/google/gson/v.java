package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private final class b extends v {
        private b() {
        }

        @Override // com.google.gson.v
        public Object b(bs.a aVar) throws IOException {
            if (aVar.Y() != bs.b.NULL) {
                return v.this.b(aVar);
            }
            aVar.M();
            return null;
        }

        @Override // com.google.gson.v
        public void d(bs.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.E();
            } else {
                v.this.d(cVar, obj);
            }
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + v.this + "]";
        }
    }

    public final v a() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract Object b(bs.a aVar);

    public final j c(Object obj) {
        try {
            com.google.gson.internal.bind.h hVar = new com.google.gson.internal.bind.h();
            d(hVar, obj);
            return hVar.G0();
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public abstract void d(bs.c cVar, Object obj);
}
