package flo.zues.com.floodylab.module.animation.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;


import flo.zues.com.floodylab.R;

/**
 * Created by huangxz on 2018/5/9.
 */
public class FrameLoadingView extends RelativeLayout {
    private AnimationDrawable frameDrawable;
    private ImageView mImageView;

    private Context mContext;

    public FrameLoadingView(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }

    public FrameLoadingView(Context context, AttributeSet as) {
        super(context, as);
        this.mContext = context;
        initView();
    }

    private void initView() {
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);

        mImageView = new ImageView(mContext);
        mImageView.setImageResource(R.drawable.fram_loading);
        addView(mImageView);
        frameDrawable = (AnimationDrawable) mImageView.getDrawable();
        frameDrawable.start();



    }
}
