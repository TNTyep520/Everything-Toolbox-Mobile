package com.everythingtoolbox.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.everythingtoolbox.R;
import com.everythingtoolbox.ui.about.AboutFragment;
import com.everythingtoolbox.ui.home.HomeFragment;
import com.everythingtoolbox.ui.settings.SettingsFragment;
import com.everythingtoolbox.ui.tools.ToolsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lcom/everythingtoolbox/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "aboutFragment", "Lcom/everythingtoolbox/ui/about/AboutFragment;", "getAboutFragment", "()Lcom/everythingtoolbox/ui/about/AboutFragment;", "aboutFragment$delegate", "Lkotlin/Lazy;", "activeFragment", "Landroidx/fragment/app/Fragment;", "bottomNavigation", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "homeFragment", "Lcom/everythingtoolbox/ui/home/HomeFragment;", "getHomeFragment", "()Lcom/everythingtoolbox/ui/home/HomeFragment;", "homeFragment$delegate", "radioGroupNav", "Landroid/widget/RadioGroup;", "settingsFragment", "Lcom/everythingtoolbox/ui/settings/SettingsFragment;", "getSettingsFragment", "()Lcom/everythingtoolbox/ui/settings/SettingsFragment;", "settingsFragment$delegate", "toolsFragment", "Lcom/everythingtoolbox/ui/tools/ToolsFragment;", "getToolsFragment", "()Lcom/everythingtoolbox/ui/tools/ToolsFragment;", "toolsFragment$delegate", "onCreate", HttpUrl.FRAGMENT_ENCODE_SET, "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", HttpUrl.FRAGMENT_ENCODE_SET, "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setupBottomNavigation", "setupFragments", "setupLandscapeNavigation", "switchFragment", "fragment", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigation;
    private RadioGroup radioGroupNav;

    /* JADX INFO: renamed from: homeFragment$delegate, reason: from kotlin metadata */
    private final Lazy homeFragment = LazyKt.lazy(new Function0<HomeFragment>() { // from class: com.everythingtoolbox.ui.MainActivity$homeFragment$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HomeFragment invoke() {
            return new HomeFragment();
        }
    });

    /* JADX INFO: renamed from: toolsFragment$delegate, reason: from kotlin metadata */
    private final Lazy toolsFragment = LazyKt.lazy(new Function0<ToolsFragment>() { // from class: com.everythingtoolbox.ui.MainActivity$toolsFragment$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ToolsFragment invoke() {
            return new ToolsFragment();
        }
    });

    /* JADX INFO: renamed from: settingsFragment$delegate, reason: from kotlin metadata */
    private final Lazy settingsFragment = LazyKt.lazy(new Function0<SettingsFragment>() { // from class: com.everythingtoolbox.ui.MainActivity$settingsFragment$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SettingsFragment invoke() {
            return new SettingsFragment();
        }
    });

    /* JADX INFO: renamed from: aboutFragment$delegate, reason: from kotlin metadata */
    private final Lazy aboutFragment = LazyKt.lazy(new Function0<AboutFragment>() { // from class: com.everythingtoolbox.ui.MainActivity$aboutFragment$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AboutFragment invoke() {
            return new AboutFragment();
        }
    });
    private Fragment activeFragment = getHomeFragment();

    private final HomeFragment getHomeFragment() {
        return (HomeFragment) this.homeFragment.getValue();
    }

    private final ToolsFragment getToolsFragment() {
        return (ToolsFragment) this.toolsFragment.getValue();
    }

    private final SettingsFragment getSettingsFragment() {
        return (SettingsFragment) this.settingsFragment.getValue();
    }

    private final AboutFragment getAboutFragment() {
        return (AboutFragment) this.aboutFragment.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupFragments();
        setupBottomNavigation();
        setupLandscapeNavigation();
    }

    private final void setupLandscapeNavigation() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroupNav);
        this.radioGroupNav = radioGroup;
        if (radioGroup == null) {
            return;
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.everythingtoolbox.ui.MainActivity$$ExternalSyntheticLambda0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i) {
                MainActivity.m42setupLandscapeNavigation$lambda0(this.f$0, radioGroup2, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupLandscapeNavigation$lambda-0, reason: not valid java name */
    public static final void m42setupLandscapeNavigation$lambda0(MainActivity this$0, RadioGroup $noName_0, int checkedId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        switch (checkedId) {
            case R.id.rbAbout /* 2131231094 */:
                this$0.switchFragment(this$0.getAboutFragment());
                break;
            case R.id.rbHome /* 2131231095 */:
                this$0.switchFragment(this$0.getHomeFragment());
                break;
            case R.id.rbSettings /* 2131231096 */:
                this$0.switchFragment(this$0.getSettingsFragment());
                break;
            case R.id.rbTools /* 2131231097 */:
                this$0.switchFragment(this$0.getToolsFragment());
                break;
        }
    }

    private final void setupFragments() {
        FragmentTransaction $this$setupFragments_u24lambda_u2d1 = getSupportFragmentManager().beginTransaction();
        $this$setupFragments_u24lambda_u2d1.add(R.id.fragmentContainer, getAboutFragment(), "about").hide(getAboutFragment());
        $this$setupFragments_u24lambda_u2d1.add(R.id.fragmentContainer, getSettingsFragment(), "settings").hide(getSettingsFragment());
        $this$setupFragments_u24lambda_u2d1.add(R.id.fragmentContainer, getToolsFragment(), "tools").hide(getToolsFragment());
        $this$setupFragments_u24lambda_u2d1.add(R.id.fragmentContainer, getHomeFragment(), "home");
        $this$setupFragments_u24lambda_u2d1.commit();
    }

    private final void setupBottomNavigation() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        this.bottomNavigation = bottomNavigationView;
        if (bottomNavigationView == null) {
            return;
        }
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: com.everythingtoolbox.ui.MainActivity$$ExternalSyntheticLambda1
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return MainActivity.m41setupBottomNavigation$lambda2(this.f$0, menuItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupBottomNavigation$lambda-2, reason: not valid java name */
    public static final boolean m41setupBottomNavigation$lambda2(MainActivity this$0, MenuItem item) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "item");
        switch (item.getItemId()) {
            case R.id.nav_about /* 2131231042 */:
                this$0.switchFragment(this$0.getAboutFragment());
                break;
            case R.id.nav_home /* 2131231045 */:
                this$0.switchFragment(this$0.getHomeFragment());
                break;
            case R.id.nav_settings /* 2131231046 */:
                this$0.switchFragment(this$0.getSettingsFragment());
                break;
            case R.id.nav_tools /* 2131231047 */:
                this$0.switchFragment(this$0.getToolsFragment());
                break;
        }
        return true;
    }

    private final void switchFragment(Fragment fragment) {
        if (!Intrinsics.areEqual(fragment, this.activeFragment)) {
            getSupportFragmentManager().beginTransaction().hide(this.activeFragment).show(fragment).commit();
            this.activeFragment = fragment;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        switch (item.getItemId()) {
            case R.id.action_about /* 2131230771 */:
                BottomNavigationView bottomNavigationView = this.bottomNavigation;
                if (bottomNavigationView == null) {
                    return true;
                }
                bottomNavigationView.setSelectedItemId(R.id.nav_about);
                return true;
            case R.id.action_settings /* 2131230788 */:
                BottomNavigationView bottomNavigationView2 = this.bottomNavigation;
                if (bottomNavigationView2 == null) {
                    return true;
                }
                bottomNavigationView2.setSelectedItemId(R.id.nav_settings);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
