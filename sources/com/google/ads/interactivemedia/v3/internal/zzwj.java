package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzwj<T> {
    public final T fromJson(Reader reader) throws IOException {
        return read(new zzacc(reader));
    }

    public final T fromJsonTree(zzvw zzvwVar) {
        try {
            return read(new zzyz(zzvwVar));
        } catch (IOException e11) {
            throw new zzvx(e11);
        }
    }

    public final zzwj<T> nullSafe() {
        return new zzwi(this);
    }

    public abstract T read(zzacc zzaccVar) throws IOException;

    public final void toJson(Writer writer, T t11) throws IOException {
        write(new zzace(writer), t11);
    }

    public final zzvw toJsonTree(T t11) {
        try {
            zzzb zzzbVar = new zzzb();
            write(zzzbVar, t11);
            return zzzbVar.zza();
        } catch (IOException e11) {
            throw new zzvx(e11);
        }
    }

    public abstract void write(zzace zzaceVar, T t11) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t11) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t11);
            return stringWriter.toString();
        } catch (IOException e11) {
            throw new zzvx(e11);
        }
    }
}
