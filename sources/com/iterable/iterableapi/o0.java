package com.iterable.iterableapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class o0 {
    o0() {
    }

    static boolean g(String str) {
        String str2 = str.split("://")[0];
        if (str2.equals("https")) {
            return true;
        }
        for (String str3 : g.f47667t.f47669b.f47775j) {
            if (str2.equals(str3)) {
                return true;
            }
        }
        x.a("IterableUtilImpl", str2 + " is not in the allowed protocols");
        return false;
    }

    public long a() {
        return System.currentTimeMillis();
    }

    String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            x.c("IterableUtilImpl", "Error while retrieving app version", e11);
            return null;
        }
    }

    String c(Context context) {
        try {
            return Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e11) {
            x.c("IterableUtilImpl", "Error while retrieving app version code", e11);
            return null;
        }
    }

    File d(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    File e(Context context) {
        File file = new File(context.getFilesDir(), "com.iterable.sdk");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    File f(Context context) {
        File file = new File(context.getCacheDir(), "com.iterable.sdk");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    boolean h(long j11) {
        return j11 >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.BufferedReader] */
    String i(File file) throws Throwable {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        ?? bufferedReader;
        Throwable th2;
        ?? r22;
        ?? r23;
        StringBuilder sb2;
        String string = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            inputStreamReader = null;
        }
        try {
            inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    try {
                        sb2 = new StringBuilder();
                    } catch (Exception e12) {
                        e = e12;
                        bufferedReader = bufferedReader;
                        x.c("IterableUtilImpl", "Error while reading file: " + file.toString(), e);
                        r23 = bufferedReader;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    r22 = bufferedReader;
                    es.b.a(fileInputStream);
                    es.b.a(inputStreamReader);
                    es.b.a(r22);
                    throw th2;
                }
            } catch (Exception e13) {
                e = e13;
                bufferedReader = 0;
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader2 = null;
                th2 = th;
                r22 = inputStreamReader2;
                es.b.a(fileInputStream);
                es.b.a(inputStreamReader);
                es.b.a(r22);
                throw th2;
            }
        } catch (Exception e14) {
            e = e14;
            inputStreamReader = null;
            bufferedReader = inputStreamReader;
            x.c("IterableUtilImpl", "Error while reading file: " + file.toString(), e);
            r23 = bufferedReader;
            es.b.a(fileInputStream);
            es.b.a(inputStreamReader);
            es.b.a(r23);
            return string;
        } catch (Throwable th6) {
            th = th6;
            inputStreamReader = null;
            inputStreamReader2 = inputStreamReader;
            th2 = th;
            r22 = inputStreamReader2;
            es.b.a(fileInputStream);
            es.b.a(inputStreamReader);
            es.b.a(r22);
            throw th2;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb2.append(line);
            es.b.a(fileInputStream);
            es.b.a(inputStreamReader);
            es.b.a(r23);
            return string;
        }
        string = sb2.toString();
        r23 = bufferedReader;
        es.b.a(fileInputStream);
        es.b.a(inputStreamReader);
        es.b.a(r23);
        return string;
    }

    Long j(JSONObject jSONObject, String str) {
        try {
            long j11 = jSONObject.getLong(str);
            if (h(j11)) {
                return Long.valueOf(j11);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    void k(SharedPreferences sharedPreferences, String str, JSONObject jSONObject, long j11) {
        l(sharedPreferences, str, jSONObject.toString(), j11);
    }

    void l(SharedPreferences sharedPreferences, String str, String str2, long j11) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str + "_object", str2);
        editorEdit.putLong(str + "_expiration", a() + j11);
        editorEdit.apply();
    }

    boolean m(File file, String str) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return true;
        } catch (Exception e11) {
            x.c("IterableUtilImpl", "Error while writing to file: " + file.toString(), e11);
            return false;
        }
    }
}
