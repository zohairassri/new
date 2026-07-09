package j$.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DesugarLocalDate {
    static {
        LocalDate.of(1970, 1, 1);
    }

    public static LocalDate ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return LocalDate.ofEpochDay(Math.floorDiv(instant.getEpochSecond() + ((long) zoneId.getRules().getOffset(instant).getTotalSeconds()), 86400));
    }
}
