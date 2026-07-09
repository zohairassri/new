package com.comscore.android.util.update;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class UpdateFrom5_4_x {
    public static final String OLD_DEFAULT_PREFS_NAME = "cSPrefs";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f19429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, String> f19430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f19431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f19432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f19433e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(400L);
            } catch (InterruptedException unused) {
            }
            if (UpdateFrom5_4_x.this.f19431c.exists()) {
                UpdateFrom5_4_x.this.f19431c.delete();
            }
            if (UpdateFrom5_4_x.this.f19432d.exists()) {
                UpdateFrom5_4_x.this.f19432d.delete();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b implements FilenameFilter {
        b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("cs_cache_");
        }
    }

    public UpdateFrom5_4_x(Context context) {
        this.f19433e = context;
        File file = new File(this.f19433e.getFilesDir().getParent() + "/shared_prefs/" + OLD_DEFAULT_PREFS_NAME + ".xml");
        this.f19431c = file;
        if (file.exists()) {
            this.f19432d = new File(this.f19433e.getFilesDir().getParent() + "/shared_prefs/" + OLD_DEFAULT_PREFS_NAME + ".back");
            this.f19430b = new HashMap<>();
            SharedPreferences sharedPreferences = this.f19433e.getSharedPreferences(OLD_DEFAULT_PREFS_NAME, 0);
            this.f19429a = sharedPreferences;
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof String) {
                    this.f19430b.put(entry.getKey(), (String) entry.getValue());
                }
            }
        }
    }

    public void libraryPostUpdate(Map<String, String> map, ArrayList<String> arrayList) throws Throwable {
        if (this.f19429a == null) {
            return;
        }
        a();
        ArrayList<String> arrayListA = a(this.f19433e);
        int size = arrayListA.size();
        int i11 = 0;
        while (i11 < size) {
            String str = arrayListA.get(i11);
            i11++;
            String str2 = str;
            a(this.f19433e, str2, arrayList);
            this.f19433e.deleteFile(str2);
        }
    }

    public void libraryUpdate(Map<String, String> map) {
        if (this.f19429a == null) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("ns_ap_fg", "foreground_transitions_count");
        map2.put("installTime", "current_install_timestamp");
        String str = this.f19430b.get("lastActivityTime");
        if (str != null && str.length() != 0) {
            map.put("last_application_accumulation_timestamp", str);
            map.put("last_session_accumulation_timestamp", str);
        }
        map2.put("lastApplicationAccumulationTimestamp", "last_application_accumulation_timestamp");
        map2.put("lastSessionAccumulationTimestamp", "last_session_accumulation_timestamp");
        map2.put("lastApplicationSessionTimestamp", "last_application_session_timestamp");
        map2.put("lastUserSessionTimestamp", "last_user_session_timestamp");
        map2.put("lastActiveUserSessionTimestamp", "last_active_user_session_timestamp");
        map2.put("foregroundTransitionsCount", "foreground_transitions_count");
        map2.put("totalForegroundTime", "total_foreground_time");
        map2.put("totalBackgroundTime", "total_background_time");
        map2.put("totalInactiveTime", "total_inactive_time");
        map2.put("accumulatedForegroundTime", "accumulated_foreground_time");
        map2.put("accumulatedBackgroundTime", "accumulated_background_time");
        map2.put("accumulatedInactiveTime", "accumulated_inactive_time");
        map2.put("accumulatedApplicationSessionTime", "accumulated_application_session_time");
        map2.put("accumulatedActiveUserSessionTime", "accumulated_active_user_session_time");
        map2.put("accumulatedUserSessionTime", "accumulated_user_session_time");
        map2.put("activeUserSessionCount", "active_user_session_count");
        map2.put("userInteractionCount", "user_interaction_count");
        map2.put("userSessionCount", "user_session_count");
        map2.put("applicationSessionCountKey", "application_session_count");
        map2.put("genesis", "genesis");
        map2.put("previousGenesis", "previous_genesis");
        map2.put("installId", "current_install_timestamp");
        map2.put("firstInstallId", "first_install_timestamp");
        map2.put("currentVersion", "previous_app_version");
        map2.put("runs", "runs");
        map2.put("coldStartCount", "cold_start_count");
        map2.put("lastMeasurementProcessedTimestamp", "last_transmission_time");
        map2.put("lastUserInteractionTimestamp", "last_user_interaction_timestamp");
        map2.put("crossPublisherId", "crosspublisher_id_RSA");
        map2.put("md5RawCrossPublisherId", "crosspublisher_id_MD5");
        for (Map.Entry entry : map2.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String str4 = this.f19430b.get(str2);
            if (str4 != null && str4.length() != 0) {
                map.put(str3, str4);
            }
        }
        String str5 = map.get("updated_from_versions");
        map.put("updated_from_versions", (str5 == null || str5.length() == 0) ? "5.4.x" : "5.4.x," + str5);
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f19429a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().clear().commit();
        new Thread(new a()).start();
    }

    private ArrayList<String> a(Context context) {
        String[] list;
        File filesDir = context.getFilesDir();
        if (filesDir == null || !filesDir.isDirectory()) {
            list = null;
        } else {
            list = filesDir.list(new b());
            if (list != null) {
                Arrays.sort(list);
            } else {
                list = new String[0];
            }
        }
        return new ArrayList<>(Arrays.asList(list));
    }

    private void a(Context context, String str, ArrayList<String> arrayList) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.openFileInput(str)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            if (line.length() != 0) {
                                arrayList.add(line);
                            }
                        } else {
                            bufferedReader2.close();
                            return;
                        }
                    } catch (Exception unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException unused3) {
            }
        } catch (Exception unused4) {
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
