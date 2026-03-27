package com.everythingtoolbox.ui.home;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.everythingtoolbox.R;
import com.everythingtoolbox.ui.home.HomeFragment;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: compiled from: HomeFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001b0!H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0002J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020&H\u0016J\b\u00101\u001a\u00020&H\u0016J\u001a\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00104\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/everythingtoolbox/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "isRunning", HttpUrl.FRAGMENT_ENCODE_SET, "progressCpu", "Landroid/widget/ProgressBar;", "progressMemory", "tvAndroidVersion", "Landroid/widget/TextView;", "tvBrand", "tvCpuCores", "tvCpuUsage", "tvHitokoto", "tvHitokotoFrom", "tvMemoryAvail", "tvMemoryUsage", "tvModel", "tvProcessor", "tvScreenDensity", "tvScreenResolution", "tvSdkVersion", "tvStorage", "tvTotalMemory", "formatMemorySize", HttpUrl.FRAGMENT_ENCODE_SET, "bytes", HttpUrl.FRAGMENT_ENCODE_SET, "getCpuInfo", "getCpuUsage", HttpUrl.FRAGMENT_ENCODE_SET, "getDeviceName", "getMemoryInfo", "Lkotlin/Pair;", "getScreenSize", "getStorageInfo", "getTotalMemory", "loadDeviceInfo", HttpUrl.FRAGMENT_ENCODE_SET, "loadHitokoto", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "startSystemMonitor", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HomeFragment extends Fragment {
    private boolean isRunning = true;
    private ProgressBar progressCpu;
    private ProgressBar progressMemory;
    private TextView tvAndroidVersion;
    private TextView tvBrand;
    private TextView tvCpuCores;
    private TextView tvCpuUsage;
    private TextView tvHitokoto;
    private TextView tvHitokotoFrom;
    private TextView tvMemoryAvail;
    private TextView tvMemoryUsage;
    private TextView tvModel;
    private TextView tvProcessor;
    private TextView tvScreenDensity;
    private TextView tvScreenResolution;
    private TextView tvSdkVersion;
    private TextView tvStorage;
    private TextView tvTotalMemory;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(R.id.progressCpu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.progressCpu)");
        this.progressCpu = (ProgressBar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.progressMemory);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.progressMemory)");
        this.progressMemory = (ProgressBar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tvCpuUsage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.tvCpuUsage)");
        this.tvCpuUsage = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tvMemoryUsage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.tvMemoryUsage)");
        this.tvMemoryUsage = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tvMemoryAvail);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.tvMemoryAvail)");
        this.tvMemoryAvail = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.tvBrand);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.tvBrand)");
        this.tvBrand = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tvModel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.tvModel)");
        this.tvModel = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tvAndroidVersion);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.tvAndroidVersion)");
        this.tvAndroidVersion = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.tvSdkVersion);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "view.findViewById(R.id.tvSdkVersion)");
        this.tvSdkVersion = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.tvProcessor);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "view.findViewById(R.id.tvProcessor)");
        this.tvProcessor = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.tvCpuCores);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "view.findViewById(R.id.tvCpuCores)");
        this.tvCpuCores = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.tvScreenResolution);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "view.findViewById(R.id.tvScreenResolution)");
        this.tvScreenResolution = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.tvScreenDensity);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "view.findViewById(R.id.tvScreenDensity)");
        this.tvScreenDensity = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.tvTotalMemory);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "view.findViewById(R.id.tvTotalMemory)");
        this.tvTotalMemory = (TextView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.tvStorage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "view.findViewById(R.id.tvStorage)");
        this.tvStorage = (TextView) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.tvHitokoto);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "view.findViewById(R.id.tvHitokoto)");
        this.tvHitokoto = (TextView) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.tvHitokotoFrom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "view.findViewById(R.id.tvHitokotoFrom)");
        this.tvHitokotoFrom = (TextView) viewFindViewById17;
        loadDeviceInfo();
        loadHitokoto();
        startSystemMonitor();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.isRunning = true;
        startSystemMonitor();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.isRunning = false;
    }

    private final void startSystemMonitor() {
        new Thread(new Runnable() { // from class: com.everythingtoolbox.ui.home.HomeFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                HomeFragment.m51startSystemMonitor$lambda1(this.f$0);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startSystemMonitor$lambda-1, reason: not valid java name */
    public static final void m51startSystemMonitor$lambda1(final HomeFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        while (this$0.isRunning) {
            try {
                final int cpuUsage = this$0.getCpuUsage();
                final Pair<Integer, Long> memoryInfo = this$0.getMemoryInfo();
                FragmentActivity activity = this$0.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: com.everythingtoolbox.ui.home.HomeFragment$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            HomeFragment.m52startSystemMonitor$lambda1$lambda0(this.f$0, cpuUsage, memoryInfo);
                        }
                    });
                }
                Thread.sleep(2000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startSystemMonitor$lambda-1$lambda-0, reason: not valid java name */
    public static final void m52startSystemMonitor$lambda1$lambda0(HomeFragment this$0, int $cpuUsage, Pair memoryInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(memoryInfo, "$memoryInfo");
        ProgressBar progressBar = this$0.progressCpu;
        TextView textView = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressCpu");
            progressBar = null;
        }
        progressBar.setProgress($cpuUsage);
        ProgressBar progressBar2 = this$0.progressMemory;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressMemory");
            progressBar2 = null;
        }
        progressBar2.setProgress(((Number) memoryInfo.getFirst()).intValue());
        TextView textView2 = this$0.tvCpuUsage;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvCpuUsage");
            textView2 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append($cpuUsage);
        sb.append('%');
        textView2.setText(sb.toString());
        TextView textView3 = this$0.tvMemoryUsage;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvMemoryUsage");
            textView3 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((Number) memoryInfo.getFirst()).intValue());
        sb2.append('%');
        textView3.setText(sb2.toString());
        TextView textView4 = this$0.tvMemoryAvail;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvMemoryAvail");
        } else {
            textView = textView4;
        }
        textView.setText("可用内存: " + ((Number) memoryInfo.getSecond()).longValue() + "MB");
    }

    private final int getCpuUsage() {
        try {
            RandomAccessFile reader = new RandomAccessFile("/proc/stat", "r");
            String load = reader.readLine();
            reader.close();
            Intrinsics.checkNotNullExpressionValue(load, "load");
            Collection $this$toTypedArray$iv = new Regex(" +").split(load, 0);
            Object[] array = $this$toTypedArray$iv.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] toks = (String[]) array;
            long idle1 = Long.parseLong(toks[4]);
            long cpu1 = Long.parseLong(toks[1]) + Long.parseLong(toks[2]) + Long.parseLong(toks[3]) + Long.parseLong(toks[5]) + Long.parseLong(toks[6]) + Long.parseLong(toks[7]);
            Thread.sleep(360L);
            RandomAccessFile reader2 = new RandomAccessFile("/proc/stat", "r");
            String load2 = reader2.readLine();
            reader2.close();
            Intrinsics.checkNotNullExpressionValue(load2, "load2");
            Collection $this$toTypedArray$iv2 = new Regex(" +").split(load2, 0);
            Object[] array2 = $this$toTypedArray$iv2.toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] toks2 = (String[]) array2;
            long idle2 = Long.parseLong(toks2[4]);
            long cpu2 = Long.parseLong(toks2[1]) + Long.parseLong(toks2[2]) + Long.parseLong(toks2[3]) + Long.parseLong(toks2[5]) + Long.parseLong(toks2[6]) + Long.parseLong(toks2[7]);
            return RangesKt.coerceIn((int) (((cpu2 - cpu1) * ((long) 100)) / (((cpu2 - cpu1) + idle2) - idle1)), 0, 100);
        } catch (Exception e) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008e, code lost:
    
        r13.close();
        r4 = r8 - r13;
        r0 = (int) ((((long) 100) * r4) / r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
    
        return new kotlin.Pair<>(java.lang.Integer.valueOf(r0), java.lang.Long.valueOf(r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.Pair<java.lang.Integer, java.lang.Long> getMemoryInfo() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.everythingtoolbox.ui.home.HomeFragment.getMemoryInfo():kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void loadDeviceInfo() {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.everythingtoolbox.ui.home.HomeFragment.loadDeviceInfo():void");
    }

    private final String getScreenSize() {
        try {
            Object systemService = requireContext().getSystemService("window");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            }
            WindowManager windowManager = (WindowManager) systemService;
            Display display = windowManager.getDefaultDisplay();
            DisplayMetrics metrics = new DisplayMetrics();
            display.getRealMetrics(metrics);
            return metrics.widthPixels + " x " + metrics.heightPixels;
        } catch (Exception e) {
            try {
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                return displayMetrics.widthPixels + " x " + displayMetrics.heightPixels;
            } catch (Exception e2) {
                return "Unknown";
            }
        }
    }

    private final String getDeviceName() {
        try {
            Method method = Build.class.getMethod("getString", String.class);
            Object objInvoke = method.invoke(Build.class, "ro.product.device");
            String str = objInvoke instanceof String ? (String) objInvoke : null;
            return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        } catch (Exception e) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r6 = kotlin.text.StringsKt.substringAfter$default(r10, ":", (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r6 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        r2 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r6).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getCpuInfo() {
        /*
            r14 = this;
            java.lang.String r0 = "Unknown"
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String r2 = ""
            if (r1 != 0) goto L9
            r1 = r2
        L9:
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "goldfish"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            r6 = 2
            r7 = 0
            boolean r3 = kotlin.text.StringsKt.contains$default(r3, r4, r5, r6, r7)
            if (r3 != 0) goto Lbe
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "ranchu"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = kotlin.text.StringsKt.contains$default(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L28
            goto Lbe
        L28:
            r3 = 1
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> Laf
            java.lang.String r8 = "/proc/cpuinfo"
            java.lang.String r9 = "r"
            r4.<init>(r8, r9)     // Catch: java.lang.Exception -> Laf
            r8 = 0
            r9 = 0
        L36:
            java.lang.String r10 = r4.readLine()     // Catch: java.lang.Exception -> Laf
            if (r10 != 0) goto L3e
            goto L88
        L3e:
            java.lang.String r11 = "Hardware"
            boolean r11 = kotlin.text.StringsKt.startsWith$default(r10, r11, r5, r6, r7)     // Catch: java.lang.Exception -> Laf
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.CharSequence"
            java.lang.String r13 = ":"
            if (r11 != 0) goto L75
            java.lang.String r11 = "model name"
            boolean r11 = kotlin.text.StringsKt.startsWith$default(r10, r11, r5, r6, r7)     // Catch: java.lang.Exception -> Laf
            if (r11 == 0) goto L54
            goto L75
        L54:
            java.lang.String r11 = "Processor"
            boolean r11 = kotlin.text.StringsKt.startsWith$default(r10, r11, r5, r6, r7)     // Catch: java.lang.Exception -> Laf
            if (r11 == 0) goto L36
            java.lang.String r6 = kotlin.text.StringsKt.substringAfter$default(r10, r13, r7, r6, r7)     // Catch: java.lang.Exception -> Laf
            if (r6 == 0) goto L6f
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Exception -> Laf
            java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)     // Catch: java.lang.Exception -> Laf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Laf
            r2 = r6
            r9 = 1
            goto L88
        L6f:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> Laf
            r6.<init>(r12)     // Catch: java.lang.Exception -> Laf
            throw r6     // Catch: java.lang.Exception -> Laf
        L75:
            java.lang.String r6 = kotlin.text.StringsKt.substringAfter$default(r10, r13, r7, r6, r7)     // Catch: java.lang.Exception -> Laf
            if (r6 == 0) goto La9
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Exception -> Laf
            java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)     // Catch: java.lang.Exception -> Laf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Laf
            r2 = r6
            r8 = 1
        L88:
            r4.close()     // Catch: java.lang.Exception -> Laf
            r6 = r2
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Exception -> Laf
            int r6 = r6.length()     // Catch: java.lang.Exception -> Laf
            if (r6 != 0) goto L96
            r6 = 1
            goto L97
        L96:
            r6 = 0
        L97:
            if (r6 == 0) goto La7
            r6 = r1
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Exception -> Laf
            int r6 = r6.length()     // Catch: java.lang.Exception -> Laf
            if (r6 <= 0) goto La3
            r5 = 1
        La3:
            if (r5 == 0) goto La8
            r0 = r1
            goto La8
        La7:
            r0 = r2
        La8:
            goto Lbd
        La9:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> Laf
            r6.<init>(r12)     // Catch: java.lang.Exception -> Laf
            throw r6     // Catch: java.lang.Exception -> Laf
        Laf:
            r2 = move-exception
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 <= 0) goto Lba
            r5 = 1
        Lba:
            if (r5 == 0) goto Lbd
            r0 = r1
        Lbd:
            return r0
        Lbe:
            java.lang.String r0 = "模拟器"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.everythingtoolbox.ui.home.HomeFragment.getCpuInfo():java.lang.String");
    }

    private final long getTotalMemory() {
        try {
            Object systemService = requireContext().getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            ActivityManager activityManager = (ActivityManager) systemService;
            ActivityManager.MemoryInfo memInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memInfo);
            return memInfo.totalMem;
        } catch (Exception e) {
            long totalMem = 0;
            try {
                RandomAccessFile reader = new RandomAccessFile("/proc/meminfo", "r");
                while (true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (StringsKt.startsWith$default(line, "MemTotal", false, 2, (Object) null)) {
                        Collection $this$toTypedArray$iv = new Regex(":").split(line, 0);
                        Object[] array = $this$toTypedArray$iv.toArray(new String[0]);
                        if (array != null) {
                            String[] parts = (String[]) array;
                            if (parts.length >= 2) {
                                String str = parts[1];
                                if (str == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                                }
                                Collection $this$toTypedArray$iv2 = new Regex(" +").split(StringsKt.trim((CharSequence) str).toString(), 0);
                                Object[] array2 = $this$toTypedArray$iv2.toArray(new String[0]);
                                if (array2 != null) {
                                    String memValue = ((String[]) array2)[0];
                                    totalMem = Long.parseLong(memValue) * ((long) 1024);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                }
                reader.close();
                if (totalMem <= 0) {
                    totalMem = Runtime.getRuntime().maxMemory();
                }
                return totalMem;
            } catch (Exception e2) {
                return Runtime.getRuntime().maxMemory();
            }
        }
    }

    private final String formatMemorySize(long bytes) {
        long gb = bytes / ((long) BasicMeasure.EXACTLY);
        long mb = bytes / ((long) 1048576);
        if (gb >= 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            double d = gb;
            Double.isNaN(d);
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d / 1.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            return Intrinsics.stringPlus(str, "GB");
        }
        if (mb >= 1) {
            return mb + "MB";
        }
        return (bytes / ((long) 1024)) + "KB";
    }

    private final String getStorageInfo() {
        try {
            File path = Environment.getDataDirectory();
            StatFs stat = new StatFs(path.getPath());
            long blockSize = stat.getBlockSizeLong();
            long totalBlocks = stat.getBlockCountLong();
            long availableBlocks = stat.getAvailableBlocksLong();
            long totalBytes = totalBlocks * blockSize;
            long availableBytes = availableBlocks * blockSize;
            double d = totalBytes;
            Double.isNaN(d);
            double totalGB = d / 1.073741824E9d;
            double d2 = availableBytes;
            Double.isNaN(d2);
            double availableGB = d2 / 1.073741824E9d;
            double d3 = totalGB - availableGB;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.1fGB / %.1fGB", Arrays.copyOf(new Object[]{Double.valueOf(availableGB), Double.valueOf(totalGB)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            return str;
        } catch (Exception e) {
            return "Unknown";
        }
    }

    private final void loadHitokoto() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://v1.hitokoto.cn/").build();
        client.newCall(request).enqueue(new AnonymousClass1());
    }

    /* JADX INFO: renamed from: com.everythingtoolbox.ui.home.HomeFragment$loadHitokoto$1, reason: invalid class name */
    /* JADX INFO: compiled from: HomeFragment.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/everythingtoolbox/ui/home/HomeFragment$loadHitokoto$1", "Lokhttp3/Callback;", "onFailure", HttpUrl.FRAGMENT_ENCODE_SET, NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AnonymousClass1 implements Callback {
        AnonymousClass1() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e, "e");
            FragmentActivity activity = HomeFragment.this.getActivity();
            if (activity == null) {
                return;
            }
            final HomeFragment homeFragment = HomeFragment.this;
            activity.runOnUiThread(new Runnable() { // from class: com.everythingtoolbox.ui.home.HomeFragment$loadHitokoto$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.AnonymousClass1.m53onFailure$lambda0(homeFragment);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onFailure$lambda-0, reason: not valid java name */
        public static final void m53onFailure$lambda0(HomeFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            TextView textView = this$0.tvHitokoto;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvHitokoto");
                textView = null;
            }
            textView.setText("加载一言失败");
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                ResponseBody responseBodyBody = response.body();
                final JSONObject json = new JSONObject(responseBodyBody == null ? null : responseBodyBody.string());
                FragmentActivity activity = HomeFragment.this.getActivity();
                if (activity == null) {
                    return;
                }
                final HomeFragment homeFragment = HomeFragment.this;
                activity.runOnUiThread(new Runnable() { // from class: com.everythingtoolbox.ui.home.HomeFragment$loadHitokoto$1$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeFragment.AnonymousClass1.m54onResponse$lambda1(homeFragment, json);
                    }
                });
            } catch (Exception e) {
                FragmentActivity activity2 = HomeFragment.this.getActivity();
                if (activity2 == null) {
                    return;
                }
                final HomeFragment homeFragment2 = HomeFragment.this;
                activity2.runOnUiThread(new Runnable() { // from class: com.everythingtoolbox.ui.home.HomeFragment$loadHitokoto$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeFragment.AnonymousClass1.m55onResponse$lambda2(homeFragment2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onResponse$lambda-1, reason: not valid java name */
        public static final void m54onResponse$lambda1(HomeFragment this$0, JSONObject json) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(json, "$json");
            TextView textView = this$0.tvHitokoto;
            TextView textView2 = null;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvHitokoto");
                textView = null;
            }
            textView.setText(json.optString("hitokoto", "加载一言失败"));
            TextView textView3 = this$0.tvHitokotoFrom;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvHitokotoFrom");
            } else {
                textView2 = textView3;
            }
            textView2.setText(Intrinsics.stringPlus("—— ", json.optString(TypedValues.TransitionType.S_FROM, HttpUrl.FRAGMENT_ENCODE_SET)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onResponse$lambda-2, reason: not valid java name */
        public static final void m55onResponse$lambda2(HomeFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            TextView textView = this$0.tvHitokoto;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvHitokoto");
                textView = null;
            }
            textView.setText("加载一言失败");
        }
    }
}
