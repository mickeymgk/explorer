package hey.google.explorer;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    static final Uri uri = Uri.parse("content://com.android.externalstorage.documents/root/primary");

    public final boolean shot(String param, ComponentName component) {
        Intent intent = new Intent(param, uri);
        if (component != null)
            intent.setComponent(component);
        boolean b = false;
        try {
            startActivity(intent);
            // waste nobody's time with silly animations
            overridePendingTransition(0, 0);
            finish();
            b = true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (
            !shot("android.intent.action.VIEW", new ComponentName("com.google.android.documentsui", "com.android.documentsui.files.FilesActivity")) &&
            !shot("android.intent.action.VIEW", new ComponentName("com.android.documentsui", "com.android.documentsui.files.FilesActivity")) &&
            !shot("android.intent.action.VIEW", new ComponentName("com.android.documentsui", "com.android.documentsui.FilesActivity")) &&
            !shot("android.intent.action.VIEW", null) &&
            !shot("android.provider.action.BROWSE", null) &&
            !shot("android.provider.action.BROWSE_DOCUMENT_ROOT", null)
        ) {
            // doesn't seem to work on the device!
            Toast.makeText(this, "Error! try rooting.", Toast.LENGTH_LONG).show();
            finish();
        }
    }
}
