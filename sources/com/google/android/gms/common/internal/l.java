package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f22772b = new h("LibraryVersion", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final l f22773c = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f22774a = new ConcurrentHashMap();

    protected l() {
    }

    public static l a() {
        return f22773c;
    }

    public String b(String str) throws Throwable {
        String str2;
        InputStream resourceAsStream;
        n.g(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f22774a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = l.class.getResourceAsStream(String.format("/%s.properties", str));
            } catch (IOException e11) {
                e = e11;
                str2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                property = properties.getProperty("version", null);
                h hVar = f22772b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                sb2.append(str);
                sb2.append(" version is ");
                sb2.append(property);
                hVar.d("LibraryVersion", sb2.toString());
            } else {
                h hVar2 = f22772b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Failed to get app version for libraryName: ");
                sb3.append(str);
                hVar2.e("LibraryVersion", sb3.toString());
            }
        } catch (IOException e12) {
            e = e12;
            str2 = property;
            inputStream = resourceAsStream;
            h hVar3 = f22772b;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
            sb4.append("Failed to get app version for libraryName: ");
            sb4.append(str);
            hVar3.c("LibraryVersion", sb4.toString(), e);
            resourceAsStream = inputStream;
            property = str2;
        } catch (Throwable th3) {
            th = th3;
            inputStream = resourceAsStream;
            if (inputStream != null) {
                com.google.android.gms.common.util.l.a(inputStream);
            }
            throw th;
        }
        if (resourceAsStream != null) {
            com.google.android.gms.common.util.l.a(resourceAsStream);
        }
        if (property == null) {
            f22772b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            property = "UNKNOWN";
        }
        this.f22774a.put(str, property);
        return property;
    }
}
