package com.theathletic.drawable;

import android.content.SharedPreferences;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.theathletic.video.component.data.VideoRepository;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/SharedPreferences;", "", TransferTable.COLUMN_KEY, "", VideoRepository.XML_ATTR_VALUE, "", "a", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)V", "core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferences.kt\ncom/theathletic/extension/SharedPreferencesKt\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,37:1\n40#2,13:38\n*S KotlinDebug\n*F\n+ 1 SharedPreferences.kt\ncom/theathletic/extension/SharedPreferencesKt\n*L\n24#1:38,13\n*E\n"})
public final class h0 {
    public static final void a(SharedPreferences sharedPreferences, String key, Object obj) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (obj instanceof Date) {
            editorEdit.putLong(key, ((Date) obj).getTime());
        } else {
            if (obj == null ? true : obj instanceof String) {
                editorEdit.putString(key, (String) obj);
            } else if (obj instanceof Set) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                editorEdit.putStringSet(key, (Set) obj);
            } else if (obj instanceof HashSet) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>");
                editorEdit.putStringSet(key, (HashSet) obj);
            } else if (obj instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                editorEdit.putInt(key, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                editorEdit.putLong(key, ((Number) obj).longValue());
            } else {
                if (!(obj instanceof Float)) {
                    throw new UnsupportedOperationException("Unsupported preference type");
                }
                editorEdit.putFloat(key, ((Number) obj).floatValue());
            }
        }
        editorEdit.apply();
    }
}
