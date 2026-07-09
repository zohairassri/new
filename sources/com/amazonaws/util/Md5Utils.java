package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Md5Utils {
    private static final int FOURTEEN = 14;
    private static final int SIXTEEN_K = 16384;

    public static byte[] computeMD5Hash(InputStream inputStream) throws IOException {
        MessageDigest messageDigest;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                bArr = new byte[16384];
            } catch (NoSuchAlgorithmException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Exception e12) {
                LogFactory.getLog(Md5Utils.class).debug("Unable to close input stream of hash candidate: " + e12);
            }
            throw th2;
        }
        while (true) {
            int i11 = bufferedInputStream.read(bArr, 0, 16384);
            if (i11 == -1) {
                byte[] bArrDigest = messageDigest.digest();
                try {
                    bufferedInputStream.close();
                    return bArrDigest;
                } catch (Exception e13) {
                    LogFactory.getLog(Md5Utils.class).debug("Unable to close input stream of hash candidate: " + e13);
                    return bArrDigest;
                }
            }
            messageDigest.update(bArr, 0, i11);
            bufferedInputStream.close();
            throw th2;
        }
    }

    public static String md5AsBase64(InputStream inputStream) throws IOException {
        return Base64.encodeAsString(computeMD5Hash(inputStream));
    }

    public static String md5AsBase64(byte[] bArr) {
        return Base64.encodeAsString(computeMD5Hash(bArr));
    }

    public static String md5AsBase64(File file) throws IOException {
        return Base64.encodeAsString(computeMD5Hash(file));
    }

    public static byte[] computeMD5Hash(byte[] bArr) {
        try {
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (NoSuchAlgorithmException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public static byte[] computeMD5Hash(File file) throws IOException {
        return computeMD5Hash(new FileInputStream(file));
    }
}
