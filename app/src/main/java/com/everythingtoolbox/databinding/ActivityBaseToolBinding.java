package com.everythingtoolbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.everythingtoolbox.R;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityBaseToolBinding implements ViewBinding {
    public final FrameLayout contentContainer;
    private final LinearLayout rootView;
    public final Toolbar toolbar;

    private ActivityBaseToolBinding(LinearLayout rootView, FrameLayout contentContainer, Toolbar toolbar) {
        this.rootView = rootView;
        this.contentContainer = contentContainer;
        this.toolbar = toolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBaseToolBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityBaseToolBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_base_tool, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityBaseToolBinding bind(View rootView) {
        int id = R.id.contentContainer;
        FrameLayout contentContainer = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.contentContainer);
        if (contentContainer != null) {
            id = R.id.toolbar;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(rootView, R.id.toolbar);
            if (toolbar != null) {
                return new ActivityBaseToolBinding((LinearLayout) rootView, contentContainer, toolbar);
            }
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
