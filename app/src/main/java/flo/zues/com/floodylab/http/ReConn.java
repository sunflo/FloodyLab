package flo.zues.com.floodylab.http;

import retrofit2.Retrofit;

/**
 * Created by huangxz on 2018/1/30.
 */

public class ReConn {
    private static ReConn instance;
    private Retrofit mClient;

    private String baseUrl = "localhost:3000/";

    public static ReConn getConn() {
        synchronized (ReConn.class) {
            if (instance == null) {
                instance = new ReConn();
            }
            return instance;
        }
    }

    private ReConn() {
        mClient = new Retrofit.Builder().baseUrl(baseUrl).build();
        throw new RuntimeException("ertyu");
    }

    public void http() {
    }


    public class Builder {
        public Builder baseUrl(String url) {
            baseUrl = url;
            return this;
        }

        public Builder setAdapter() {
            return this;
        }

        public Builder setConvert() {
            return this;
        }

        public Builder setResultWrapper() {
            return this;
        }

        public void build() {
            instance = new ReConn();
        }
    }
}
