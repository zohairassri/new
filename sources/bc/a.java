package bc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f14242a;

    public a(HttpURLConnection httpURLConnection) {
        this.f14242a = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14242a.disconnect();
    }

    @Override // bc.d
    public boolean isSuccessful() {
        return this.f14242a.getResponseCode() / 100 == 2;
    }

    @Override // bc.d
    public String m() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f14242a.getURL() + ". Failed with " + this.f14242a.getResponseCode() + "\n" + a(this.f14242a);
        } catch (IOException e11) {
            ec.d.d("get error failed ", e11);
            return e11.getMessage();
        }
    }

    @Override // bc.d
    public String q0() {
        return this.f14242a.getContentType();
    }

    @Override // bc.d
    public InputStream y0() {
        return this.f14242a.getInputStream();
    }
}
