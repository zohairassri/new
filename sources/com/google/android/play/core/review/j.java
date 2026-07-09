package com.google.android.play.core.review;

import com.comscore.LiveTransmissionMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f45804a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f45804a = new HashMap();
        new wo.i("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        map = f45804a;
        map.put("java", Integer.valueOf(LiveTransmissionMode.LAN));
        return map;
    }
}
