package com.theathletic.graphic;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
public class c {
    public static Bitmap a(Bitmap bitmap, int i11, boolean z11) {
        int i12;
        int i13 = i11;
        Bitmap bitmapCopy = z11 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i13 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i14 = width * height;
        int[] iArr = new int[i14];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i15 = width - 1;
        int i16 = height - 1;
        int i17 = i13 + i13;
        int i18 = i17 + 1;
        int[] iArr2 = new int[i14];
        int[] iArr3 = new int[i14];
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[Math.max(width, height)];
        int i19 = (i17 + 2) >> 1;
        int i21 = i19 * i19;
        int i22 = i21 * 256;
        int[] iArr6 = new int[i22];
        int i23 = 0;
        for (int i24 = 0; i24 < i22; i24++) {
            iArr6[i24] = i24 / i21;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i18, 3);
        int i25 = i13 + 1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < height) {
            int[] iArr8 = iArr6;
            int i29 = -i13;
            int i31 = i23;
            int i32 = i31;
            int i33 = i32;
            int i34 = i33;
            int i35 = i34;
            int i36 = i35;
            int i37 = i36;
            int i38 = i37;
            int i39 = i38;
            while (i29 <= i13) {
                int[] iArr9 = iArr4;
                Bitmap bitmap2 = bitmapCopy;
                int i41 = i23;
                int i42 = iArr[i27 + Math.min(i15, Math.max(i29, i41))];
                int[] iArr10 = iArr7[i29 + i13];
                iArr10[i41] = (i42 & 16711680) >> 16;
                iArr10[1] = (i42 & 65280) >> 8;
                iArr10[2] = i42 & 255;
                int iAbs = i25 - Math.abs(i29);
                int i43 = iArr10[i41];
                i39 += i43 * iAbs;
                int i44 = iArr10[1];
                i31 += i44 * iAbs;
                int i45 = iArr10[2];
                i32 += iAbs * i45;
                if (i29 > 0) {
                    i36 += i43;
                    i37 += i44;
                    i38 += i45;
                } else {
                    i33 += i43;
                    i34 += i44;
                    i35 += i45;
                }
                i29++;
                iArr4 = iArr9;
                bitmapCopy = bitmap2;
                i23 = 0;
            }
            int[] iArr11 = iArr4;
            Bitmap bitmap3 = bitmapCopy;
            int i46 = i13;
            int i47 = 0;
            while (i47 < width) {
                iArr2[i27] = iArr8[i39];
                iArr3[i27] = iArr8[i31];
                iArr11[i27] = iArr8[i32];
                int i48 = i39 - i33;
                int i49 = i31 - i34;
                int i51 = i32 - i35;
                int[] iArr12 = iArr7[((i46 - i13) + i18) % i18];
                int i52 = i33 - iArr12[0];
                int i53 = i34 - iArr12[1];
                int i54 = i35 - iArr12[2];
                if (i26 == 0) {
                    i12 = i47;
                    iArr5[i12] = Math.min(i47 + i13 + 1, i15);
                } else {
                    i12 = i47;
                }
                int i55 = iArr[i28 + iArr5[i12]];
                int i56 = (i55 & 16711680) >> 16;
                iArr12[0] = i56;
                int i57 = (i55 & 65280) >> 8;
                iArr12[1] = i57;
                int i58 = i55 & 255;
                iArr12[2] = i58;
                int i59 = i36 + i56;
                int i61 = i37 + i57;
                int i62 = i38 + i58;
                i39 = i48 + i59;
                i31 = i49 + i61;
                i32 = i51 + i62;
                i46 = (i46 + 1) % i18;
                int[] iArr13 = iArr7[i46 % i18];
                int i63 = iArr13[0];
                i33 = i52 + i63;
                int i64 = iArr13[1];
                i34 = i53 + i64;
                int i65 = iArr13[2];
                i35 = i54 + i65;
                i36 = i59 - i63;
                i37 = i61 - i64;
                i38 = i62 - i65;
                i27++;
                i47 = i12 + 1;
            }
            i28 += width;
            i26++;
            iArr6 = iArr8;
            iArr4 = iArr11;
            bitmapCopy = bitmap3;
            i23 = 0;
        }
        int[] iArr14 = iArr6;
        int[] iArr15 = iArr4;
        Bitmap bitmap4 = bitmapCopy;
        int i66 = 0;
        while (i66 < width) {
            int i67 = -i13;
            int i68 = i66;
            int i69 = i67 * width;
            int i71 = 0;
            int i72 = 0;
            int i73 = 0;
            int i74 = 0;
            int i75 = 0;
            int i76 = 0;
            int i77 = 0;
            int i78 = 0;
            int i79 = 0;
            while (i67 <= i13) {
                int iMax = Math.max(0, i69) + i68;
                int[] iArr16 = iArr7[i67 + i11];
                iArr16[0] = iArr2[iMax];
                iArr16[1] = iArr3[iMax];
                iArr16[2] = iArr15[iMax];
                int iAbs2 = i25 - Math.abs(i67);
                i79 += iArr2[iMax] * iAbs2;
                i71 += iArr3[iMax] * iAbs2;
                i72 += iArr15[iMax] * iAbs2;
                if (i67 > 0) {
                    i76 += iArr16[0];
                    i77 += iArr16[1];
                    i78 += iArr16[2];
                } else {
                    i73 += iArr16[0];
                    i74 += iArr16[1];
                    i75 += iArr16[2];
                }
                if (i67 < i16) {
                    i69 += width;
                }
                i67++;
                i13 = i11;
            }
            int i81 = i79;
            int i82 = i68;
            int i83 = i11;
            for (int i84 = 0; i84 < height; i84++) {
                iArr[i82] = (iArr[i82] & (-16777216)) | (iArr14[i81] << 16) | (iArr14[i71] << 8) | iArr14[i72];
                int i85 = i81 - i73;
                int i86 = i71 - i74;
                int i87 = i72 - i75;
                int[] iArr17 = iArr7[((i83 - i11) + i18) % i18];
                int i88 = i73 - iArr17[0];
                int i89 = i74 - iArr17[1];
                int i91 = i75 - iArr17[2];
                int i92 = i82;
                if (i68 == 0) {
                    iArr5[i84] = Math.min(i84 + i25, i16) * width;
                }
                int i93 = i68 + iArr5[i84];
                int i94 = iArr2[i93];
                iArr17[0] = i94;
                int i95 = iArr3[i93];
                iArr17[1] = i95;
                int i96 = iArr15[i93];
                iArr17[2] = i96;
                int i97 = i76 + i94;
                int i98 = i77 + i95;
                int i99 = i78 + i96;
                i81 = i85 + i97;
                i71 = i86 + i98;
                i72 = i87 + i99;
                i83 = (i83 + 1) % i18;
                int[] iArr18 = iArr7[i83];
                int i100 = iArr18[0];
                i73 = i88 + i100;
                int i101 = iArr18[1];
                i74 = i89 + i101;
                int i102 = iArr18[2];
                i75 = i91 + i102;
                i76 = i97 - i100;
                i77 = i98 - i101;
                i78 = i99 - i102;
                i82 = i92 + width;
            }
            i66 = i68 + 1;
            i13 = i11;
        }
        bitmap4.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap4;
    }
}
