package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class RetryUtils {
    public static boolean isClockSkewError(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        String errorCode = amazonServiceException.getErrorCode();
        return "RequestTimeTooSkewed".equals(errorCode) || "RequestExpired".equals(errorCode) || "InvalidSignatureException".equals(errorCode) || "SignatureDoesNotMatch".equals(errorCode);
    }

    public static boolean isInterrupted(Throwable th2) {
        if (th2 instanceof AbortedException) {
            return true;
        }
        if (th2.getCause() == null) {
            return false;
        }
        Throwable cause = th2.getCause();
        return (cause instanceof InterruptedException) || ((cause instanceof InterruptedIOException) && !(cause instanceof SocketTimeoutException));
    }

    public static boolean isRequestEntityTooLargeException(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        return "Request entity too large".equals(amazonServiceException.getErrorCode());
    }

    public static boolean isThrottlingException(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        String errorCode = amazonServiceException.getErrorCode();
        return "Throttling".equals(errorCode) || "ThrottlingException".equals(errorCode) || "ProvisionedThroughputExceededException".equals(errorCode);
    }
}
