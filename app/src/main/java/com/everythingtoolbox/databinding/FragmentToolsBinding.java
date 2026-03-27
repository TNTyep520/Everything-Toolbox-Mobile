package com.everythingtoolbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.everythingtoolbox.R;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentToolsBinding implements ViewBinding {
    public final ChipGroup categoryChipGroup;
    private final LinearLayout rootView;
    public final TextInputEditText searchEditText;
    public final RecyclerView toolsRecyclerView;

    private FragmentToolsBinding(LinearLayout rootView, ChipGroup categoryChipGroup, TextInputEditText searchEditText, RecyclerView toolsRecyclerView) {
        this.rootView = rootView;
        this.categoryChipGroup = categoryChipGroup;
        this.searchEditText = searchEditText;
        this.toolsRecyclerView = toolsRecyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentToolsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentToolsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_tools, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FragmentToolsBinding bind(View rootView) {
        int id = R.id.categoryChipGroup;
        ChipGroup categoryChipGroup = (ChipGroup) ViewBindings.findChildViewById(rootView, R.id.categoryChipGroup);
        if (categoryChipGroup != null) {
            id = R.id.searchEditText;
            TextInputEditText searchEditText = (TextInputEditText) ViewBindings.findChildViewById(rootView, R.id.searchEditText);
            if (searchEditText != null) {
                id = R.id.toolsRecyclerView;
                RecyclerView toolsRecyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.toolsRecyclerView);
                if (toolsRecyclerView != null) {
                    return new FragmentToolsBinding((LinearLayout) rootView, categoryChipGroup, searchEditText, toolsRecyclerView);
                }
            }
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
