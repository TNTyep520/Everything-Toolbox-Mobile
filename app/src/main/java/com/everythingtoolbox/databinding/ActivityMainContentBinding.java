package com.everythingtoolbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.everythingtoolbox.R;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityMainContentBinding implements ViewBinding {
    public final ImageButton btnMenu;
    public final ChipGroup categoryChipGroup;
    public final LinearLayout contentLayout;
    private final LinearLayout rootView;
    public final TextInputEditText searchEditText;
    public final LinearLayout sideMenuContainer;
    public final RecyclerView toolsRecyclerView;
    public final TextView tvTitle;

    private ActivityMainContentBinding(LinearLayout rootView, ImageButton btnMenu, ChipGroup categoryChipGroup, LinearLayout contentLayout, TextInputEditText searchEditText, LinearLayout sideMenuContainer, RecyclerView toolsRecyclerView, TextView tvTitle) {
        this.rootView = rootView;
        this.btnMenu = btnMenu;
        this.categoryChipGroup = categoryChipGroup;
        this.contentLayout = contentLayout;
        this.searchEditText = searchEditText;
        this.sideMenuContainer = sideMenuContainer;
        this.toolsRecyclerView = toolsRecyclerView;
        this.tvTitle = tvTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainContentBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityMainContentBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_main_content, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityMainContentBinding bind(View rootView) {
        ImageButton btnMenu = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btnMenu);
        int id = R.id.categoryChipGroup;
        ChipGroup categoryChipGroup = (ChipGroup) ViewBindings.findChildViewById(rootView, R.id.categoryChipGroup);
        if (categoryChipGroup != null) {
            LinearLayout contentLayout = (LinearLayout) rootView;
            id = R.id.searchEditText;
            TextInputEditText searchEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.searchEditText);
            if (searchEditText != null) {
                LinearLayout sideMenuContainer = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sideMenuContainer);
                id = R.id.toolsRecyclerView;
                RecyclerView toolsRecyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.toolsRecyclerView);
                if (toolsRecyclerView != null) {
                    TextView tvTitle = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTitle);
                    return new ActivityMainContentBinding((LinearLayout) rootView, btnMenu, categoryChipGroup, contentLayout, searchEditText, sideMenuContainer, toolsRecyclerView, tvTitle);
                }
            }
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
