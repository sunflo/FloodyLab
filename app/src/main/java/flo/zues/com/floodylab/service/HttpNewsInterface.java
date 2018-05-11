package flo.zues.com.floodylab.service;

import java.util.List;

import flo.zues.com.floodylab.entity.BaseResponse;
import flo.zues.com.floodylab.entity.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by huangxz on 2018/1/2.
 */

public interface HttpNewsInterface {

    @GET("icp/api/app/ad/list/{pageSize}/{page}")
    Call<BaseResponse<News>> getNewsList(@Path("pageSize") int size, @Path("page") int page);
}
