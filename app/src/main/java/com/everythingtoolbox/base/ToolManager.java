package com.everythingtoolbox.base;

import com.everythingtoolbox.R;
import com.everythingtoolbox.tools.battery.BatteryActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: ToolManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/everythingtoolbox/base/ToolManager;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "tools", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/everythingtoolbox/base/ToolItem;", "getAllCategories", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/everythingtoolbox/base/ToolCategory;", "getAllTools", "getToolsByCategory", "category", "initDefaultTools", HttpUrl.FRAGMENT_ENCODE_SET, "registerTool", "tool", "searchTools", "query", HttpUrl.FRAGMENT_ENCODE_SET, "unregisterTool", "toolId", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ToolManager {
    public static final ToolManager INSTANCE;
    private static final List<ToolItem> tools;

    private ToolManager() {
    }

    static {
        ToolManager toolManager = new ToolManager();
        INSTANCE = toolManager;
        tools = new ArrayList();
        toolManager.initDefaultTools();
    }

    public final List<ToolItem> getAllTools() {
        return CollectionsKt.toList(tools);
    }

    public final List<ToolItem> getToolsByCategory(ToolCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        Iterable $this$filter$iv = tools;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            ToolItem it = (ToolItem) element$iv$iv;
            if (it.getCategory() == category) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return (List) destination$iv$iv;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.everythingtoolbox.base.ToolItem> searchTools(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r2 = "(this as java.lang.Strin….toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.util.List<com.everythingtoolbox.base.ToolItem> r3 = com.everythingtoolbox.base.ToolManager.tools
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r3
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L24:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L86
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.everythingtoolbox.base.ToolItem r10 = (com.everythingtoolbox.base.ToolItem) r10
            r11 = 0
            java.lang.String r12 = r10.getName()
            java.lang.String r13 = "null cannot be cast to non-null type java.lang.String"
            if (r12 == 0) goto L80
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r12 = r12.toLowerCase(r14)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r14 = r1
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r15 = 0
            r0 = 2
            r16 = r3
            r3 = 0
            boolean r12 = kotlin.text.StringsKt.contains$default(r12, r14, r15, r0, r3)
            if (r12 != 0) goto L74
            java.lang.String r12 = r10.getDescription()
            if (r12 == 0) goto L6e
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r12 = r12.toLowerCase(r13)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r13 = r1
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            boolean r0 = kotlin.text.StringsKt.contains$default(r12, r13, r15, r0, r3)
            if (r0 == 0) goto L75
            goto L74
        L6e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r13)
            throw r0
        L74:
            r15 = 1
        L75:
            if (r15 == 0) goto L7b
            r5.add(r9)
        L7b:
            r0 = r18
            r3 = r16
            goto L24
        L80:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r13)
            throw r0
        L86:
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.everythingtoolbox.base.ToolManager.searchTools(java.lang.String):java.util.List");
    }

    public final void registerTool(ToolItem tool) {
        Intrinsics.checkNotNullParameter(tool, "tool");
        Iterable $this$any$iv = tools;
        boolean z = false;
        if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
            Iterator it = $this$any$iv.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object element$iv = it.next();
                ToolItem it2 = (ToolItem) element$iv;
                if (Intrinsics.areEqual(it2.getId(), tool.getId())) {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            tools.add(tool);
        }
    }

    public final void unregisterTool(final String toolId) {
        Intrinsics.checkNotNullParameter(toolId, "toolId");
        CollectionsKt.removeAll((List) tools, (Function1) new Function1<ToolItem, Boolean>() { // from class: com.everythingtoolbox.base.ToolManager.unregisterTool.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(ToolItem it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.areEqual(it.getId(), toolId));
            }
        });
    }

    public final List<ToolCategory> getAllCategories() {
        Iterable $this$map$iv = tools;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            ToolItem it = (ToolItem) item$iv$iv;
            destination$iv$iv.add(it.getCategory());
        }
        return CollectionsKt.distinct((List) destination$iv$iv);
    }

    private final void initDefaultTools() {
        registerTool(new ToolItem("battery", "电池信息", "查看电池状态和健康度", R.drawable.ic_tool_battery, ToolCategory.DEVICE, BatteryActivity.class));
    }
}
