package lc;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.i0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f114077a = a.f114079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f114078b = c0.f114024c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f114079a = new a();

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b extends i0 {
        @Override // lc.i0
        default b a(c key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!Intrinsics.areEqual(getKey(), key)) {
                return null;
            }
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of com.apollographql.apollo.api.ExecutionContext.Element.get");
            return this;
        }

        @Override // lc.i0
        default i0 b(c key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Intrinsics.areEqual(getKey(), key) ? c0.f114024c : this;
        }

        @Override // lc.i0
        default Object fold(Object obj, Function2 operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.invoke(obj, this);
        }

        c getKey();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static i0 c(i0 acc, b element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        i0 i0VarB = acc.b(element.getKey());
        return i0VarB == c0.f114024c ? element : new m(i0VarB, element);
    }

    b a(c cVar);

    i0 b(c cVar);

    default i0 d(i0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == c0.f114024c ? this : (i0) context.fold(this, new Function2() { // from class: lc.h0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return i0.c((i0) obj, (i0.b) obj2);
            }
        });
    }

    Object fold(Object obj, Function2 function2);
}
