package com.everythingtoolbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.everythingtoolbox.R;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentHomeBinding implements ViewBinding {
    public final ProgressBar progressCpu;
    public final ProgressBar progressMemory;
    private final ScrollView rootView;
    public final TextView tvAndroidVersion;
    public final TextView tvBrand;
    public final TextView tvCpuCores;
    public final TextView tvCpuUsage;
    public final TextView tvHitokoto;
    public final TextView tvHitokotoFrom;
    public final TextView tvMemoryAvail;
    public final TextView tvMemoryUsage;
    public final TextView tvModel;
    public final TextView tvProcessor;
    public final TextView tvScreenDensity;
    public final TextView tvScreenResolution;
    public final TextView tvSdkVersion;
    public final TextView tvStorage;
    public final TextView tvTotalMemory;

    private FragmentHomeBinding(ScrollView rootView, ProgressBar progressCpu, ProgressBar progressMemory, TextView tvAndroidVersion, TextView tvBrand, TextView tvCpuCores, TextView tvCpuUsage, TextView tvHitokoto, TextView tvHitokotoFrom, TextView tvMemoryAvail, TextView tvMemoryUsage, TextView tvModel, TextView tvProcessor, TextView tvScreenDensity, TextView tvScreenResolution, TextView tvSdkVersion, TextView tvStorage, TextView tvTotalMemory) {
        this.rootView = rootView;
        this.progressCpu = progressCpu;
        this.progressMemory = progressMemory;
        this.tvAndroidVersion = tvAndroidVersion;
        this.tvBrand = tvBrand;
        this.tvCpuCores = tvCpuCores;
        this.tvCpuUsage = tvCpuUsage;
        this.tvHitokoto = tvHitokoto;
        this.tvHitokotoFrom = tvHitokotoFrom;
        this.tvMemoryAvail = tvMemoryAvail;
        this.tvMemoryUsage = tvMemoryUsage;
        this.tvModel = tvModel;
        this.tvProcessor = tvProcessor;
        this.tvScreenDensity = tvScreenDensity;
        this.tvScreenResolution = tvScreenResolution;
        this.tvSdkVersion = tvSdkVersion;
        this.tvStorage = tvStorage;
        this.tvTotalMemory = tvTotalMemory;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_home, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FragmentHomeBinding bind(View rootView) {
        int id = R.id.progressCpu;
        ProgressBar progressCpu = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressCpu);
        if (progressCpu != null) {
            id = R.id.progressMemory;
            ProgressBar progressMemory = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressMemory);
            if (progressMemory != null) {
                id = R.id.tvAndroidVersion;
                TextView tvAndroidVersion = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvAndroidVersion);
                if (tvAndroidVersion != null) {
                    id = R.id.tvBrand;
                    TextView tvBrand = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvBrand);
                    if (tvBrand != null) {
                        id = R.id.tvCpuCores;
                        TextView tvCpuCores = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvCpuCores);
                        if (tvCpuCores != null) {
                            id = R.id.tvCpuUsage;
                            TextView tvCpuUsage = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvCpuUsage);
                            if (tvCpuUsage != null) {
                                id = R.id.tvHitokoto;
                                TextView tvHitokoto = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHitokoto);
                                if (tvHitokoto != null) {
                                    id = R.id.tvHitokotoFrom;
                                    TextView tvHitokotoFrom = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvHitokotoFrom);
                                    if (tvHitokotoFrom != null) {
                                        id = R.id.tvMemoryAvail;
                                        TextView tvMemoryAvail = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvMemoryAvail);
                                        if (tvMemoryAvail != null) {
                                            id = R.id.tvMemoryUsage;
                                            TextView tvMemoryUsage = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvMemoryUsage);
                                            if (tvMemoryUsage != null) {
                                                id = R.id.tvModel;
                                                TextView tvModel = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvModel);
                                                if (tvModel != null) {
                                                    id = R.id.tvProcessor;
                                                    TextView tvProcessor = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvProcessor);
                                                    if (tvProcessor != null) {
                                                        id = R.id.tvScreenDensity;
                                                        TextView tvScreenDensity = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvScreenDensity);
                                                        if (tvScreenDensity != null) {
                                                            id = R.id.tvScreenResolution;
                                                            TextView tvScreenResolution = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvScreenResolution);
                                                            if (tvScreenResolution != null) {
                                                                id = R.id.tvSdkVersion;
                                                                TextView tvSdkVersion = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSdkVersion);
                                                                if (tvSdkVersion != null) {
                                                                    id = R.id.tvStorage;
                                                                    TextView tvStorage = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvStorage);
                                                                    if (tvStorage != null) {
                                                                        id = R.id.tvTotalMemory;
                                                                        TextView tvTotalMemory = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTotalMemory);
                                                                        if (tvTotalMemory != null) {
                                                                            return new FragmentHomeBinding((ScrollView) rootView, progressCpu, progressMemory, tvAndroidVersion, tvBrand, tvCpuCores, tvCpuUsage, tvHitokoto, tvHitokotoFrom, tvMemoryAvail, tvMemoryUsage, tvModel, tvProcessor, tvScreenDensity, tvScreenResolution, tvSdkVersion, tvStorage, tvTotalMemory);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
