package io.agora.base.internal.video;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
enum VideoCodecProfile {
    HEVCMain10("profile/2"),
    HEVCMain10HDR10("profile/4096"),
    HEVCMain10HDR10Plus("profile/8192"),
    UNKNOWN("profile/0");

    private static Set<String> _values = new HashSet();
    private final String profile;

    static {
        for (VideoCodecProfile videoCodecProfile : values()) {
            _values.add(videoCodecProfile.name());
        }
    }

    VideoCodecProfile(String str) {
        this.profile = str;
    }

    public static boolean contains(String str) {
        return _values.contains(str);
    }

    int profile() {
        String strSubstring;
        if (this.profile.length() <= 8 || (strSubstring = this.profile.substring(8)) == null) {
            return 0;
        }
        return Integer.parseInt(strSubstring);
    }
}
