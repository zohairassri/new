package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.theathletic.video.component.data.VideoRepository;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e72 {
    public static void a(SQLiteDatabase sQLiteDatabase) {
        i(sQLiteDatabase, "failed_requests", 0);
        i(sQLiteDatabase, "total_requests", 0);
        i(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put(VideoRepository.XML_ATTR_VALUE, (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        h(sQLiteDatabase, "failed_requests", 0);
        h(sQLiteDatabase, "total_requests", 0);
        h(sQLiteDatabase, "completed_requests", 0);
    }

    public static int c(SQLiteDatabase sQLiteDatabase, int i11) {
        int i12 = 0;
        if (i11 == 2) {
            return 0;
        }
        Cursor cursorG = g(sQLiteDatabase, i11);
        if (cursorG.getCount() > 0) {
            cursorG.moveToNext();
            i12 = cursorG.getInt(cursorG.getColumnIndexOrThrow(VideoRepository.XML_ATTR_VALUE));
        }
        cursorG.close();
        return i12;
    }

    public static long d(SQLiteDatabase sQLiteDatabase, int i11) {
        long j11;
        Cursor cursorG = g(sQLiteDatabase, 2);
        if (cursorG.getCount() > 0) {
            cursorG.moveToNext();
            j11 = cursorG.getLong(cursorG.getColumnIndexOrThrow(VideoRepository.XML_ATTR_VALUE));
        } else {
            j11 = 0;
        }
        cursorG.close();
        return j11;
    }

    public static void e(SQLiteDatabase sQLiteDatabase, long j11, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j11));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j11)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void f(SQLiteDatabase sQLiteDatabase, boolean z11, boolean z12) {
        if (!z12) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (z11) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
    }

    private static Cursor g(SQLiteDatabase sQLiteDatabase, int i11) {
        String[] strArr = {VideoRepository.XML_ATTR_VALUE};
        String[] strArr2 = new String[1];
        if (i11 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i11 == 1) {
            strArr2[0] = "total_requests";
        } else if (i11 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void h(SQLiteDatabase sQLiteDatabase, String str, int i11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(VideoRepository.XML_ATTR_VALUE, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    private static void i(SQLiteDatabase sQLiteDatabase, String str, int i11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put(VideoRepository.XML_ATTR_VALUE, (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }
}
