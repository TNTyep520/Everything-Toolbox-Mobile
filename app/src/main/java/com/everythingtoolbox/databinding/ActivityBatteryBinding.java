package com.everythingtoolbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.everythingtoolbox.R;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityBatteryBinding implements ViewBinding {
    public final ProgressBar progressBattery;
    private final LinearLayout rootView;
    public final Toolbar toolbar;
    public final TextView tvBatteryHealth;
    public final TextView tvBatteryLevel;
    public final TextView tvBatteryStatus;
    public final TextView tvBatteryTech;
    public final TextView tvBatteryTemp;
    public final TextView tvBatteryVoltage;
    public final TextView tvChargingType;

    private ActivityBatteryBinding(LinearLayout rootView, ProgressBar progressBattery, Toolbar toolbar, TextView tvBatteryHealth, TextView tvBatteryLevel, TextView tvBatteryStatus, TextView tvBatteryTech, TextView tvBatteryTemp, TextView tvBatteryVoltage, TextView tvChargingType) {
        this.rootView = rootView;
        this.progressBattery = progressBattery;
        this.toolbar = toolbar;
        this.tvBatteryHealth = tvBatteryHealth;
        this.tvBatteryLevel = tvBatteryLevel;
        this.tvBatteryStatus = tvBatteryStatus;
        this.tvBatteryTech = tvBatteryTech;
        this.tvBatteryTemp = tvBatteryTemp;
        this.tvBatteryVoltage = tvBatteryVoltage;
        this.tvChargingType = tvChargingType;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBatteryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityBatteryBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_battery, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityBatteryBinding bind(View rootView) {
        int id = R.id.progressBattery;
        ProgressBar progressBattery = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressBattery);
        if (progressBattery != null) {
            id = R.id.toolbar;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(rootView, R.id.toolbar);
            if (toolbar != null) {
                id = R.id.tvBatteryHealth;
                TextView tvBatteryHealth = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvBatteryHealth);
                if (tvBatteryHealth != null) {
                    id = R.id.tvBatteryLevel;
                    TextView tvBatteryLevel = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvBatteryLevel);
                    if (tvBatteryLevel != null) {
                        id = R.id.tvBatteryStatus;
                        TextView tvBatteryStatus = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvBatteryStatus);
                        if (tvBatteryStatus != null) {
                            id = R.id.tvBatteryTech;
                            TextView tvBatteryTech = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvBatteryTech);
                            if (tvBatteryTech != null) {
                                id = R.id.tvBatteryTemp;
                                TextView tvBatteryTemp = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvBatteryTemp);
                                if (tvBatteryTemp != null) {
                                    id = R.id.tvBatteryVoltage;
                                    TextView tvBatteryVoltage = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvBatteryVoltage);
                                    if (tvBatteryVoltage != null) {
                                        id = R.id.tvChargingType;
                                        TextView tvChargingType = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvChargingType);
                                        if (tvChargingType != null) {
                                            return new ActivityBatteryBinding((LinearLayout) rootView, progressBattery, toolbar, tvBatteryHealth, tvBatteryLevel, tvBatteryStatus, tvBatteryTech, tvBatteryTemp, tvBatteryVoltage, tvChargingType);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
