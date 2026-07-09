package i3;

import java.text.CharacterIterator;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f103190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f103193d;

    public n(CharSequence charSequence, int i11, int i12) {
        this.f103190a = charSequence;
        this.f103191b = i11;
        this.f103192c = i12;
        this.f103193d = i11;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i11 = this.f103193d;
        return i11 == this.f103192c ? CharCompanionObject.MAX_VALUE : this.f103190a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f103193d = this.f103191b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f103191b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f103192c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f103193d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i11 = this.f103191b;
        int i12 = this.f103192c;
        if (i11 == i12) {
            this.f103193d = i12;
            return CharCompanionObject.MAX_VALUE;
        }
        int i13 = i12 - 1;
        this.f103193d = i13;
        return this.f103190a.charAt(i13);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i11 = this.f103193d + 1;
        this.f103193d = i11;
        int i12 = this.f103192c;
        if (i11 < i12) {
            return this.f103190a.charAt(i11);
        }
        this.f103193d = i12;
        return CharCompanionObject.MAX_VALUE;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i11 = this.f103193d;
        if (i11 <= this.f103191b) {
            return CharCompanionObject.MAX_VALUE;
        }
        int i12 = i11 - 1;
        this.f103193d = i12;
        return this.f103190a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i11) {
        int i12 = this.f103191b;
        if (i11 > this.f103192c || i12 > i11) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f103193d = i11;
        return current();
    }
}
