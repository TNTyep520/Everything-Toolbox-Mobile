package com.everythingtoolbox.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.everythingtoolbox.R;
import com.everythingtoolbox.base.ToolCategory;
import com.everythingtoolbox.base.ToolItem;
import com.everythingtoolbox.base.ToolManager;
import com.everythingtoolbox.ui.ToolsAdapter;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: ToolsFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/everythingtoolbox/ui/tools/ToolsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "categoryChipGroup", "Lcom/google/android/material/chip/ChipGroup;", "currentCategory", "Lcom/everythingtoolbox/base/ToolCategory;", "searchEditText", "Lcom/google/android/material/textfield/TextInputEditText;", "searchQuery", HttpUrl.FRAGMENT_ENCODE_SET, "toolsAdapter", "Lcom/everythingtoolbox/ui/ToolsAdapter;", "toolsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "createCategoryChip", "Lcom/google/android/material/chip/Chip;", "category", "displayName", "loadTools", HttpUrl.FRAGMENT_ENCODE_SET, "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onToolClicked", "tool", "Lcom/everythingtoolbox/base/ToolItem;", "onViewCreated", "view", "setupCategoryChips", "setupRecyclerView", "setupSearch", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ToolsFragment extends Fragment {
    private ChipGroup categoryChipGroup;
    private ToolCategory currentCategory;
    private TextInputEditText searchEditText;
    private String searchQuery = HttpUrl.FRAGMENT_ENCODE_SET;
    private ToolsAdapter toolsAdapter;
    private RecyclerView toolsRecyclerView;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_tools, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(R.id.searchEditText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.searchEditText)");
        this.searchEditText = (TextInputEditText) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.categoryChipGroup);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.categoryChipGroup)");
        this.categoryChipGroup = (ChipGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.toolsRecyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.toolsRecyclerView)");
        this.toolsRecyclerView = (RecyclerView) viewFindViewById3;
        setupSearch();
        setupCategoryChips();
        setupRecyclerView();
        loadTools();
    }

    private final void setupSearch() {
        TextInputEditText textInputEditText = this.searchEditText;
        if (textInputEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchEditText");
            textInputEditText = null;
        }
        textInputEditText.addTextChangedListener(new TextWatcher() { // from class: com.everythingtoolbox.ui.tools.ToolsFragment.setupSearch.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String string;
                ToolsFragment toolsFragment = ToolsFragment.this;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                if (s != null && (string = s.toString()) != null) {
                    str = string;
                }
                toolsFragment.searchQuery = str;
                ToolsFragment.this.loadTools();
            }
        });
    }

    private final void setupCategoryChips() {
        Chip allChip = createCategoryChip(null, "全部");
        ChipGroup chipGroup = this.categoryChipGroup;
        if (chipGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoryChipGroup");
            chipGroup = null;
        }
        chipGroup.addView(allChip);
        for (ToolCategory toolCategory : ToolCategory.values()) {
            Chip chip = createCategoryChip(toolCategory, toolCategory.getDisplayName());
            ChipGroup chipGroup2 = this.categoryChipGroup;
            if (chipGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categoryChipGroup");
                chipGroup2 = null;
            }
            chipGroup2.addView(chip);
        }
    }

    private final Chip createCategoryChip(final ToolCategory category, String displayName) {
        Chip $this$createCategoryChip_u24lambda_u2d2 = new Chip(requireContext());
        $this$createCategoryChip_u24lambda_u2d2.setText(displayName);
        $this$createCategoryChip_u24lambda_u2d2.setCheckable(true);
        $this$createCategoryChip_u24lambda_u2d2.setChecked(category == null);
        $this$createCategoryChip_u24lambda_u2d2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.everythingtoolbox.ui.tools.ToolsFragment$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ToolsFragment.m56createCategoryChip$lambda2$lambda1(this.f$0, category, compoundButton, z);
            }
        });
        return $this$createCategoryChip_u24lambda_u2d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createCategoryChip$lambda-2$lambda-1, reason: not valid java name */
    public static final void m56createCategoryChip$lambda2$lambda1(ToolsFragment this$0, ToolCategory $category, CompoundButton $noName_0, boolean isChecked) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (isChecked) {
            this$0.currentCategory = $category;
            this$0.loadTools();
        }
    }

    private final void setupRecyclerView() {
        this.toolsAdapter = new ToolsAdapter(new Function1<ToolItem, Unit>() { // from class: com.everythingtoolbox.ui.tools.ToolsFragment.setupRecyclerView.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ToolItem toolItem) {
                invoke2(toolItem);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ToolItem tool) {
                Intrinsics.checkNotNullParameter(tool, "tool");
                ToolsFragment.this.onToolClicked(tool);
            }
        });
        RecyclerView $this$setupRecyclerView_u24lambda_u2d3 = this.toolsRecyclerView;
        ToolsAdapter toolsAdapter = null;
        if ($this$setupRecyclerView_u24lambda_u2d3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolsRecyclerView");
            $this$setupRecyclerView_u24lambda_u2d3 = null;
        }
        $this$setupRecyclerView_u24lambda_u2d3.setLayoutManager(new GridLayoutManager($this$setupRecyclerView_u24lambda_u2d3.getContext(), 2));
        ToolsAdapter toolsAdapter2 = this.toolsAdapter;
        if (toolsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolsAdapter");
        } else {
            toolsAdapter = toolsAdapter2;
        }
        $this$setupRecyclerView_u24lambda_u2d3.setAdapter(toolsAdapter);
        $this$setupRecyclerView_u24lambda_u2d3.setHasFixedSize(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadTools() {
        List<ToolItem> allTools;
        if (this.searchQuery.length() > 0) {
            allTools = ToolManager.INSTANCE.searchTools(this.searchQuery);
        } else if (this.currentCategory != null) {
            ToolManager toolManager = ToolManager.INSTANCE;
            ToolCategory toolCategory = this.currentCategory;
            Intrinsics.checkNotNull(toolCategory);
            allTools = toolManager.getToolsByCategory(toolCategory);
        } else {
            allTools = ToolManager.INSTANCE.getAllTools();
        }
        ToolsAdapter toolsAdapter = this.toolsAdapter;
        if (toolsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolsAdapter");
            toolsAdapter = null;
        }
        toolsAdapter.submitList(allTools);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onToolClicked(ToolItem tool) {
        Unit unit;
        Class<?> targetClass = tool.getTargetClass();
        if (targetClass == null) {
            unit = null;
        } else {
            startActivity(new Intent(getContext(), targetClass));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ToolsFragment $this$onToolClicked_u24lambda_u2d5 = this;
            Toast.makeText($this$onToolClicked_u24lambda_u2d5.getContext(), Intrinsics.stringPlus(tool.getName(), " 功能开发中..."), 0).show();
        }
    }
}
