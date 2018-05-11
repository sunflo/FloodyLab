package flo.zues.com.floodylab.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import flo.zues.com.floodylab.R;
import flo.zues.com.floodylab.adapter.CanvasPagerAdapter;

/**
 * Created by huangxz on 2018/1/22.
 */

public class CanvasActivity extends AppCompatActivity {
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
            add(new Canvas1Fragment());
            add(new Canvas2Fragment());
            add(new Canvas3Fragment());
            add(new AnimatorFragment());
        }});

        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
