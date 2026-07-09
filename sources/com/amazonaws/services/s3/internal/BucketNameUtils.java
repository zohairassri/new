package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum BucketNameUtils {
    ;

    private static final Pattern IP_ADDRESS_PATTERN = Pattern.compile("(\\d+\\.){3}\\d+");
    private static final int MAX_BUCKET_NAME_LENGTH = 63;
    private static final int MIN_BUCKET_NAME_LENGTH = 3;

    private static boolean exception(boolean z11, String str) {
        if (z11) {
            throw new IllegalArgumentException(str);
        }
        return false;
    }

    public static boolean isDNSBucketName(String str) {
        return isValidV2BucketName(str);
    }

    public static boolean isValidV2BucketName(String str) {
        return isValidV2BucketName(str, false);
    }

    public static void validateBucketName(String str) {
        isValidV2BucketName(str, true);
    }

    private static boolean isValidV2BucketName(String str, boolean z11) {
        if (str == null) {
            return exception(z11, "Bucket name cannot be null");
        }
        if (str.length() < 3 || str.length() > 63) {
            return exception(z11, "Bucket name should be between 3 and 63 characters long");
        }
        if (IP_ADDRESS_PATTERN.matcher(str).matches()) {
            return exception(z11, "Bucket name must not be formatted as an IP Address");
        }
        int i11 = 0;
        char c11 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                return exception(z11, "Bucket name should not contain uppercase characters");
            }
            if (cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n') {
                return exception(z11, "Bucket name should not contain white space");
            }
            if (cCharAt == '.') {
                if (c11 == 0) {
                    return exception(z11, "Bucket name should not begin with a period");
                }
                if (c11 == '.') {
                    return exception(z11, "Bucket name should not contain two adjacent periods");
                }
                if (c11 == '-') {
                    return exception(z11, "Bucket name should not contain dashes next to periods");
                }
            } else if (cCharAt == '-') {
                if (c11 == '.') {
                    return exception(z11, "Bucket name should not contain dashes next to periods");
                }
                if (c11 == 0) {
                    return exception(z11, "Bucket name should not begin with a '-'");
                }
            } else if (cCharAt < '0' || ((cCharAt > '9' && cCharAt < 'a') || cCharAt > 'z')) {
                return exception(z11, "Bucket name should not contain '" + cCharAt + "'");
            }
            i11++;
            c11 = cCharAt;
        }
        return (c11 == '.' || c11 == '-') ? exception(z11, "Bucket name should not end with '-' or '.'") : !str.contains(InstructionFileId.DOT);
    }
}
