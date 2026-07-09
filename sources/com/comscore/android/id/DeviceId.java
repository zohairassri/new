package com.comscore.android.id;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DeviceId {
    public final int _source;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19385d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface Source {
        public static final int ANDROIDBUILDSERIAL = 1;
        public static final int ANDROIDID = 2;
        public static final int APPSETID_SCOPEAPP = 4;
        public static final int APPSETID_SCOPEDEVELOPER = 3;
        public static final int GUID = 0;
    }

    DeviceId(String str, String str2, int i11, int i12, int i13) {
        this.f19382a = str;
        this.f19383b = str2;
        this.f19384c = i11;
        this.f19385d = i12;
        this._source = i13;
    }

    public int getCommonness() {
        return this.f19384c;
    }

    public String getId() {
        return this.f19383b;
    }

    public String getName() {
        return this.f19382a;
    }

    public int getPersistency() {
        return this.f19385d;
    }

    public int getSource() {
        return this._source;
    }

    public String getSuffix() {
        return getCommonness() + "" + getPersistency();
    }
}
