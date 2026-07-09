package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f47064c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47066b;

    private u(Context context, String str) {
        this.f47065a = context;
        this.f47066b = str;
    }

    public static synchronized u c(Context context, String str) {
        Map map;
        try {
            map = f47064c;
            if (!map.containsKey(str)) {
                map.put(str, new u(context, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (u) map.get(str);
    }

    public synchronized Void a() {
        this.f47065a.deleteFile(this.f47066b);
        return null;
    }

    String b() {
        return this.f47066b;
    }

    public synchronized g d() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        try {
            fileInputStreamOpenFileInput = this.f47065a.openFileInput(this.f47066b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th3) {
            fileInputStreamOpenFileInput = null;
            th2 = th3;
        }
        try {
            int iAvailable = fileInputStreamOpenFileInput.available();
            byte[] bArr = new byte[iAvailable];
            fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
            g gVarB = g.b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStreamOpenFileInput.close();
            return gVarB;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            throw th2;
        }
    }

    public synchronized Void e(g gVar) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f47065a.openFileOutput(this.f47066b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(gVar.toString().getBytes("UTF-8"));
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
        return null;
    }
}
