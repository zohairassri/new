package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static HashMap f40419g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f40424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f40425m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f40413a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f40414b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f40415c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f40416d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f40417e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ContentResolver f40418f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap f40420h = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final HashMap f40421i = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashMap f40422j = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashMap f40423k = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String[] f40426n = new String[0];

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        Map zza(int i11);
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (i5.class) {
            try {
                if (f40419g == null) {
                    f40417e.set(false);
                    f40419g = new HashMap(16, 1.0f);
                    f40424l = new Object();
                    f40425m = false;
                    contentResolver.registerContentObserver(f40413a, true, new l5(null));
                } else if (f40417e.getAndSet(false)) {
                    f40419g.clear();
                    f40420h.clear();
                    f40421i.clear();
                    f40422j.clear();
                    f40423k.clear();
                    f40424l = new Object();
                    f40425m = false;
                }
                Object obj = f40424l;
                if (f40419g.containsKey(str)) {
                    String str3 = (String) f40419g.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : f40426n) {
                    if (str.startsWith(str4)) {
                        if (!f40425m) {
                            HashMap map = (HashMap) b(contentResolver, f40426n, new k5());
                            if (map != null) {
                                if (!map.isEmpty()) {
                                    Set setKeySet = map.keySet();
                                    setKeySet.removeAll(f40420h.keySet());
                                    setKeySet.removeAll(f40421i.keySet());
                                    setKeySet.removeAll(f40422j.keySet());
                                    setKeySet.removeAll(f40423k.keySet());
                                }
                                if (!map.isEmpty()) {
                                    if (f40419g.isEmpty()) {
                                        f40419g = map;
                                    } else {
                                        f40419g.putAll(map);
                                    }
                                }
                                f40425m = true;
                            }
                            if (f40419g.containsKey(str)) {
                                String str5 = (String) f40419g.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                Cursor cursorQuery = contentResolver.query(f40413a, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        d(obj, str, null);
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    d(obj, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static Map b(ContentResolver contentResolver, String[] strArr, a aVar) {
        Cursor cursorQuery = contentResolver.query(f40414b, null, null, strArr, null);
        if (cursorQuery == null) {
            return null;
        }
        Map mapZza = aVar.zza(cursorQuery.getCount());
        while (cursorQuery.moveToNext()) {
            try {
                mapZza.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } finally {
                cursorQuery.close();
            }
        }
        return mapZza;
    }

    private static void d(Object obj, String str, String str2) {
        synchronized (i5.class) {
            try {
                if (obj == f40424l) {
                    f40419g.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
