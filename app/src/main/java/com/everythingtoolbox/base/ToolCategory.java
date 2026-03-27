package com.everythingtoolbox.base;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: ToolItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/everythingtoolbox/base/ToolCategory;", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "DAILY", "CALCULATOR", "CONVERTER", "DEVICE", "OTHER", "Companion", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum ToolCategory {
    DAILY("日常工具"),
    CALCULATOR("计算工具"),
    CONVERTER("转换工具"),
    DEVICE("设备工具"),
    OTHER("其他工具");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String displayName;

    ToolCategory(String displayName) {
        this.displayName = displayName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: compiled from: ToolItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/everythingtoolbox/base/ToolCategory$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "fromName", "Lcom/everythingtoolbox/base/ToolCategory;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ToolCategory fromName(String name) {
            ToolCategory it;
            Intrinsics.checkNotNullParameter(name, "name");
            ToolCategory[] toolCategoryArrValues = ToolCategory.values();
            int length = toolCategoryArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    it = null;
                    break;
                }
                it = toolCategoryArrValues[i];
                if (Intrinsics.areEqual(it.getDisplayName(), name)) {
                    break;
                }
                i++;
            }
            return it == null ? ToolCategory.OTHER : it;
        }
    }
}
