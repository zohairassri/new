package org.threeten.bp.format;

import org.threeten.bp.DateTimeException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class DateTimeParseException extends DateTimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f120690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f120691b;

    public DateTimeParseException(String str, CharSequence charSequence, int i11) {
        super(str);
        this.f120690a = charSequence.toString();
        this.f120691b = i11;
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i11, Throwable th2) {
        super(str, th2);
        this.f120690a = charSequence.toString();
        this.f120691b = i11;
    }
}
