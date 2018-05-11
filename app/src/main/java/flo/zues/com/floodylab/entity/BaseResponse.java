package flo.zues.com.floodylab.entity;

import java.util.List;

/**
 * Created by huangxz on 2018/1/2.
 */

public class BaseResponse<T> {

    /**
     * succ : true
     * statusCode : 200
     * msg : 获取巡检工单详情数据成功
     * data : [{"id":31,"code":"SSC-75","title":"SSC-75-长江路","headCount":1,"camCount":1,"lon":"120.942666","lat":"31.36624","engerStatus":2}]
     * time : 1514880544416
     */

    private boolean succ;
    private int statusCode;
    private String msg;
    private long time;
    private List<T> data;

    public boolean isSucc() {
        return succ;
    }

    public void setSucc(boolean succ) {
        this.succ = succ;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }


}
