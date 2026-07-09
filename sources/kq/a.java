package kq;

import android.content.res.AssetFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f112013a;

    public a(iq.f fVar) {
        this.f112013a = fVar.e("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f112013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONObject b() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        aq.g.f().b("Checking for cached settings...");
        AssetFileDescriptor.AutoCloseInputStream autoCloseInputStream = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(dq.i.A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e11) {
                        e = e11;
                        aq.g.f().e("Failed to fetch cached settings", e);
                        dq.i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    aq.g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                dq.i.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                autoCloseInputStream = "Checking for cached settings...";
                dq.i.f(autoCloseInputStream, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            dq.i.f(autoCloseInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j11, JSONObject jSONObject) throws Throwable {
        FileWriter fileWriter;
        aq.g.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j11);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e11) {
                e = e11;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                dq.i.f(fileWriter, "Failed to close settings writer.");
            } catch (Exception e12) {
                e = e12;
                fileWriter2 = fileWriter;
                aq.g.f().e("Failed to cache settings", e);
                dq.i.f(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th3) {
                th = th3;
                fileWriter2 = fileWriter;
                dq.i.f(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
