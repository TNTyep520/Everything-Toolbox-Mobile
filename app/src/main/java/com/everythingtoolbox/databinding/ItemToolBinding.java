package com.everythingtoolbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.everythingtoolbox.R;

/* JADX INFO: loaded from: classes.dex */
public final class ItemToolBinding implements ViewBinding {
    public final CardView cardView;
    public final TextView descriptionTextView;
    public final ImageView iconImageView;
    public final TextView nameTextView;
    private final CardView rootView;

    private ItemToolBinding(CardView rootView, CardView cardView, TextView descriptionTextView, ImageView iconImageView, TextView nameTextView) {
        this.rootView = rootView;
        this.cardView = cardView;
        this.descriptionTextView = descriptionTextView;
        this.iconImageView = iconImageView;
        this.nameTextView = nameTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemToolBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemToolBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.item_tool, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ItemToolBinding bind(View rootView) {
        CardView cardView = (CardView) rootView;
        int id = R.id.descriptionTextView;
        TextView descriptionTextView = (TextView) ViewBindings.findChildViewById(rootView, R.id.descriptionTextView);
        if (descriptionTextView != null) {
            id = R.id.iconImageView;
            ImageView iconImageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iconImageView);
            if (iconImageView != null) {
                TextView nameTextView = (TextView) ViewBindings.findChildViewById(rootView, R.id.nameTextView);
                if (nameTextView == null) {
                    id = R.id.nameTextView;
                } else {
                    return new ItemToolBinding((CardView) rootView, cardView, descriptionTextView, iconImageView, nameTextView);
                }
            }
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
