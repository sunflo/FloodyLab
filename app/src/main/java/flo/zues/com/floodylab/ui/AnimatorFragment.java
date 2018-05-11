package flo.zues.com.floodylab.ui;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import flo.zues.com.floodylab.R;
import flo.zues.com.floodylab.widget.SportView;

/**
 * Created by huangxz on 2018/1/24.
 */

public class AnimatorFragment extends android.support.v4.app.Fragment implements View.OnClickListener {
    @BindView(R.id.image_anim)
    ImageView imageView;
    @BindView(R.id.sport_view)
    SportView mSpView;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_animator, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick({R.id.btn_anim, R.id.btn_reset, R.id.btn_obj})
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_anim:
                imageView.animate().translationX(180).scaleX(0.5f).scaleX(1).scaleY(0.5f).scaleY(1).alpha(0.2f).alpha(1).setDuration(500).setInterpolator(new LinearInterpolator());
                break;
            case R.id.btn_obj:
//ObjectAnimator.ofFloat(imageView, "translationX", 180).start();

                // 在 0% 处开始
                Keyframe keyframe1 = Keyframe.ofInt(0, 0);
// 时间经过 50% 的时候，动画完成度 100%
                Keyframe keyframe2 = Keyframe.ofInt(0.5f, 100);
// 时间见过 100% 的时候，动画完成度倒退到 80%，即反弹 20%
                Keyframe keyframe3 = Keyframe.ofInt(1, 80);

                PropertyValuesHolder holder = PropertyValuesHolder.ofKeyframe("progress", keyframe1, keyframe2, keyframe3);
                ObjectAnimator.ofPropertyValuesHolder(mSpView, holder).start();
                break;
            case R.id.btn_reset:
                imageView.animate().translationX(0);
                break;
        }
    }
}
