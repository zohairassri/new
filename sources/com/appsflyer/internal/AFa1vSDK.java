package com.appsflyer.internal;

import io.transcend.webview.TranscendConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class AFa1vSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Map AFInAppEventParameterName;
    private static Object AFLogger;
    private static long afInfoLog;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static byte[] f18727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f18728e;
    private static long force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static byte f18729i;
    public static final Map registerClient;
    private static Object unregisterClient;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static long f18730w;

    private static String $$c(short s11, int i11, int i12) {
        int i13 = ($11 + 119) % 128;
        $10 = i13;
        int i14 = -s11;
        int i15 = (i14 * 881) + 104839;
        int i16 = ~i14;
        int i17 = ~(i16 | (-120));
        int i18 = ~(i16 | i11);
        int i19 = (i18 & i17) | (i17 ^ i18);
        int i21 = ~(((-120) & i11) | ((-120) ^ i11));
        int i22 = -(-(((i19 & i21) | (i19 ^ i21)) * (-880)));
        int i23 = (i15 ^ i22) + ((i15 & i22) << 1);
        int i24 = ~i14;
        int i25 = ~i11;
        int i26 = ~(i24 | i25);
        int i27 = ~((i14 & i11) | (i14 ^ i11));
        int i28 = i23 + (((i26 & 119) | (i26 ^ 119) | i27) * (-880));
        int i29 = i27 * 880;
        int i31 = (i28 & i29) + (i29 | i28);
        int i32 = -i12;
        int i33 = i32 * TranscendConstants.TRANSCEND_TCF_CMP_SDK_ID;
        int i34 = (i33 ^ 450870) + ((i33 & 450870) << 1);
        int i35 = ~i32;
        int i36 = (~((i35 & 1130) | (i35 ^ 1130))) | (~(((-1131) ^ i32) | ((-1131) & i32)));
        int i37 = ~(((-1131) ^ i11) | ((-1131) & i11));
        int i38 = (((i34 - (~(((i36 & i37) | (i36 ^ i37)) * 398))) - 1) - (~((i32 | 1130) * (-1194)))) - 1;
        int i39 = ~((-1131) | i25);
        int i41 = ~i32;
        int i42 = i39 | (~((i41 & 1130) | (i41 ^ 1130)));
        int i43 = ~((i32 & (-1131)) | ((-1131) ^ i32));
        int i44 = -(-(((i43 & i42) | (i42 ^ i43)) * 398));
        int i45 = (i38 & i44) + (i44 | i38);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[36 - i11];
        int i46 = 35 - i11;
        int i47 = -1;
        if (bArr == null) {
            int i48 = ((i13 | 83) << 1) - (i13 ^ 83);
            $11 = i48 % 128;
            if (i48 % 2 == 0) {
                int i49 = 22 / 0;
            }
            $11 = (((i13 | 123) << 1) - (i13 ^ 123)) % 128;
            int i51 = i46 * 71;
            int i52 = i45 * (-69);
            int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
            int i54 = ~i46;
            int i55 = (i54 & i45) | (i54 ^ i45);
            int i56 = ~i55;
            int i57 = ~(i45 | i11);
            int i58 = -(-(((i56 & i57) | (i56 ^ i57)) * (-140)));
            int i59 = (i53 & i58) + (i58 | i53);
            int i61 = i46 | i45;
            int i62 = i59 + ((~((i61 & i11) | (i61 ^ i11))) * 70);
            int i63 = ((~(i46 | i11)) | (~((~i45) | i46)) | (~i55)) * 70;
            i31 = ((i62 ^ i63) + ((i63 & i62) << 1)) - 2;
            $10 = ($11 + 77) % 128;
            i45 = i45;
        }
        while (true) {
            int i64 = ((i47 | (-8)) << 1) - (i47 ^ (-8));
            i47 = (i64 ^ 9) + ((i64 & 9) << 1);
            bArr2[i47] = (byte) i31;
            int i65 = (i45 & 1) + (i45 | 1);
            if (i47 == i46) {
                return new String(bArr2, 0);
            }
            byte b11 = bArr[i65];
            int i66 = b11 * 71;
            int i67 = i31 * (-69);
            int i68 = (i66 ^ i67) + ((i66 & i67) << 1);
            int i69 = ~b11;
            int i71 = (i69 & i31) | (i69 ^ i31);
            int i72 = ~i71;
            int i73 = ~(i31 | i11);
            int i74 = -(-(((i72 & i73) | (i72 ^ i73)) * (-140)));
            int i75 = (i68 & i74) + (i74 | i68);
            int i76 = b11 | i31;
            int i77 = i75 + ((~((i76 & i11) | (i76 ^ i11))) * 70);
            int i78 = ((~(b11 | i11)) | (~((~i31) | b11)) | (~i71)) * 70;
            i31 = ((i77 ^ i78) + ((i78 & i77) << 1)) - 2;
            $10 = ($11 + 77) % 128;
            i45 = i65;
        }
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1vSDK.<clinit>():void");
    }

    private AFa1vSDK() {
    }

    public static int getMediationNetwork(int i11) throws Throwable {
        int i12 = $10;
        int i13 = i12 + 87;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        Object obj = unregisterClient;
        $11 = ((i12 & 103) + (i12 | 103)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i11)};
            byte[] bArr = $$a;
            byte b11 = bArr[26];
            byte b12 = bArr[146];
            int iIntValue = ((Integer) Class.forName($$c(b11, b12, (short) ((b12 ^ 592) | (b12 & 592))), true, (ClassLoader) AFLogger).getMethod($$c(bArr[50], bArr[182], bArr[5]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i14 = $10;
            int i15 = (i14 ^ 57) + ((i14 & 57) << 1);
            $11 = i15 % 128;
            if (i15 % 2 != 0) {
                return iIntValue;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int getMonetizationNetwork(Object obj) throws Throwable {
        int i11 = ($10 + 9) % 128;
        $11 = i11;
        Object obj2 = unregisterClient;
        $10 = (((i11 | 43) << 1) - (i11 ^ 43)) % 128;
        try {
            byte[] bArr = $$a;
            byte b11 = bArr[26];
            byte b12 = bArr[146];
            return ((Integer) Class.forName($$c(b11, b12, (short) ((b12 ^ 592) | (b12 & 592))), true, (ClassLoader) AFLogger).getMethod($$c(bArr[50], bArr[8], bArr[940]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object getRevenue(int i11, int i12, char c11) throws Throwable {
        int i13 = $10 + 23;
        int i14 = i13 % 128;
        $11 = i14;
        if (i13 % 2 == 0) {
            throw null;
        }
        Object obj = unregisterClient;
        int i15 = (i14 + 71) % 128;
        $10 = i15;
        $11 = (i15 + 3) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(c11)};
            byte[] bArr = $$a;
            byte b11 = bArr[26];
            byte b12 = bArr[146];
            Class<?> cls = Class.forName($$c(b11, b12, (short) (b12 | 592)), true, (ClassLoader) AFLogger);
            String str$$c = $$c(bArr[50], bArr[4], bArr[105]);
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i16 = $11;
            int i17 = (i16 ^ 53) + ((i16 & 53) << 1);
            $10 = i17 % 128;
            if (i17 % 2 == 0) {
                return objInvoke;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    static void init$0() {
        $10 = ($11 + 119) % 128;
        byte[] bArr = new byte[1140];
        System.arraycopy("\u0019N¹&\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001dÒKÛó\t\n\u0002\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f\u000fø\u0010ÿüýÌ5\u0011\u0002À\u0015$\u0013÷\u000fõ\r\u0007Ý\u0016\fõþ\u0005\u0014ÿ\u0002õ\u000b\bÏ1\u0002þÿü\u0000\u0015÷\b\u0001\u000fø\u0010ÿüýÌ5\u0011\u0002À\u00151\u0002Ù'\u0005õ\u0001\r\t\u0000\u0011×'ý\r÷ú\r×1\u0002þÿü\u0000\u0015÷\b\u0001\u0000\u0011Ô%\u0005û\u0010Ó'\u000b\u0000\u0011Ñ.÷\u0003à \u0004\u0007ÿá'\u000b\u0000\u0011Ñ \u0004\u0007ÿá'\u000b7ÿ\u0015ïÐ7ÿ\u0015ïÐù\u0017íÏ=\bÁ\u001a%\u0005ûù\u0017íÏ=\bÁHû\u0005ö\u0007\u000bù\u0017íÏ@÷\u000fûÉ'(ü\u0003ó\n\u0000\u0011Þ$ÿ\u0003÷\u000f\u0004\u0007\u000e÷\u0003ü\u0006\u0000\u0004\u0007ÿ\u000fø\u0010ÿüýÌC\u0006½\u00165ö\u0005úÂ4ñ\u000f\u0003ø\b\u0001ó\t\u0016ì\u0007\b\u0000\u000fë\u001dù\róí\bì\nù\u0017íÏ=\bÁ\u001d\bø5í\u0004\r\u0006÷\b\u0001\u0014ÿ\u0002õ\u000b\bâ\u0017\u0006úê\u001e\u0005\u0002ÿ\fù\u0017íÏ=\bÁ\u001a%\u0005ûì(\u0001þ\u0007\u0001á#\u0000õþ\u000e\u000b\u0005\u0006ôí\u0005ï\n4\u0014\u0002ô\u0011\u0001¾6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ4Î\u0000\u0011à\u0015\u0010þ\bÿó\u0004ù\u0017íÏBù\u0011¼)ÿü\u0000\u0011Þ\u0013\u0015öù\u0017íÏ=\bÁ\u00165ó\u0002\u0001\u000fõ\u0001ç'\u0004\u0007\u0001á#\u0000õþ\u000eù\u0017íÏ=\bÁ\u001d'\u0004\u0007\u0001á#\u0000õþ\u000eù\u0017íÏ=\bÁ\u0018\u001f\u0015ïê'\u0004\u0007\u0001á#\u0000õþ\u000eõþ\u0005ä1ù\u0002\u000fù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aÒ'\u0004\u0007\u0001á#\u0000õþ\u000e\u0013\u0002ñ\u001aì\u000e\u0003\u000b\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007'ÈEáó\t\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007\u001dÒKÛó\t\n\u0002\u0000\u0011Ñ4ÿ\u0002õ\u000b÷\u0018Ò,þÇ\u0000\u0001\b\u000e.÷\u0003ú\u0000\tõþ\u0005ô\u0011à\u0015þ\u0005í!\u0000\u000fí\u0006î\nýù\ró\u0000\u0011Ô\u0000ù\u0017íÏ=\bÁ\u001a%\u0005ûá#\u0010ò\u0011ù\t\u0006ý\u0005\b÷÷ÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0018#\u0015Ð%\u0005û\u0005ô\u0005â#\u0015\u0000\u0011Ï#\u0013þÿ\u000b\u0001óí\u0013\u0015ö\u0003\tû\u0011ó\u0000\u0011Ñ+÷\u0014\u0002Û%ô\u0005\u0003\u000fù\u0017íÏI\u0001÷\u0005ÄNñ\tÀ.\u0011\tÛ'\u0004\u0007\u0001á#\u0000õþ\u000e\u0000\u0011Ü\u0019\u0015þÓ+\b\u0000\tù\u0017íÏI\u0001÷\u0005ÄNñ\tÀ.\u0011\t×+\b\u0000\t\u0000\u0011á\u0018\u0013íù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aØ(\u0001þ\u0007\u0001á#\u0000õþ\u000eýÕ9ýóÞ3\u0002ñ\u001aù\u0017íÏ=\bÁ\u0017+\u0005\u0006ôþ\u0003\fûÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u001d'á\u001a\n\u0004\u0005\tÍ#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000fù\u0017íÏBý\bÁ\u00169ýóß5ó\u0002\u0001\u000fù\u0017íÏ@÷\u000fûÉ\u0017+÷\u0014\u0002Û%ô\u0005\u0003\u000fýñ\u0011ÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0016!\u0014ôá#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000fó\u0015öæ\u001f\f\u0003õ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÍ'\u000bõ\u0000\u0013ý\u0005ùþ\u0010õ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÙ\u0013\u0015öß)û\nú\u000b\b\u0001\u0000\u0011Ñ.\u0000\u0005\u0001\u0001ù\u000b\bâ'ù÷í\nê\n\u0005ô\u0005á+÷\u0014\u0002\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001dÒGßó\tÛQ4\u0014\u0002ô\u0011\u0001¾6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ5Íí\të\nH\u0003³Hý\r\u0002ø\u0001\u0004\n\n¯Nû\u0003\u0010·\u0000\u0011Û$\u0001ù\u0011÷\u0013é\u0015÷\b\u0001â\u0019\u0011\u0005ú\u0005û\u0000\u0011Û\u001a\u0001\u0007ú\u0015÷\b\u0001â\u0019\u0011\u0005ú\u0005û\u0000\u0011à\u0015\u0013ñ\u000b\tò".getBytes("ISO-8859-1"), 0, bArr, 0, 1140);
        $$a = bArr;
        $$b = 166;
        int i11 = $11;
        $10 = ((i11 & 31) + (i11 | 31)) % 128;
    }
}
