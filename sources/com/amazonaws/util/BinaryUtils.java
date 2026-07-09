package com.amazonaws.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class BinaryUtils {
    private static final int FF_LOCATION = 6;
    private static final int HEX_LENGTH_8 = 8;
    private static final int HEX_PARSE_16 = 16;

    public static byte[] copyAllBytesFrom(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.hasArray()) {
            return Arrays.copyOfRange(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.arrayOffset() + byteBuffer.limit());
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byteBufferAsReadOnlyBuffer.rewind();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.remaining()];
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static byte[] fromBase64(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str);
    }

    public static byte[] fromHex(String str) {
        byte[] bArr = new byte[(str.length() + 1) / 2];
        int i11 = 0;
        int i12 = 0;
        while (i11 < str.length()) {
            int i13 = i11 + 2;
            bArr[i12] = (byte) Integer.parseInt(str.substring(i11, i13), 16);
            i11 = i13;
            i12++;
        }
        return bArr;
    }

    public static String toBase64(byte[] bArr) {
        return Base64.encodeAsString(bArr);
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            String hexString = Integer.toHexString(b11);
            if (hexString.length() == 1) {
                sb2.append("0");
            } else if (hexString.length() == 8) {
                hexString = hexString.substring(6);
            }
            sb2.append(hexString);
        }
        return StringUtils.lowerCase(sb2.toString());
    }

    public static InputStream toStream(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new ByteArrayInputStream(bArr);
    }
}
