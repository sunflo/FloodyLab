package flo.zues.com.floodylab.module.animation.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import flo.zues.com.floodylab.R;

/**
 * Created by huangxz on 2018/5/11.
 */
public class TweenAnimatorFragment extends Fragment implements View.OnClickListener {
    @BindView(R.id.iv_anim1)
    View mAnimView1;
    @BindView(R.id.iv_anim2)
    View mAnimView2;
    @BindView(R.id.iv_anim3)
    View mAnimView3;
    @BindView(R.id.iv_anim4)
    View mAnimView4;
    @BindView(R.id.iv_anim_mix)
    View mAnimViewMix;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.activity_animation_frame, container, false);
        ButterKnife.bind(this, inflate);
        return inflate;
    }

    @OnClick({R.id.btn_alpah, R.id.btn_rotate, R.id.btn_scale, R.id.btn_trans, R.id.iv_anim_mix})
    @Override
    public void onClick(View v) {
        int id = v.getId();
        Animation am = null;
        switch (id) {
            case R.id.btn_alpah:
//                am = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
                am = new AlphaAnimation(1.0f, 0.3f);
                am.setFillAfter(true);
//                am.setFillBefore(false    );
                am.setRepeatMode(Animation.REVERSE);
                am.setRepeatCount(Animation.INFINITE);
                am.setInterpolator(getActivity(), android.R.anim.decelerate_interpolator);
                am.setDuration(1000);

                mAnimView1.startAnimation(am);

                break;
            case R.id.btn_rotate:
//                //两个参数表示开始结束的角度，默认圆心为view左上角
//                am = new RotateAnimation(0, 360);
//                // 参数分别是开始结束的角度，相对于view自身的绝对坐标
//                am = new RotateAnimation(0, 360,80,20);
                am = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                am.setDuration(500);
                am.setRepeatCount(Animation.INFINITE);
                am.setInterpolator(getActivity(), android.R.anim.cycle_interpolator);
                am.setFillAfter(true);
                mAnimView2.startAnimation(am);
                break;
            case R.id.btn_scale:
//                am = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
                am = new ScaleAnimation(0.5f, 1, 0.5f, 1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                am.setInterpolator(getActivity(), android.R.anim.bounce_interpolator);
                am.setFillAfter(true);
                am.setDuration(1000);
                mAnimView3.startAnimation(am);
                break;
            case R.id.btn_trans:
//                am = AnimationUtils.loadAnimation(this, R.anim.anim_trans);
//                am = new TranslateAnimation(0,20,0,20);
                am = new TranslateAnimation(Animation.RELATIVE_TO_SELF, -2f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 0f);
                am.setDuration(500);
                am.setInterpolator(getActivity(), android.R.anim.bounce_interpolator);
                mAnimView4.startAnimation(am);
                break;
            case R.id.iv_anim_mix:
//                am = AnimationUtils.loadAnimation(this, R.anim.anim_mix_set);

                AnimationSet as = new AnimationSet(true);
                as.setDuration(50);
                as.setRepeatCount(Animation.INFINITE);
                as.setInterpolator(getActivity(), android.R.anim.bounce_interpolator);

                ScaleAnimation sa = new ScaleAnimation(1, 1.1f, 1, 1.1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                sa.setRepeatCount(Animation.INFINITE);
                sa.setRepeatMode(Animation.REVERSE);
                sa.setDuration(500);

                RotateAnimation ra = new RotateAnimation(-5, 5, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 1f);
                ra.setRepeatCount(Animation.INFINITE);
                ra.setFillAfter(true);
                as.setInterpolator(getActivity(), android.R.anim.bounce_interpolator);
                ra.setDuration(20);
                ra.setStartOffset(1000);

                AlphaAnimation aa = new AlphaAnimation(1f, 0.7f);
                aa.setRepeatCount(Animation.INFINITE);
                aa.setRepeatMode(Animation.REVERSE);
                aa.setDuration(500);

//                as.addAnimation(sa);
                as.addAnimation(ra);
//                as.addAnimation(aa);

                mAnimViewMix.startAnimation(as);
                break;
        }
    }
}
