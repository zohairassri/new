package com.google.firebase.abt.component;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import vq.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f46399a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f46400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f46401c;

    protected a(Context context, b bVar) {
        this.f46400b = context;
        this.f46401c = bVar;
    }

    protected sp.b a(String str) {
        return new sp.b(this.f46400b, this.f46401c, str);
    }

    public synchronized sp.b b(String str) {
        try {
            if (!this.f46399a.containsKey(str)) {
                this.f46399a.put(str, a(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (sp.b) this.f46399a.get(str);
    }
}
