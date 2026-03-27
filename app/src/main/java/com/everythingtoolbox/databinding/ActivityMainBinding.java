package com.everythingtoolbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.everythingtoolbox.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityMainBinding implements ViewBinding {
    public final BottomNavigationView bottomNavigation;
    public final FrameLayout fragmentContainer;
    public final RadioGroup radioGroupNav;
    public final RadioButton rbAbout;
    public final RadioButton rbHome;
    public final RadioButton rbSettings;
    public final RadioButton rbTools;
    private final LinearLayout rootView;

    private ActivityMainBinding(LinearLayout rootView, BottomNavigationView bottomNavigation, FrameLayout fragmentContainer, RadioGroup radioGroupNav, RadioButton rbAbout, RadioButton rbHome, RadioButton rbSettings, RadioButton rbTools) {
        this.rootView = rootView;
        this.bottomNavigation = bottomNavigation;
        this.fragmentContainer = fragmentContainer;
        this.radioGroupNav = radioGroupNav;
        this.rbAbout = rbAbout;
        this.rbHome = rbHome;
        this.rbSettings = rbSettings;
        this.rbTools = rbTools;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityMainBinding bind(View rootView) {
        BottomNavigationView bottomNavigation = (BottomNavigationView) ViewBindings.findChildViewById(rootView, R.id.bottomNavigation);
        FrameLayout fragmentContainer = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fragmentContainer);
        if (fragmentContainer == null) {
            String missingId = rootView.getResources().getResourceName(R.id.fragmentContainer);
            throw new NullPointerException("Missing required view with ID: ".concat(missingId));
        }
        RadioGroup radioGroupNav = (RadioGroup) ViewBindings.findChildViewById(rootView, R.id.radioGroupNav);
        RadioButton rbAbout = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbAbout);
        RadioButton rbHome = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbHome);
        RadioButton rbSettings = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbSettings);
        RadioButton rbTools = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbTools);
        return new ActivityMainBinding((LinearLayout) rootView, bottomNavigation, fragmentContainer, radioGroupNav, rbAbout, rbHome, rbSettings, rbTools);
    }
}
