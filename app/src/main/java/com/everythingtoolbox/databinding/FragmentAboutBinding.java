package com.everythingtoolbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.everythingtoolbox.R;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentAboutBinding implements ViewBinding {
    public final ImageView ivDev1;
    public final ImageView ivDev2;
    public final ImageView ivDev3;
    public final ImageView ivDev4;
    public final ImageView ivLogo;
    private final ScrollView rootView;
    public final TextView tvVersion;

    private FragmentAboutBinding(ScrollView rootView, ImageView ivDev1, ImageView ivDev2, ImageView ivDev3, ImageView ivDev4, ImageView ivLogo, TextView tvVersion) {
        this.rootView = rootView;
        this.ivDev1 = ivDev1;
        this.ivDev2 = ivDev2;
        this.ivDev3 = ivDev3;
        this.ivDev4 = ivDev4;
        this.ivLogo = ivLogo;
        this.tvVersion = tvVersion;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAboutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentAboutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_about, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FragmentAboutBinding bind(View rootView) {
        int id = R.id.ivDev1;
        ImageView ivDev1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivDev1);
        if (ivDev1 != null) {
            id = R.id.ivDev2;
            ImageView ivDev2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivDev2);
            if (ivDev2 != null) {
                id = R.id.ivDev3;
                ImageView ivDev3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivDev3);
                if (ivDev3 != null) {
                    id = R.id.ivDev4;
                    ImageView ivDev4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivDev4);
                    if (ivDev4 != null) {
                        id = R.id.ivLogo;
                        ImageView ivLogo = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivLogo);
                        if (ivLogo != null) {
                            id = R.id.tvVersion;
                            TextView tvVersion = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvVersion);
                            if (tvVersion != null) {
                                return new FragmentAboutBinding((ScrollView) rootView, ivDev1, ivDev2, ivDev3, ivDev4, ivLogo, tvVersion);
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
