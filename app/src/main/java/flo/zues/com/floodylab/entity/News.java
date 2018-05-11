package flo.zues.com.floodylab.entity;

/**
 * Created by huangxz on 2017/11/7.
 */

public class News {


    /**
     * title : Meizu
     * thum : /upload/20171201/20171201143511_123123.jpg
     * url : http://www.meizu.com
     * sort : 3
     */

    private String title;
    private String thum;
    private String url;
    private int sort;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThum() {
        return thum;
    }

    public void setThum(String thum) {
        this.thum = thum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
