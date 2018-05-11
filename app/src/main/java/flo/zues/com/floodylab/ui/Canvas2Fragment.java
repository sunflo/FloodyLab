package flo.zues.com.floodylab.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import flo.zues.com.floodylab.R;

/**
 * Created by huangxz on 2018/1/23.
 */

public class Canvas2Fragment extends android.support.v4.app.Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(getActivity()).inflate(R.layout.fragment_canvas_2, container, false);
    }
}
