package flo.zues.com.floodylab.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import flo.zues.com.floodylab.R;

/**
 * Created by huangxz on 2018/1/23.
 */

public class PaintTestView extends View {
    Paint mPaint = new Paint();


    public PaintTestView(Context context) {
        super(context);
    }

    public PaintTestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public PaintTestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr, 0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.pangqiu);
//
//        ColorFilter cf = new LightingColorFilter(0x00ffff, 0x000000);
//        mPaint.setColorFilter(cf);
//        canvas.drawBitmap(bmp, 20, 20, mPaint);

        canvas.translate(canvas.getWidth() / 2, canvas.getHeight() / 2);

        Path path1 = new Path();
        Path path2 = new Path();
        Path path3 = new Path();
        Path path4 = new Path();

        path1.addCircle(0, 0, 200, Path.Direction.CW);
        path2.addRect(0, -200, 200, 200, Path.Direction.CW);
        path3.addCircle(0, -100, 100, Path.Direction.CW);
        path4.addCircle(0, 100, 100, Path.Direction.CCW);


        path1.op(path2, Path.Op.DIFFERENCE);
        path1.op(path3, Path.Op.UNION);
        path1.op(path4, Path.Op.DIFFERENCE);

        canvas.drawPath(path1, mPaint);
    }
}
