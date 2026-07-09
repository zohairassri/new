package io.agora.utils2;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import io.agora.base.internal.CalledByNative;
import io.agora.utils2.internal.Logging;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
class SqliteWrapper {
    private static final String TAG = "SQLITE";
    private final Object lock = new Object();

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    private SQLiteDatabase f103978db = null;

    static class StorageItem {
        long actualSize;
        byte[] data;
        long expired;
        String key;

        public StorageItem() {
            this.key = null;
            this.data = null;
            this.actualSize = 0L;
            this.expired = 0L;
        }

        @CalledByNative("StorageItem")
        public long getActualSize() {
            return this.actualSize;
        }

        @CalledByNative("StorageItem")
        public byte[] getData() {
            return this.data;
        }

        @CalledByNative("StorageItem")
        public long getExpired() {
            return this.expired;
        }

        @CalledByNative("StorageItem")
        public String getKey() {
            return this.key;
        }

        public StorageItem(String str, byte[] bArr, long j11, long j12) {
            this.key = str;
            this.data = bArr;
            this.actualSize = j11;
            this.expired = j12;
        }
    }

    @CalledByNative
    public SqliteWrapper() {
    }

    private boolean executeCommandOnPath(String str, String str2) {
        if (!isDatabaseValid() || !isPathValid(str)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    this.f103978db.execSQL(str2);
                } catch (Exception unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    private boolean isDatabaseValid() {
        SQLiteDatabase sQLiteDatabase = this.f103978db;
        return (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || this.f103978db.isReadOnly()) ? false : true;
    }

    private boolean isPathValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'' || cCharAt == ';') {
                return false;
            }
        }
        return !str.toLowerCase().contains("sqlite_master");
    }

    @CalledByNative
    public void close() {
        if (isDatabaseValid()) {
            synchronized (this.lock) {
                this.f103978db.close();
                this.f103978db = null;
            }
        }
    }

    @CalledByNative
    boolean delete(String str, String str2) {
        if (!isDatabaseValid() || !isPathValid(str) || !isPathValid(str2)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    this.f103978db.execSQL("delete from \"" + str + "\" where key = \"" + str2 + "\";");
                } catch (Exception unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @CalledByNative
    public void dispose() {
        synchronized (this.lock) {
            try {
                SQLiteDatabase sQLiteDatabase = this.f103978db;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    this.f103978db.close();
                }
                this.f103978db = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @CalledByNative
    boolean drop(String str) {
        return executeCommandOnPath(str, "drop table if exists \"" + str + "\";");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0076 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:9:0x0015, B:11:0x0021, B:14:0x002b, B:35:0x0069, B:39:0x0076, B:40:0x0078, B:37:0x006d, B:18:0x0035, B:20:0x003b, B:23:0x0042, B:25:0x0047, B:28:0x0054, B:32:0x005d), top: B:46:0x0015, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @io.agora.base.internal.CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String[] findAllTableNames() {
        /*
            r7 = this;
            boolean r0 = r7.isDatabaseValid()
            r1 = 0
            if (r0 != 0) goto L11
            java.lang.String r7 = "SQLITE"
            java.lang.String r0 = "database is invalid"
            io.agora.utils2.internal.Logging.w(r7, r0)
            java.lang.String[] r7 = new java.lang.String[r1]
            return r7
        L11:
            java.lang.Object r0 = r7.lock
            monitor-enter(r0)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r7 = r7.f103978db     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L5c
            java.lang.String r3 = "select DISTINCT tbl_name from sqlite_master;"
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L5c
            android.database.Cursor r7 = r7.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L5c
            if (r7 == 0) goto L57
            int r3 = r7.getCount()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r3 != 0) goto L35
            java.lang.String r3 = "SQLITE"
            java.lang.String r4 = "findAllTableNames table count is zero"
        L2b:
            io.agora.utils2.internal.Logging.w(r3, r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            goto L67
        L2f:
            r7 = move-exception
            goto L7a
        L31:
            r6 = r2
            r2 = r7
            r7 = r6
            goto L5d
        L35:
            boolean r4 = r7.isClosed()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r4 != 0) goto L67
            boolean r4 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r4 != 0) goto L42
            goto L67
        L42:
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r4 = r1
        L45:
            if (r4 >= r3) goto L67
            java.lang.String r5 = r7.getString(r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r2[r4] = r5     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            boolean r5 = r7.moveToNext()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r5 != 0) goto L54
            goto L67
        L54:
            int r4 = r4 + 1
            goto L45
        L57:
            java.lang.String r3 = "SQLITE"
            java.lang.String r4 = "findAllTableNames cursor is null"
            goto L2b
        L5c:
            r7 = r2
        L5d:
            java.lang.String r3 = "SQLITE"
            java.lang.String r4 = "findAllTableNames exception"
            io.agora.utils2.internal.Logging.w(r3, r4)     // Catch: java.lang.Throwable -> L2f
            r6 = r2
            r2 = r7
            r7 = r6
        L67:
            if (r7 == 0) goto L74
            r7.close()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L6d
            goto L74
        L6d:
            java.lang.String r7 = "SQLITE"
            java.lang.String r3 = "cursor close exception"
            io.agora.utils2.internal.Logging.w(r7, r3)     // Catch: java.lang.Throwable -> L2f
        L74:
            if (r2 != 0) goto L78
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L2f
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r2
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.SqliteWrapper.findAllTableNames():java.lang.String[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0 A[Catch: all -> 0x0059, TryCatch #2 {all -> 0x0059, blocks: (B:17:0x003f, B:20:0x004b, B:24:0x0054, B:30:0x0062, B:51:0x00b1, B:56:0x00c0, B:59:0x00c4, B:60:0x00c9, B:62:0x00cb, B:63:0x00d0, B:53:0x00b5, B:32:0x006e, B:34:0x007c, B:36:0x0082, B:39:0x0089, B:40:0x008d, B:41:0x0096, B:44:0x009f), top: B:68:0x003f, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @io.agora.base.internal.CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    io.agora.utils2.SqliteWrapper.StorageItem load(java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.SqliteWrapper.load(java.lang.String, java.lang.String, boolean):io.agora.utils2.SqliteWrapper$StorageItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[Catch: all -> 0x006a, TryCatch #2 {, blocks: (B:13:0x0020, B:15:0x002a, B:17:0x0030, B:20:0x0037, B:22:0x0040, B:26:0x0059, B:25:0x0057, B:34:0x0070, B:38:0x007d, B:39:0x007f, B:36:0x0074), top: B:46:0x0020, inners: #3 }] */
    @io.agora.base.internal.CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    io.agora.utils2.SqliteWrapper.StorageItem[] loadWholeTable(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = r11.isDatabaseValid()
            r1 = 0
            if (r0 != 0) goto L11
            java.lang.String r11 = "SQLITE"
            java.lang.String r12 = "database is invalid"
        Lb:
            io.agora.utils2.internal.Logging.w(r11, r12)
            io.agora.utils2.SqliteWrapper$StorageItem[] r11 = new io.agora.utils2.SqliteWrapper.StorageItem[r1]
            return r11
        L11:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L1c
            java.lang.String r11 = "SQLITE"
            java.lang.String r12 = "cmd is invalid"
            goto Lb
        L1c:
            java.lang.Object r2 = r11.lock
            monitor-enter(r2)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r11 = r11.f103978db     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            android.database.Cursor r11 = r11.rawQuery(r12, r3)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            if (r11 == 0) goto L6e
            boolean r12 = r11.isClosed()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            if (r12 != 0) goto L6e
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            if (r12 != 0) goto L37
            goto L6e
        L37:
            int r12 = r11.getCount()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            io.agora.utils2.SqliteWrapper$StorageItem[] r0 = new io.agora.utils2.SqliteWrapper.StorageItem[r12]     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r3 = r1
        L3e:
            if (r3 >= r12) goto L6e
            java.lang.String r5 = r11.getString(r1)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r4 = 1
            byte[] r6 = r11.getBlob(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r4 = 2
            long r9 = r11.getLong(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            int r4 = r6.length     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r7 = 524288(0x80000, float:7.34684E-40)
            if (r4 <= r7) goto L57
            r7 = 524288(0x80000, double:2.590327E-318)
            goto L59
        L57:
            int r4 = r6.length     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            long r7 = (long) r4     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
        L59:
            io.agora.utils2.SqliteWrapper$StorageItem r4 = new io.agora.utils2.SqliteWrapper$StorageItem     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r0[r3] = r4     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            boolean r4 = r11.moveToNext()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            if (r4 != 0) goto L67
            goto L6e
        L67:
            int r3 = r3 + 1
            goto L3e
        L6a:
            r0 = move-exception
            r11 = r0
            goto L81
        L6d:
            r11 = r0
        L6e:
            if (r11 == 0) goto L7b
            r11.close()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L74
            goto L7b
        L74:
            java.lang.String r11 = "SQLITE"
            java.lang.String r12 = "cursor close exception"
            io.agora.utils2.internal.Logging.w(r11, r12)     // Catch: java.lang.Throwable -> L6a
        L7b:
            if (r0 != 0) goto L7f
            io.agora.utils2.SqliteWrapper$StorageItem[] r0 = new io.agora.utils2.SqliteWrapper.StorageItem[r1]     // Catch: java.lang.Throwable -> L6a
        L7f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            return r0
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.SqliteWrapper.loadWholeTable(java.lang.String):io.agora.utils2.SqliteWrapper$StorageItem[]");
    }

    @CalledByNative
    public boolean open(String str) {
        if (!isPathValid(str)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    SQLiteDatabase.OpenParams.Builder builder = new SQLiteDatabase.OpenParams.Builder();
                    builder.setOpenFlags(268435456);
                    builder.setJournalMode("off");
                    SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(new File(str), builder.build());
                    this.f103978db = sQLiteDatabaseOpenDatabase;
                    try {
                        sQLiteDatabaseOpenDatabase.execSQL("PRAGMA TEMP_STORE = MEMORY;");
                        this.f103978db.execSQL("PRAGMA SYNCHRONOUS = OFF;");
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        if (this.f103978db.isOpen()) {
                            this.f103978db.close();
                        }
                        this.f103978db = null;
                        Logging.d(TAG, "Can not open database: " + str);
                        return false;
                    }
                } catch (Exception unused) {
                    SQLiteDatabase sQLiteDatabase = this.f103978db;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        this.f103978db.close();
                    }
                    this.f103978db = null;
                    Logging.d(TAG, "Can not open database: " + str);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @CalledByNative
    long save(String str, String str2, byte[] bArr, long j11) {
        SQLiteStatement sQLiteStatementCompileStatement;
        long length = 0;
        if (!isPathValid(str) || !isPathValid(str2) || bArr == null || bArr.length == 0 || bArr.length >= 524288 || !touch(str)) {
            return 0L;
        }
        synchronized (this.lock) {
            try {
                String str3 = "replace into \"" + str + "\" (key, value, expired) values (\"" + str2 + "\", ?, " + j11 + ");";
                this.f103978db.beginTransaction();
                try {
                    sQLiteStatementCompileStatement = this.f103978db.compileStatement(str3);
                    try {
                        sQLiteStatementCompileStatement.bindBlob(1, bArr);
                        sQLiteStatementCompileStatement.execute();
                        length = bArr.length;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    sQLiteStatementCompileStatement = null;
                }
                this.f103978db.setTransactionSuccessful();
                this.f103978db.endTransaction();
                if (sQLiteStatementCompileStatement != null) {
                    sQLiteStatementCompileStatement.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return length;
    }

    @CalledByNative
    boolean touch(String str) {
        return executeCommandOnPath(str, "create table if not exists \"" + str + "\" (key text primary key, value text, expired INTEGER);");
    }
}
