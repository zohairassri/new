package com.iterable.iterableapi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static l0 f47792e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f47793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f47794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f47795c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f47796d = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0 f47797a;

        a(j0 j0Var) {
            this.f47797a = j0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = l0.this.f47795c;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((d) obj).b(this.f47797a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = l0.this.f47796d;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((c) obj).a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
        void a();

        void isReady();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface d {
        void b(j0 j0Var);
    }

    private l0(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (this.f47794b == null) {
                this.f47794b = new m(context);
            }
            this.f47793a = this.f47794b.getWritableDatabase();
        } catch (SQLException unused) {
            x.b("IterableTaskStorage", "Database cannot be opened for writing");
        }
    }

    private j0 f(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("task_id"));
        String string2 = cursor.getString(cursor.getColumnIndex("name"));
        int i11 = cursor.getInt(cursor.getColumnIndex("version"));
        long j11 = cursor.getLong(cursor.getColumnIndex("created"));
        long j12 = !cursor.isNull(cursor.getColumnIndex("modified")) ? cursor.getLong(cursor.getColumnIndex("modified")) : 0L;
        return new j0(string, string2, i11, j11, j12, !cursor.isNull(cursor.getColumnIndex("last_attempt")) ? cursor.getLong(cursor.getColumnIndex("last_attempt")) : 0L, !cursor.isNull(cursor.getColumnIndex("scheduled")) ? cursor.getLong(cursor.getColumnIndex("scheduled")) : 0L, cursor.isNull(cursor.getColumnIndex("requested")) ? 0L : cursor.getLong(cursor.getColumnIndex("requested")), !cursor.isNull(cursor.getColumnIndex("processing")) && cursor.getInt(cursor.getColumnIndex("processing")) > 0, !cursor.isNull(cursor.getColumnIndex("failed")) && cursor.getInt(cursor.getColumnIndex("failed")) > 0, !cursor.isNull(cursor.getColumnIndex("blocking")) && cursor.getInt(cursor.getColumnIndex("blocking")) > 0, !cursor.isNull(cursor.getColumnIndex("data")) ? cursor.getString(cursor.getColumnIndex("data")) : null, !cursor.isNull(cursor.getColumnIndex("error")) ? cursor.getString(cursor.getColumnIndex("error")) : null, cursor.isNull(cursor.getColumnIndex("type")) ? null : m0.valueOf(cursor.getString(cursor.getColumnIndex("type"))), cursor.isNull(cursor.getColumnIndex("attempts")) ? 0 : cursor.getInt(cursor.getColumnIndex("attempts")));
    }

    private boolean k() {
        SQLiteDatabase sQLiteDatabase = this.f47793a;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        l();
        x.b("IterableTaskStorage", "Database not initialized or is closed");
        return false;
    }

    private void l() {
        new Handler(Looper.getMainLooper()).post(new b());
    }

    static l0 m(Context context) {
        if (f47792e == null) {
            f47792e = new l0(context);
        }
        return f47792e;
    }

    void c(c cVar) {
        if (k()) {
            cVar.isReady();
        } else {
            cVar.a();
        }
        this.f47796d.add(cVar);
    }

    void d(d dVar) {
        this.f47795c.add(dVar);
    }

    String e(String str, m0 m0Var, String str2) {
        if (!k()) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        j0 j0Var = new j0(str, m0.f47800a, str2);
        contentValues.put("task_id", j0Var.f47729b);
        contentValues.put("name", j0Var.f47730c);
        contentValues.put("version", Integer.valueOf(j0Var.f47731d));
        contentValues.put("created", Long.valueOf(j0Var.f47732e));
        long j11 = j0Var.f47733f;
        if (j11 != 0) {
            contentValues.put("modified", Long.valueOf(j11));
        }
        long j12 = j0Var.f47734g;
        if (j12 != 0) {
            contentValues.put("last_attempt", Long.valueOf(j12));
        }
        long j13 = j0Var.f47735h;
        if (j13 != 0) {
            contentValues.put("scheduled", Long.valueOf(j13));
        }
        long j14 = j0Var.f47736i;
        if (j14 != 0) {
            contentValues.put("requested", Long.valueOf(j14));
        }
        contentValues.put("processing", Boolean.valueOf(j0Var.f47737j));
        contentValues.put("failed", Boolean.valueOf(j0Var.f47738k));
        contentValues.put("blocking", Boolean.valueOf(j0Var.f47739l));
        String str3 = j0Var.f47740m;
        if (str3 != null) {
            contentValues.put("data", str3);
        }
        String str4 = j0Var.f47741n;
        if (str4 != null) {
            contentValues.put("error", str4);
        }
        contentValues.put("type", j0Var.f47742o.toString());
        contentValues.put("attempts", Integer.valueOf(j0Var.f47743p));
        if (this.f47793a.insert("OfflineTask", null, contentValues) == -1) {
            l();
            return null;
        }
        contentValues.clear();
        new Handler(Looper.getMainLooper()).post(new a(j0Var));
        return j0Var.f47729b;
    }

    void g() {
        if (k()) {
            x.g("IterableTaskStorage", "Deleted " + this.f47793a.delete("OfflineTask", null, null) + " offline tasks");
        }
    }

    boolean h(String str) {
        if (!k()) {
            return false;
        }
        x.g("IterableTaskStorage", "Deleted entry - " + this.f47793a.delete("OfflineTask", "task_id =?", new String[]{str}));
        return true;
    }

    j0 i() {
        if (!k()) {
            return null;
        }
        Cursor cursorRawQuery = this.f47793a.rawQuery("select * from OfflineTask order by scheduled limit 1", null);
        j0 j0VarF = cursorRawQuery.moveToFirst() ? f(cursorRawQuery) : null;
        cursorRawQuery.close();
        return j0VarF;
    }

    long j() {
        if (k()) {
            return DatabaseUtils.queryNumEntries(this.f47793a, "OfflineTask");
        }
        throw new IllegalStateException("Database is not ready");
    }
}
