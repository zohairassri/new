package io.agora.mediaplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes7.dex */
public class AssetsFileReader {
    public static final String PREFIX_ASSETS = "/assets/";
    private static final String TAG = "AssetsFileReader";
    private FileInputStream fileInputStream = null;
    private FileChannel fileChannel = null;
    private AssetFileDescriptor afd = null;
    private long startOffset_ = 0;
    private long length_ = 0;

    @CalledByNative
    public AssetsFileReader() {
        Logging.v(TAG, "constructor");
    }

    @CalledByNative
    public static boolean checkAssetExists(String str) {
        StringBuilder sb2;
        String str2;
        String string;
        boolean z11 = false;
        if (str == null || !str.startsWith("/assets/")) {
            return false;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            string = "checkAssetExists: context is null";
        } else {
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = applicationContext.getAssets().openFd(str.substring(8));
                z11 = true;
                if (assetFileDescriptorOpenFd == null) {
                    return true;
                }
                try {
                    assetFileDescriptorOpenFd.close();
                    return true;
                } catch (IOException e11) {
                    e = e11;
                    sb2 = new StringBuilder();
                    str2 = "checkAssetExists close error: ";
                    sb2.append(str2);
                    sb2.append(e.getMessage());
                    string = sb2.toString();
                    Logging.e(TAG, string);
                    return z11;
                }
            } catch (Exception e12) {
                e = e12;
                sb2 = new StringBuilder();
                str2 = "checkAssetExists error: ";
            }
        }
        Logging.e(TAG, string);
        return z11;
    }

    @CalledByNative
    public void closeFile() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e11) {
                e11.printStackTrace();
                Logging.e(TAG, "AssetsFileReader closeFile Step1 error: " + e11.getMessage());
            }
            this.fileChannel = null;
        }
        FileInputStream fileInputStream = this.fileInputStream;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e12) {
                e12.printStackTrace();
                Logging.e(TAG, "AssetsFileReader closeFile Step2 error: " + e12.getMessage());
            }
            this.fileInputStream = null;
        }
        AssetFileDescriptor assetFileDescriptor = this.afd;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException e13) {
                e13.printStackTrace();
                Logging.e(TAG, "AssetsFileReader closeFile Step3 error: " + e13.getMessage());
            }
            this.afd = null;
        }
    }

    @CalledByNative
    public long getCurrentPosition() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            return fileChannel.position();
        } catch (Exception e11) {
            e11.printStackTrace();
            Logging.e(TAG, " read error: " + e11.getMessage());
            return -2L;
        }
    }

    @CalledByNative
    public long getFileSize() {
        if (this.fileChannel == null) {
            return -2L;
        }
        try {
            return this.length_;
        } catch (Exception e11) {
            e11.printStackTrace();
            Logging.e(TAG, "getFileSize error:" + e11.getMessage());
            return -2L;
        }
    }

    @CalledByNative
    public int open(String str) {
        if (this.fileInputStream != null) {
            Logging.e(TAG, "has opened file ");
            return -2;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenFd = ContextUtils.getApplicationContext().getAssets().openFd(str.substring(str.indexOf("/assets/") + 8));
            this.afd = assetFileDescriptorOpenFd;
            this.startOffset_ = assetFileDescriptorOpenFd.getStartOffset();
            this.length_ = this.afd.getLength();
            FileInputStream fileInputStreamCreateInputStream = this.afd.createInputStream();
            this.fileInputStream = fileInputStreamCreateInputStream;
            this.fileChannel = fileInputStreamCreateInputStream.getChannel();
            return 0;
        } catch (Exception e11) {
            e11.printStackTrace();
            Logging.e(TAG, "open error:" + e11.getMessage());
            closeFile();
            return -3;
        }
    }

    @CalledByNative
    public int read(ByteBuffer byteBuffer) {
        if (this.fileChannel == null) {
            return -2;
        }
        byteBuffer.clear();
        try {
            long jPosition = this.fileChannel.position();
            if (jPosition - this.startOffset_ > this.length_) {
                return -1;
            }
            long j11 = this.fileChannel.read(byteBuffer);
            long j12 = (jPosition + j11) - this.startOffset_;
            long j13 = this.length_;
            if (j12 > j13) {
                j11 -= j12 - j13;
            }
            return (int) j11;
        } catch (IOException e11) {
            e11.printStackTrace();
            Logging.e(TAG, "AssetsFileReader read error: " + e11.getMessage());
            return -2;
        }
    }

    @CalledByNative
    public long seek(long j11) {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            fileChannel.position(this.startOffset_ + j11);
            return j11;
        } catch (Exception e11) {
            e11.printStackTrace();
            Logging.e(TAG, "AssetsFileReader seek error: " + e11.getMessage());
            return -2L;
        }
    }
}
