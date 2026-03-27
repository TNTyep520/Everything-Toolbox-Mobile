package com.everythingtoolbox.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.everythingtoolbox.R;
import com.everythingtoolbox.base.ToolItem;
import com.everythingtoolbox.ui.ToolsAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: ToolsAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/everythingtoolbox/ui/ToolsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/everythingtoolbox/base/ToolItem;", "Lcom/everythingtoolbox/ui/ToolsAdapter$ToolViewHolder;", "onToolClick", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", HttpUrl.FRAGMENT_ENCODE_SET, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ToolDiffCallback", "ToolViewHolder", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ToolsAdapter extends ListAdapter<ToolItem, ToolViewHolder> {
    private final Function1<ToolItem, Unit> onToolClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToolsAdapter(Function1<? super ToolItem, Unit> onToolClick) {
        super(new ToolDiffCallback());
        Intrinsics.checkNotNullParameter(onToolClick, "onToolClick");
        this.onToolClick = onToolClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ToolViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tool, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ToolViewHolder(view, this.onToolClick);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ToolViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ToolItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(position)");
        holder.bind(item);
    }

    /* JADX INFO: compiled from: ToolsAdapter.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/everythingtoolbox/ui/ToolsAdapter$ToolViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onToolClick", "Lkotlin/Function1;", "Lcom/everythingtoolbox/base/ToolItem;", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "cardView", "Landroidx/cardview/widget/CardView;", "descriptionTextView", "Landroid/widget/TextView;", "iconImageView", "Landroid/widget/ImageView;", "nameTextView", "bind", "tool", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ToolViewHolder extends RecyclerView.ViewHolder {
        private final CardView cardView;
        private final TextView descriptionTextView;
        private final ImageView iconImageView;
        private final TextView nameTextView;
        private final Function1<ToolItem, Unit> onToolClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ToolViewHolder(View itemView, Function1<? super ToolItem, Unit> onToolClick) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(onToolClick, "onToolClick");
            this.onToolClick = onToolClick;
            View viewFindViewById = itemView.findViewById(R.id.cardView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.cardView)");
            this.cardView = (CardView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.iconImageView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.iconImageView)");
            this.iconImageView = (ImageView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R.id.nameTextView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.id.nameTextView)");
            this.nameTextView = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R.id.descriptionTextView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "itemView.findViewById(R.id.descriptionTextView)");
            this.descriptionTextView = (TextView) viewFindViewById4;
        }

        public final void bind(final ToolItem tool) {
            Intrinsics.checkNotNullParameter(tool, "tool");
            this.iconImageView.setImageResource(tool.getIconRes());
            this.nameTextView.setText(tool.getName());
            this.descriptionTextView.setText(tool.getDescription());
            this.cardView.setOnClickListener(new View.OnClickListener() { // from class: com.everythingtoolbox.ui.ToolsAdapter$ToolViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ToolsAdapter.ToolViewHolder.m43bind$lambda0(this.f$0, tool, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: bind$lambda-0, reason: not valid java name */
        public static final void m43bind$lambda0(ToolViewHolder this$0, ToolItem tool, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(tool, "$tool");
            this$0.onToolClick.invoke(tool);
        }
    }

    /* JADX INFO: compiled from: ToolsAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/everythingtoolbox/ui/ToolsAdapter$ToolDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/everythingtoolbox/base/ToolItem;", "()V", "areContentsTheSame", HttpUrl.FRAGMENT_ENCODE_SET, "oldItem", "newItem", "areItemsTheSame", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ToolDiffCallback extends DiffUtil.ItemCallback<ToolItem> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(ToolItem oldItem, ToolItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getId(), newItem.getId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(ToolItem oldItem, ToolItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
