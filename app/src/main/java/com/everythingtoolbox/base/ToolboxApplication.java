package com.everythingtoolbox.base;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: ToolboxApplication.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/everythingtoolbox/base/ToolboxApplication;", "Landroid/app/Application;", "()V", "onCreate", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ToolboxApplication extends Application {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static ToolboxApplication instance;

    /* JADX INFO: compiled from: ToolboxApplication.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/everythingtoolbox/base/ToolboxApplication$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "<set-?>", "Lcom/everythingtoolbox/base/ToolboxApplication;", "instance", "getInstance", "()Lcom/everythingtoolbox/base/ToolboxApplication;", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ToolboxApplication getInstance() {
            ToolboxApplication toolboxApplication = ToolboxApplication.instance;
            if (toolboxApplication != null) {
                return toolboxApplication;
            }
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            return null;
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
