package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class AppInitializer {
    private static final String SECTION_NAME = "Startup";
    private static volatile AppInitializer sInstance;
    private static final Object sLock = new Object();
    final Context mContext;
    final Set<Class<? extends Initializer<?>>> mDiscovered = new HashSet();
    final Map<Class<?>, Object> mInitialized = new HashMap();

    AppInitializer(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static AppInitializer getInstance(Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new AppInitializer(context);
                }
            }
        }
        return sInstance;
    }

    public <T> T initializeComponent(Class<? extends Initializer<T>> cls) {
        return (T) doInitialize(cls, new HashSet());
    }

    public boolean isEagerlyInitialized(Class<? extends Initializer<?>> component) {
        return this.mDiscovered.contains(component);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[Catch: all -> 0x0090, TRY_ENTER, TryCatch #0 {all -> 0x0090, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:24:0x0068, B:25:0x006d, B:26:0x006e, B:32:0x007b, B:33:0x008f, B:12:0x0022, B:14:0x003c, B:15:0x0040, B:17:0x0046, B:19:0x0054, B:21:0x0058), top: B:42:0x0009, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:24:0x0068, B:25:0x006d, B:26:0x006e, B:32:0x007b, B:33:0x008f, B:12:0x0022, B:14:0x003c, B:15:0x0040, B:17:0x0046, B:19:0x0054, B:21:0x0058), top: B:42:0x0009, outer: #1, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    <T> T doInitialize(java.lang.Class<? extends androidx.startup.Initializer<?>> r9, java.util.Set<java.lang.Class<?>> r10) {
        /*
            r8 = this;
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            boolean r1 = androidx.tracing.Trace.isEnabled()     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L10
            java.lang.String r2 = r9.getSimpleName()     // Catch: java.lang.Throwable -> L90
            androidx.tracing.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L90
        L10:
            boolean r2 = r10.contains(r9)     // Catch: java.lang.Throwable -> L90
            r3 = 0
            if (r2 != 0) goto L7b
            java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = r8.mInitialized     // Catch: java.lang.Throwable -> L90
            boolean r2 = r2.containsKey(r9)     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto L6e
            r10.add(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L67
            java.lang.reflect.Constructor r2 = r9.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L67
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L67
            r3 = r2
            androidx.startup.Initializer r3 = (androidx.startup.Initializer) r3     // Catch: java.lang.Throwable -> L67
            java.util.List r4 = r3.dependencies()     // Catch: java.lang.Throwable -> L67
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L58
            java.util.Iterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L67
        L40:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L58
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L67
            java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Throwable -> L67
            java.util.Map<java.lang.Class<?>, java.lang.Object> r7 = r8.mInitialized     // Catch: java.lang.Throwable -> L67
            boolean r7 = r7.containsKey(r6)     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L57
            r8.doInitialize(r6, r10)     // Catch: java.lang.Throwable -> L67
        L57:
            goto L40
        L58:
            android.content.Context r5 = r8.mContext     // Catch: java.lang.Throwable -> L67
            java.lang.Object r5 = r3.create(r5)     // Catch: java.lang.Throwable -> L67
            r10.remove(r9)     // Catch: java.lang.Throwable -> L67
            java.util.Map<java.lang.Class<?>, java.lang.Object> r6 = r8.mInitialized     // Catch: java.lang.Throwable -> L67
            r6.put(r9, r5)     // Catch: java.lang.Throwable -> L67
            goto L75
        L67:
            r2 = move-exception
            androidx.startup.StartupException r3 = new androidx.startup.StartupException     // Catch: java.lang.Throwable -> L90
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L90
            throw r3     // Catch: java.lang.Throwable -> L90
        L6e:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = r8.mInitialized     // Catch: java.lang.Throwable -> L90
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L90
            r5 = r2
        L75:
            androidx.tracing.Trace.endSection()     // Catch: java.lang.Throwable -> L96
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            return r5
        L7b:
            java.lang.String r2 = "Cannot initialize %s. Cycle detected."
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r9.getName()     // Catch: java.lang.Throwable -> L90
            r4[r3] = r5     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch: java.lang.Throwable -> L90
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L90
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L90
            throw r3     // Catch: java.lang.Throwable -> L90
        L90:
            r2 = move-exception
            androidx.tracing.Trace.endSection()     // Catch: java.lang.Throwable -> L96
            throw r2     // Catch: java.lang.Throwable -> L96
        L96:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            goto L9a
        L99:
            throw r1
        L9a:
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.startup.AppInitializer.doInitialize(java.lang.Class, java.util.Set):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    void discoverAndInitialize() {
        try {
            try {
                Trace.beginSection(SECTION_NAME);
                Bundle bundle = this.mContext.getPackageManager().getProviderInfo(new ComponentName(this.mContext.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.mContext.getString(R.string.androidx_startup);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (Initializer.class.isAssignableFrom(cls)) {
                                this.mDiscovered.add((Class<? extends Initializer<?>>) cls);
                                doInitialize(cls, hashSet);
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
                throw new StartupException(e);
            }
        } finally {
            Trace.endSection();
        }
    }
}
