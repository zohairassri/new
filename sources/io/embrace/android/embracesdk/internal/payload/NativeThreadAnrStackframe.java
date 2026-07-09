package io.embrace.android.embracesdk.internal.payload;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/NativeThreadAnrStackframe;", "", "pc", "", "soLoadAddr", "soPath", "result", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getPc", "()Ljava/lang/String;", "getResult", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSoLoadAddr", "getSoPath", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/embrace/android/embracesdk/internal/payload/NativeThreadAnrStackframe;", "equals", "", "other", "hashCode", "toString", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NativeThreadAnrStackframe {
    private final String pc;
    private final Integer result;
    private final String soLoadAddr;
    private final String soPath;

    public NativeThreadAnrStackframe(String str, String str2, String str3, Integer num) {
        this.pc = str;
        this.soLoadAddr = str2;
        this.soPath = str3;
        this.result = num;
    }

    public static /* synthetic */ NativeThreadAnrStackframe copy$default(NativeThreadAnrStackframe nativeThreadAnrStackframe, String str, String str2, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nativeThreadAnrStackframe.pc;
        }
        if ((i11 & 2) != 0) {
            str2 = nativeThreadAnrStackframe.soLoadAddr;
        }
        if ((i11 & 4) != 0) {
            str3 = nativeThreadAnrStackframe.soPath;
        }
        if ((i11 & 8) != 0) {
            num = nativeThreadAnrStackframe.result;
        }
        return nativeThreadAnrStackframe.copy(str, str2, str3, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPc() {
        return this.pc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSoLoadAddr() {
        return this.soLoadAddr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSoPath() {
        return this.soPath;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getResult() {
        return this.result;
    }

    @NotNull
    public final NativeThreadAnrStackframe copy(String pc2, String soLoadAddr, String soPath, Integer result) {
        return new NativeThreadAnrStackframe(pc2, soLoadAddr, soPath, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeThreadAnrStackframe)) {
            return false;
        }
        NativeThreadAnrStackframe nativeThreadAnrStackframe = (NativeThreadAnrStackframe) other;
        return Intrinsics.areEqual(this.pc, nativeThreadAnrStackframe.pc) && Intrinsics.areEqual(this.soLoadAddr, nativeThreadAnrStackframe.soLoadAddr) && Intrinsics.areEqual(this.soPath, nativeThreadAnrStackframe.soPath) && Intrinsics.areEqual(this.result, nativeThreadAnrStackframe.result);
    }

    public final String getPc() {
        return this.pc;
    }

    public final Integer getResult() {
        return this.result;
    }

    public final String getSoLoadAddr() {
        return this.soLoadAddr;
    }

    public final String getSoPath() {
        return this.soPath;
    }

    public int hashCode() {
        String str = this.pc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.soLoadAddr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.soPath;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.result;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NativeThreadAnrStackframe(pc=" + this.pc + ", soLoadAddr=" + this.soLoadAddr + ", soPath=" + this.soPath + ", result=" + this.result + ')';
    }
}
