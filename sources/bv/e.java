package bv;

import java.security.PrivateKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrivateKey f15171a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PrivateKey key) {
            super(null);
            Intrinsics.checkNotNullParameter(key, "key");
            this.f15171a = key;
        }

        public final PrivateKey a() {
            return this.f15171a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f15171a, ((a) obj).f15171a);
        }

        public int hashCode() {
            return this.f15171a.hashCode();
        }

        public String toString() {
            return "SamizdatKey(key=" + this.f15171a + ")";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
