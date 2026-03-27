package com.everythingtoolbox.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.everythingtoolbox.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: BaseToolActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H$J\b\u0010\u0005\u001a\u00020\u0006H$J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0014J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/everythingtoolbox/ui/BaseToolActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "getActivityTitle", HttpUrl.FRAGMENT_ENCODE_SET, "getLayoutResId", HttpUrl.FRAGMENT_ENCODE_SET, "initData", HttpUrl.FRAGMENT_ENCODE_SET, "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", HttpUrl.FRAGMENT_ENCODE_SET, "item", "Landroid/view/MenuItem;", "setupToolbar", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseToolActivity extends AppCompatActivity {
    protected abstract String getActivityTitle();

    protected abstract int getLayoutResId();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        setupToolbar();
        initViews();
        initData();
    }

    private final void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            ActionBar $this$setupToolbar_u24lambda_u2d0 = getSupportActionBar();
            if ($this$setupToolbar_u24lambda_u2d0 != null) {
                $this$setupToolbar_u24lambda_u2d0.setTitle(getActivityTitle());
                $this$setupToolbar_u24lambda_u2d0.setDisplayHomeAsUpEnabled(true);
                $this$setupToolbar_u24lambda_u2d0.setDisplayShowHomeEnabled(true);
            }
            int i = 0;
            int childCount = toolbar.getChildCount();
            if (childCount > 0) {
                do {
                    int i2 = i;
                    i++;
                    View child = toolbar.getChildAt(i2);
                    if (child instanceof TextView) {
                        ((TextView) child).setGravity(16);
                    }
                } while (i < childCount);
            }
        }
    }

    protected void initViews() {
    }

    protected void initData() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
