package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements com.google.gson.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f47085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f47086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f47087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f47088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f47089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f47090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f47091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ b[] f47092h;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    enum a extends b {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.c
        public String b(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f47085a = aVar;
        b bVar = new b("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.b.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String b(Field field) {
                return b.e(field.getName());
            }
        };
        f47086b = bVar;
        b bVar2 = new b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.b.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String b(Field field) {
                return b.e(b.c(field.getName(), ' '));
            }
        };
        f47087c = bVar2;
        b bVar3 = new b("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.b.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String b(Field field) {
                return b.c(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f47088d = bVar3;
        b bVar4 = new b("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.b.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String b(Field field) {
                return b.c(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f47089e = bVar4;
        b bVar5 = new b("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.b.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String b(Field field) {
                return b.c(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f47090f = bVar5;
        b bVar6 = new b("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.b.g
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String b(Field field) {
                return b.c(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f47091g = bVar6;
        f47092h = new b[]{aVar, bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
    }

    private b(String str, int i11) {
    }

    static String c(String str, char c11) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c11);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    static String e(String str) {
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (!Character.isLetter(cCharAt)) {
                i11++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i11 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i11) + upperCase + str.substring(i11 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f47092h.clone();
    }

    /* synthetic */ b(String str, int i11, a aVar) {
        this(str, i11);
    }
}
