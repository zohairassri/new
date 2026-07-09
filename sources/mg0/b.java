package mg0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final byte a(char c11) {
        if (c11 < '~') {
            return g.f116238c[c11];
        }
        return (byte) 0;
    }

    public static final char b(int i11) {
        if (i11 < 117) {
            return g.f116237b[i11];
        }
        return (char) 0;
    }

    public static final String c(byte b11) {
        return b11 == 1 ? "quotation mark '\"'" : b11 == 2 ? "string escape sequence '\\'" : b11 == 4 ? "comma ','" : b11 == 5 ? "colon ':'" : b11 == 6 ? "start of the object '{'" : b11 == 7 ? "end of the object '}'" : b11 == 8 ? "start of the array '['" : b11 == 9 ? "end of the array ']'" : b11 == 10 ? "end of the input" : b11 == 127 ? "invalid token" : "valid token";
    }
}
