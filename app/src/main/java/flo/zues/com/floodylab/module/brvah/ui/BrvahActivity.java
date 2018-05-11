package flo.zues.com.floodylab.module.brvah.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import flo.zues.com.floodylab.R;
import flo.zues.com.floodylab.module.brvah.adapter.BrvahAdapter;
import flo.zues.com.floodylab.module.brvah.entity.SimpleModel;

/**
 * Created by huangxz on 2018/5/8.
 */
public class BrvahActivity extends AppCompatActivity {
    @BindView(R.id.recycler)
    RecyclerView mRecyclerView;
    @BindView(R.id.sprf)
    SwipeRefreshLayout mRefreshLayout;
    int count = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brvah);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        final BrvahAdapter brvahAdapter = new BrvahAdapter(R.layout.item4brvah, SimpleModel.fetch(10));
        brvahAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(BrvahActivity.this, String.format("item %s clicked", position), Toast.LENGTH_SHORT).show();
            }
        });
        brvahAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        brvahAdapter.isFirstOnly(true);
        brvahAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                mRecyclerView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        brvahAdapter.addData(SimpleModel.fetch(5));
                        if (++count == 1) {
                            brvahAdapter.loadMoreFail();
                        } else if (++count > 5) {
                            brvahAdapter.loadMoreEnd();
                        } else {
                            brvahAdapter.loadMoreComplete();
                        }
                    }
                }, 2000);
            }

        }, mRecyclerView);
        mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mRecyclerView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        brvahAdapter.setNewData(SimpleModel.fetch(10));
                        mRefreshLayout.setRefreshing(false);
                    }
                }, 2000);

            }
        });
        mRecyclerView.setAdapter(brvahAdapter);
    }
}
