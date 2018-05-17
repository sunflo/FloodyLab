package flo.zues.com.floodylab.module.animation.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import flo.zues.com.floodylab.R;
import flo.zues.com.floodylab.adapter.CanvasPagerAdapter;
import flo.zues.com.floodylab.ui.AnimatorFragment;
import flo.zues.com.floodylab.ui.Canvas1Fragment;
import flo.zues.com.floodylab.ui.Canvas2Fragment;
import flo.zues.com.floodylab.ui.Canvas3Fragment;

/**
 * Created by huangxz on 2018/5/9.
 */
public class AnimationActivity extends AppCompatActivity {

    @BindView(R.id.tablayout)
    TabLayout mTabLayout;
    @BindView(R.id.viewpager)
    ViewPager mViewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        ButterKnife.bind(this);

        final CanvasPagerAdapter adapter = new CanvasPagerAdapter(getSupportFragmentManager());
        adapter.setFragments(new ArrayList<Fragment>() {{
            add(new TweenAnimatorFragment());
            add(new ObjectAnimatorFragment());
//            add(new Canvas3Fragment());
//            add(new AnimatorFragment());
        }});

        adapter.setTitles(new ArrayList<String>() {{
            add("Tween");
            add("Object");
        }});
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }


}
