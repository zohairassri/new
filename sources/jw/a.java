package jw;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public final Date a(Long l11) {
        if (l11 != null) {
            return new Date(l11.longValue());
        }
        return null;
    }

    public final Long b(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }
}
