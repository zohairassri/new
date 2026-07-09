package aq;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f13613b = null;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f13614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f13615b;

        private b() {
            int iP = dq.i.p(f.this.f13612a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f13614a = null;
                    this.f13615b = null;
                    return;
                } else {
                    this.f13614a = "Flutter";
                    this.f13615b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f13614a = "Unity";
            String string = f.this.f13612a.getResources().getString(iP);
            this.f13615b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f13612a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f13612a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f13612a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f13613b == null) {
            this.f13613b = new b();
        }
        return this.f13613b;
    }

    public String d() {
        return f().f13614a;
    }

    public String e() {
        return f().f13615b;
    }
}
