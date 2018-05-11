package flo.zues.com.floodylab.module.brvah.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import flo.zues.com.floodylab.R;
import flo.zues.com.floodylab.module.brvah.entity.SimpleModel;

/**
 * Created by huangxz on 2018/5/8.
 */
public class BrvahAdapter extends BaseQuickAdapter<SimpleModel, BaseViewHolder> {
    public BrvahAdapter(int layoutResId, @Nullable List<SimpleModel> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, SimpleModel item) {
        helper.setText(R.id.tv_title,item.title);
        helper.setText(R.id.tv_message,item.message);

        Glide.with(mContext).load(item.imgUrl).into((ImageView) helper.getView(R.id.imageView));
    }
}
