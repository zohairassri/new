package com.google.firebase.remoteconfig.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class v {
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[Catch: IOException | XmlPullParserException -> 0x0013, TryCatch #0 {IOException | XmlPullParserException -> 0x0013, blocks: (B:3:0x0007, B:5:0x000d, B:9:0x0016, B:14:0x0028, B:40:0x0080, B:17:0x0030, B:21:0x0040, B:22:0x0044, B:28:0x0052, B:39:0x007b, B:33:0x0061, B:35:0x0069, B:36:0x006e, B:38:0x0076), top: B:45:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map a(android.content.Context r7, int r8) {
        /*
            java.lang.String r0 = "FirebaseRemoteConfig"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> L13
            if (r7 != 0) goto L16
            java.lang.String r7 = "Could not find the resources of the current context while trying to set defaults from an XML."
            android.util.Log.e(r0, r7)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r7 = move-exception
            goto L86
        L16:
            android.content.res.XmlResourceParser r7 = r7.getXml(r8)     // Catch: java.lang.Throwable -> L13
            int r8 = r7.getEventType()     // Catch: java.lang.Throwable -> L13
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L22:
            r6 = 1
            if (r8 == r6) goto L85
            r6 = 2
            if (r8 != r6) goto L2d
            java.lang.String r3 = r7.getName()     // Catch: java.lang.Throwable -> L13
            goto L80
        L2d:
            r6 = 3
            if (r8 != r6) goto L4d
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "entry"
            boolean r8 = r8.equals(r3)     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L4b
            if (r4 == 0) goto L44
            if (r5 == 0) goto L44
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L13
            goto L49
        L44:
            java.lang.String r8 = "An entry in the defaults XML has an invalid key and/or value tag."
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L13
        L49:
            r4 = r2
            r5 = r4
        L4b:
            r3 = r2
            goto L80
        L4d:
            r6 = 4
            if (r8 != r6) goto L80
            if (r3 == 0) goto L80
            int r8 = r3.hashCode()     // Catch: java.lang.Throwable -> L13
            r6 = 106079(0x19e5f, float:1.48648E-40)
            if (r8 == r6) goto L6e
            r6 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r8 == r6) goto L61
            goto L7b
        L61:
            java.lang.String r8 = "value"
            boolean r8 = r3.equals(r8)     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L7b
            java.lang.String r5 = r7.getText()     // Catch: java.lang.Throwable -> L13
            goto L80
        L6e:
            java.lang.String r8 = "key"
            boolean r8 = r3.equals(r8)     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L7b
            java.lang.String r4 = r7.getText()     // Catch: java.lang.Throwable -> L13
            goto L80
        L7b:
            java.lang.String r8 = "Encountered an unexpected tag while parsing the defaults XML."
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L13
        L80:
            int r8 = r7.next()     // Catch: java.lang.Throwable -> L13
            goto L22
        L85:
            return r1
        L86:
            java.lang.String r8 = "Encountered an error while parsing the defaults XML file."
            android.util.Log.e(r0, r8, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.v.a(android.content.Context, int):java.util.Map");
    }
}
