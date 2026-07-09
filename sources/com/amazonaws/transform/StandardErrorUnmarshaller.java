package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.XpathUtils;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class StandardErrorUnmarshaller extends AbstractErrorUnmarshaller<Node> {
    public StandardErrorUnmarshaller() {
    }

    public String getErrorPropertyPath(String str) {
        return "ErrorResponse/Error/" + str;
    }

    public String parseErrorCode(Node node) throws Exception {
        return XpathUtils.asString("ErrorResponse/Error/Code", node);
    }

    protected StandardErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        super(cls);
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(Node node) throws Exception {
        String errorCode = parseErrorCode(node);
        String strAsString = XpathUtils.asString("ErrorResponse/Error/Type", node);
        String strAsString2 = XpathUtils.asString("ErrorResponse/RequestId", node);
        AmazonServiceException amazonServiceExceptionNewException = newException(XpathUtils.asString("ErrorResponse/Error/Message", node));
        amazonServiceExceptionNewException.setErrorCode(errorCode);
        amazonServiceExceptionNewException.setRequestId(strAsString2);
        if (strAsString == null) {
            amazonServiceExceptionNewException.setErrorType(AmazonServiceException.ErrorType.Unknown);
            return amazonServiceExceptionNewException;
        }
        if ("Receiver".equalsIgnoreCase(strAsString)) {
            amazonServiceExceptionNewException.setErrorType(AmazonServiceException.ErrorType.Service);
            return amazonServiceExceptionNewException;
        }
        if ("Sender".equalsIgnoreCase(strAsString)) {
            amazonServiceExceptionNewException.setErrorType(AmazonServiceException.ErrorType.Client);
        }
        return amazonServiceExceptionNewException;
    }
}
