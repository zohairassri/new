package m3;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class b0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f115628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputConnection f115629b;

    public b0(InputConnection inputConnection, Function1 function1) {
        this.f115628a = function1;
        this.f115629b = inputConnection;
    }

    @Override // m3.a0
    public final void a() {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            b(inputConnection);
            this.f115629b = null;
        }
    }

    protected abstract void b(InputConnection inputConnection);

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    protected final InputConnection c() {
        return this.f115629b;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i11) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f115629b != null) {
            a();
            this.f115628a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i11) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i11, int i12) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i11) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i11);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i11) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i11, int i12) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i11, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i11, int i12) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i11, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i11) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i11) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z11) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i11) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i11, int i12) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i11, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i11) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i11, int i12) {
        InputConnection inputConnection = this.f115629b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i11, i12);
        }
        return false;
    }
}
