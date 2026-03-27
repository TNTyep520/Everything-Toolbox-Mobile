package com.everythingtoolbox.ui.about;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.everythingtoolbox.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: AboutFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001a\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/everythingtoolbox/ui/about/AboutFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mediaPlayer", "Landroid/media/MediaPlayer;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", HttpUrl.FRAGMENT_ENCODE_SET, "onDevClicked", "name", HttpUrl.FRAGMENT_ENCODE_SET, "soundRes", HttpUrl.FRAGMENT_ENCODE_SET, "onViewCreated", "view", "playSound", "showDevInfo", "app_debug"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AboutFragment extends Fragment {
    private MediaPlayer mediaPlayer;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TextView tvVersion = (TextView) view.findViewById(R.id.tvVersion);
        tvVersion.setText("版本 1.0.0 Beta1");
        final ImageView ivLogo = (ImageView) view.findViewById(R.id.ivLogo);
        ivLogo.setOnClickListener(new View.OnClickListener() { // from class: com.everythingtoolbox.ui.about.AboutFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AboutFragment.m45onViewCreated$lambda0(this.f$0, ivLogo, view2);
            }
        });
        ImageView ivDev1 = (ImageView) view.findViewById(R.id.ivDev1);
        ImageView ivDev2 = (ImageView) view.findViewById(R.id.ivDev2);
        ImageView ivDev3 = (ImageView) view.findViewById(R.id.ivDev3);
        ImageView ivDev4 = (ImageView) view.findViewById(R.id.ivDev4);
        ivDev1.setOnClickListener(new View.OnClickListener() { // from class: com.everythingtoolbox.ui.about.AboutFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AboutFragment.m46onViewCreated$lambda1(this.f$0, view2);
            }
        });
        ivDev2.setOnClickListener(new View.OnClickListener() { // from class: com.everythingtoolbox.ui.about.AboutFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AboutFragment.m47onViewCreated$lambda2(this.f$0, view2);
            }
        });
        ivDev3.setOnClickListener(new View.OnClickListener() { // from class: com.everythingtoolbox.ui.about.AboutFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AboutFragment.m48onViewCreated$lambda3(this.f$0, view2);
            }
        });
        ivDev4.setOnClickListener(new View.OnClickListener() { // from class: com.everythingtoolbox.ui.about.AboutFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AboutFragment.m49onViewCreated$lambda4(this.f$0, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onViewCreated$lambda-0, reason: not valid java name */
    public static final void m45onViewCreated$lambda0(AboutFragment this$0, ImageView $ivLogo, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Animation shake = AnimationUtils.loadAnimation(this$0.getContext(), R.anim.shake);
        $ivLogo.startAnimation(shake);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onViewCreated$lambda-1, reason: not valid java name */
    public static final void m46onViewCreated$lambda1(AboutFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onDevClicked("芸捌", R.raw.dev1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onViewCreated$lambda-2, reason: not valid java name */
    public static final void m47onViewCreated$lambda2(AboutFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onDevClicked("芸柒", R.raw.dev2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onViewCreated$lambda-3, reason: not valid java name */
    public static final void m48onViewCreated$lambda3(AboutFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onDevClicked("橘仔", R.raw.dev3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onViewCreated$lambda-4, reason: not valid java name */
    public static final void m49onViewCreated$lambda4(AboutFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onDevClicked("龟仔", R.raw.dev4);
    }

    private final void onDevClicked(String name, int soundRes) {
        showDevInfo(name);
        playSound(soundRes);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void showDevInfo(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            java.lang.String r1 = "嘎嘎嘎，嘎嘎嘎~"
            switch(r0) {
                case 864124: goto L2f;
                case 1062804: goto L24;
                case 1063962: goto L19;
                case 1286933: goto Lb;
                default: goto La;
            }
        La:
            goto L3d
        Lb:
            java.lang.String r0 = "龟仔"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L15
            goto La
        L15:
            java.lang.String r1 = "龟龟龟龟龟~"
            goto L40
        L19:
            java.lang.String r0 = "芸柒"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L23
            goto La
        L23:
            goto L40
        L24:
            java.lang.String r0 = "芸捌"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2e
            goto La
        L2e:
            goto L40
        L2f:
            java.lang.String r0 = "橘仔"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L39
            goto La
        L39:
            java.lang.String r1 = "喵~阿喵~"
            goto L40
        L3d:
            java.lang.String r1 = "感谢开发者的付出！"
        L40:
            r0 = r1
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            android.content.Context r2 = r4.requireContext()
            r1.<init>(r2)
            r2 = r5
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            java.lang.String r2 = "确定"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 0
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.everythingtoolbox.ui.about.AboutFragment.showDevInfo(java.lang.String):void");
    }

    private final void playSound(int soundRes) {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            MediaPlayer mediaPlayerCreate = MediaPlayer.create(getContext(), soundRes);
            this.mediaPlayer = mediaPlayerCreate;
            if (mediaPlayerCreate != null) {
                mediaPlayerCreate.start();
            }
        } catch (Exception e) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.mediaPlayer = null;
    }
}
