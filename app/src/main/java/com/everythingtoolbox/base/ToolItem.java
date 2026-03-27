package com.everythingtoolbox.base;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: ToolItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/everythingtoolbox/base/ToolItem;", HttpUrl.FRAGMENT_ENCODE_SET, "id", HttpUrl.FRAGMENT_ENCODE_SET, "name", "description", "iconRes", HttpUrl.FRAGMENT_ENCODE_SET, "category", "Lcom/everythingtoolbox/base/ToolCategory;", "targetClass", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/everythingtoolbox/base/ToolCategory;Ljava/lang/Class;)V", "getCategory", "()Lcom/everythingtoolbox/base/ToolCategory;", "getDescription", "()Ljava/lang/String;", "getIconRes", "()I", "getId", "getName", "getTargetClass", "()Ljava/lang/Class;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ToolItem {
    private final ToolCategory category;
    private final String description;
    private final int iconRes;
    private final String id;
    private final String name;
    private final Class<?> targetClass;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolItem copy$default(ToolItem toolItem, String str, String str2, String str3, int i, ToolCategory toolCategory, Class cls, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = toolItem.id;
        }
        if ((i2 & 2) != 0) {
            str2 = toolItem.name;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = toolItem.description;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = toolItem.iconRes;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            toolCategory = toolItem.category;
        }
        ToolCategory toolCategory2 = toolCategory;
        if ((i2 & 32) != 0) {
            cls = toolItem.targetClass;
        }
        return toolItem.copy(str, str4, str5, i3, toolCategory2, cls);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ToolCategory getCategory() {
        return this.category;
    }

    public final Class<?> component6() {
        return this.targetClass;
    }

    public final ToolItem copy(String id, String name, String description, int iconRes, ToolCategory category, Class<?> targetClass) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(category, "category");
        return new ToolItem(id, name, description, iconRes, category, targetClass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolItem)) {
            return false;
        }
        ToolItem toolItem = (ToolItem) other;
        return Intrinsics.areEqual(this.id, toolItem.id) && Intrinsics.areEqual(this.name, toolItem.name) && Intrinsics.areEqual(this.description, toolItem.description) && this.iconRes == toolItem.iconRes && this.category == toolItem.category && Intrinsics.areEqual(this.targetClass, toolItem.targetClass);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconRes) * 31) + this.category.hashCode()) * 31;
        Class<?> cls = this.targetClass;
        return iHashCode + (cls == null ? 0 : cls.hashCode());
    }

    public String toString() {
        return "ToolItem(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", iconRes=" + this.iconRes + ", category=" + this.category + ", targetClass=" + this.targetClass + ')';
    }

    public ToolItem(String id, String name, String description, int iconRes, ToolCategory category, Class<?> cls) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(category, "category");
        this.id = id;
        this.name = name;
        this.description = description;
        this.iconRes = iconRes;
        this.category = category;
        this.targetClass = cls;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ToolItem(String str, String str2, String str3, int i, ToolCategory toolCategory, Class cls, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Class cls2;
        if ((i2 & 32) == 0) {
            cls2 = cls;
        } else {
            cls2 = null;
        }
        this(str, str2, str3, i, toolCategory, cls2);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final ToolCategory getCategory() {
        return this.category;
    }

    public final Class<?> getTargetClass() {
        return this.targetClass;
    }
}
