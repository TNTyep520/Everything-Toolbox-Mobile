package com.everythingtoolbox.tools.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.everythingtoolbox.R;
import com.everythingtoolbox.ui.BaseToolActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: BatteryActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/everythingtoolbox/tools/battery/BatteryActivity;", "Lcom/everythingtoolbox/ui/BaseToolActivity;", "()V", "batteryReceiver", "com/everythingtoolbox/tools/battery/BatteryActivity$batteryReceiver$1", "Lcom/everythingtoolbox/tools/battery/BatteryActivity$batteryReceiver$1;", "progressBattery", "Landroid/widget/ProgressBar;", "tvBatteryHealth", "Landroid/widget/TextView;", "tvBatteryLevel", "tvBatteryStatus", "tvBatteryTech", "tvBatteryTemp", "tvBatteryVoltage", "tvChargingType", "getActivityTitle", HttpUrl.FRAGMENT_ENCODE_SET, "getLayoutResId", HttpUrl.FRAGMENT_ENCODE_SET, "initViews", HttpUrl.FRAGMENT_ENCODE_SET, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "updateBatteryInfo", "intent", "Landroid/content/Intent;", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BatteryActivity extends BaseToolActivity {
    private final BatteryActivity$batteryReceiver$1 batteryReceiver = new BroadcastReceiver() { // from class: com.everythingtoolbox.tools.battery.BatteryActivity$batteryReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                this.this$0.updateBatteryInfo(intent);
            }
        }
    };
    private ProgressBar progressBattery;
    private TextView tvBatteryHealth;
    private TextView tvBatteryLevel;
    private TextView tvBatteryStatus;
    private TextView tvBatteryTech;
    private TextView tvBatteryTemp;
    private TextView tvBatteryVoltage;
    private TextView tvChargingType;

    @Override // com.everythingtoolbox.ui.BaseToolActivity
    protected int getLayoutResId() {
        return R.layout.activity_battery;
    }

    @Override // com.everythingtoolbox.ui.BaseToolActivity
    protected String getActivityTitle() {
        return "电池信息";
    }

    @Override // com.everythingtoolbox.ui.BaseToolActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.everythingtoolbox.ui.BaseToolActivity
    protected void initViews() {
        View viewFindViewById = findViewById(R.id.tvBatteryLevel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tvBatteryLevel)");
        this.tvBatteryLevel = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.progressBattery);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.progressBattery)");
        this.progressBattery = (ProgressBar) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tvBatteryStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tvBatteryStatus)");
        this.tvBatteryStatus = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tvBatteryHealth);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.tvBatteryHealth)");
        this.tvBatteryHealth = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tvBatteryTemp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tvBatteryTemp)");
        this.tvBatteryTemp = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tvBatteryVoltage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(R.id.tvBatteryVoltage)");
        this.tvBatteryVoltage = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.tvBatteryTech);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(R.id.tvBatteryTech)");
        this.tvBatteryTech = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.tvChargingType);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(R.id.tvChargingType)");
        this.tvChargingType = (TextView) viewFindViewById8;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        registerReceiver(this.batteryReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        unregisterReceiver(this.batteryReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBatteryInfo(Intent intent) {
        String statusText;
        String healthText;
        int level = intent.getIntExtra("level", -1);
        int scale = intent.getIntExtra("scale", -1);
        int batteryPct = (level < 0 || scale <= 0) ? 0 : (level * 100) / scale;
        TextView textView = this.tvBatteryLevel;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBatteryLevel");
            textView = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(batteryPct);
        sb.append('%');
        textView.setText(sb.toString());
        ProgressBar progressBar = this.progressBattery;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBattery");
            progressBar = null;
        }
        progressBar.setProgress(batteryPct);
        int status = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        String chargingType = "未充电";
        switch (status) {
            case 2:
                statusText = "充电中";
                break;
            case 3:
                statusText = "放电中";
                break;
            case 4:
                statusText = "未充电";
                break;
            case 5:
                statusText = "已充满";
                break;
            default:
                statusText = "未知";
                break;
        }
        TextView textView2 = this.tvBatteryStatus;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBatteryStatus");
            textView2 = null;
        }
        textView2.setText(statusText);
        int health = intent.getIntExtra("health", -1);
        switch (health) {
            case 2:
                healthText = "良好";
                break;
            case 3:
                healthText = "过热";
                break;
            case 4:
                healthText = "损坏";
                break;
            case 5:
                healthText = "过压";
                break;
            case 6:
            default:
                healthText = "未知";
                break;
            case 7:
                healthText = "过冷";
                break;
        }
        TextView textView3 = this.tvBatteryHealth;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBatteryHealth");
            textView3 = null;
        }
        textView3.setText(healthText);
        double intExtra = intent.getIntExtra("temperature", -1);
        Double.isNaN(intExtra);
        double temp = intExtra / 10.0d;
        TextView textView4 = this.tvBatteryTemp;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBatteryTemp");
            textView4 = null;
        }
        textView4.setText(temp + "°C");
        int voltage = intent.getIntExtra("voltage", -1);
        TextView textView5 = this.tvBatteryVoltage;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBatteryVoltage");
            textView5 = null;
        }
        textView5.setText(voltage + "mV");
        String stringExtra = intent.getStringExtra("technology");
        String technology = stringExtra != null ? stringExtra : "未知";
        TextView textView6 = this.tvBatteryTech;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvBatteryTech");
            textView6 = null;
        }
        textView6.setText(technology);
        int plugged = intent.getIntExtra("plugged", -1);
        switch (plugged) {
            case 1:
                chargingType = "USB";
                break;
            case 2:
                chargingType = "USB";
                break;
            case 4:
                chargingType = "无线充电";
                break;
        }
        TextView textView7 = this.tvChargingType;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvChargingType");
            textView7 = null;
        }
        textView7.setText(chargingType);
    }
}
