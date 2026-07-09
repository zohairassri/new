package r9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface d extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1653a f124255b = new C1653a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f124256a;

        /* JADX INFO: renamed from: r9.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1653a {
            public /* synthetic */ C1653a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1653a() {
            }
        }

        public a(int i11) {
            this.f124256a = i11;
        }

        private final void a(String str) {
            if (StringsKt.I(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = Intrinsics.compare((int) str.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            if (str.subSequence(i11, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e11) {
                Log.w("SupportSQLite", "delete failed: ", e11);
            }
        }

        public void b(r9.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void c(r9.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String strB = db2.b();
                if (strB != null) {
                    a(strB);
                    return;
                }
                return;
            }
            List listI = null;
            try {
                try {
                    listI = db2.I();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (listI != null) {
                    return;
                }
            } finally {
                if (listI != null) {
                    Iterator it = listI.iterator();
                    while (it.hasNext()) {
                        Object second = ((Pair) it.next()).second;
                        Intrinsics.checkNotNullExpressionValue(second, "second");
                        a((String) second);
                    }
                } else {
                    String strB2 = db2.b();
                    if (strB2 != null) {
                        a(strB2);
                    }
                }
            }
        }

        public abstract void d(r9.c cVar);

        public abstract void e(r9.c cVar, int i11, int i12);

        public void f(r9.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public abstract void g(r9.c cVar, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C1654b f124257f = new C1654b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f124258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f124259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f124260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f124261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f124262e;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Context f124263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f124264b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private a f124265c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f124266d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f124267e;

            public a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f124263a = context;
            }

            public a a(boolean z11) {
                this.f124267e = z11;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f124265c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f124266d && ((str = this.f124264b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f124263a, this.f124264b, aVar, this.f124266d, this.f124267e);
            }

            public a c(a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f124265c = callback;
                return this;
            }

            public a d(String str) {
                this.f124264b = str;
                return this;
            }

            public a e(boolean z11) {
                this.f124266d = z11;
                return this;
            }
        }

        /* JADX INFO: renamed from: r9.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1654b {
            public /* synthetic */ C1654b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new a(context);
            }

            private C1654b() {
            }
        }

        public b(Context context, String str, a callback, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f124258a = context;
            this.f124259b = str;
            this.f124260c = callback;
            this.f124261d = z11;
            this.f124262e = z12;
        }

        public static final a a(Context context) {
            return f124257f.a(context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
        d a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    r9.c getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z11);
}
