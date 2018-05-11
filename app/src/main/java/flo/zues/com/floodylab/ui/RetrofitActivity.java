package flo.zues.com.floodylab.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;
import flo.zues.com.floodylab.R;
import flo.zues.com.floodylab.entity.BaseResponse;
import flo.zues.com.floodylab.entity.News;
import flo.zues.com.floodylab.service.HttpNewsInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by huangxz on 2018/1/2.
 */

public class RetrofitActivity extends AppCompatActivity implements View.OnClickListener {
    public static String SERVER_DOMAIN = "http://172.31.59.78:9022/";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.retrofit_activity);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.btn_get)
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_get:
                Retrofit client = new Retrofit.Builder().baseUrl(SERVER_DOMAIN).addConverterFactory(GsonConverterFactory.create()).build();
                final HttpNewsInterface request = client.create(HttpNewsInterface.class);
                Call<BaseResponse<News>> newsList = request.getNewsList(20, 1);

                newsList.enqueue(new Callback<BaseResponse<News>>() {
                    @Override
                    public void onResponse(Call<BaseResponse<News>> call, Response<BaseResponse<News>> response) {
                        response.body();
                    }

                    @Override
                    public void onFailure(Call<BaseResponse<News>> call, Throwable t) {

                    }
                });

//                news/list
                break;
        }
    }
}
