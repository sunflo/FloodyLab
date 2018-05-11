package flo.zues.com.floodylab.module.brvah.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangxz on 2018/5/8.
 */
public class SimpleModel {
    public String title;
    public String message;
    public String imgUrl;

    public static List<SimpleModel> fetch(int count) {
        List<SimpleModel> result = null;
        if (count > 0) {
            result = new ArrayList<>(count);
            SimpleModel sm = new SimpleModel();
            sm.title = "HelloBrvah";
            sm.message = "官方网站：www.recyclerview.org";
            sm.imgUrl = "http://upload.jianshu.io/users/upload_avatars/2153704/3992aa36b877.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/240/h/240";
            for (int i = 0; i < count; i++) {
                result.add(sm);
            }
        }
        return result;
    }
}
