package ec;

import com.amazonaws.services.s3.model.InstructionFileId;
import t4.m;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f92425a = new String[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f92426b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f92427c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92428d = 0;

    public void a(String str) {
        int i11 = this.f92427c;
        if (i11 == 5) {
            this.f92428d++;
            return;
        }
        this.f92425a[i11] = str;
        this.f92426b[i11] = System.nanoTime();
        m.a(str);
        this.f92427c++;
    }

    public float b(String str) {
        int i11 = this.f92428d;
        if (i11 > 0) {
            this.f92428d = i11 - 1;
            return 0.0f;
        }
        int i12 = this.f92427c - 1;
        this.f92427c = i12;
        if (i12 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f92425a[i12])) {
            m.b();
            return (System.nanoTime() - this.f92426b[this.f92427c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f92425a[this.f92427c] + InstructionFileId.DOT);
    }
}
