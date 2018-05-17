package flo.zues.com.floodylab.module.animation.ui;


import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import flo.zues.com.floodylab.R;

/**
 * Created by huangxz on 2018/5/11.
 */
public class ObjectAnimatorFragment extends Fragment implements View.OnClickListener {

    @BindView(R.id.an_view)
    View animView;
    @BindView(R.id.color_view)
    LinearLayout mColorView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.activity_animation_objectanimate, container, false);
        ButterKnife.bind(this, inflate);
        return inflate;
    }

    @OnClick({R.id.btn_start, R.id.btn_rgb})
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_start:
                animView.animate().rotation(180).setDuration(2000);

//                ObjectAnimator.ofFloat(animView, "translationX", 200).setDuration(500).start();
                break;
            case R.id.btn_rgb:
//                ObjectAnimator.ofArgb(mColorView,"color",0xFFFF00,0xFF00FF0);
                break;
        }

    }
}
