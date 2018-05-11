package flo.zues.com.floodylab.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import flo.zues.com.floodylab.R;

/**
 * Created by huangxz on 2018/1/22.
 */

public class CanvasTestView3 extends View {

    Paint mPaint = new Paint();

    public CanvasTestView3(Context context) {
        super(context);
    }

    public CanvasTestView3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public CanvasTestView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr, 0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mPaint.setColor(Color.RED);
//
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.alipay);
//        canvas.drawBitmap(bmp, 10, 10, mPaint);
//        //
//        canvas.save();
//        canvas.clipRect(180, 20, 260, 130);
//        canvas.drawBitmap(bmp, 150, 10, mPaint);
//        canvas.restore();
////
//        canvas.save();
//        Path clipPath = new Path();
//        clipPath.setLastPoint(320, 15);
//        clipPath.lineTo(400, 20);
//        clipPath.lineTo(260, 80);
//        clipPath.close();
//        canvas.clipPath(clipPath);
//        canvas.drawBitmap(bmp, 290, 10, mPaint);
//        canvas.restore();
//        //
//        canvas.save();
//        canvas.translate(150, 0);
//        canvas.drawBitmap(bmp, 10, 200, mPaint);
//        canvas.restore();
//
//        canvas.save();
//        canvas.rotate(45);
//        canvas.drawBitmap(bmp, 10, 60, mPaint);
//
//        canvas.drawBitmap(bmp,200,60,mPaint);
//        canvas.restore();
//
//        canvas.save();
//        canvas.scale(2,2);
//        canvas.drawBitmap(bmp,10,200,mPaint);
//        canvas.restore();
//
//        canvas.save();
//        canvas.skew(0,0.5f);
//        canvas.drawBitmap(bmp,10,700,mPaint);
//        canvas.restore();
//
//        Matrix mt = new Matrix();
//        mt.reset();
//        canvas.save();
//        mt.preTranslate(390,10);
//        canvas.concat(mt);
//        canvas.drawBitmap(bmp,100,0,mPaint);
//        canvas.restore();
//        //
//
//        canvas.save();
//        float[] from = {30,900,138,900,10,1028,138,1028};
//        float[] tooo = {40,900,138,900,10,1028,138,1028};
////        float[] tooo = {30,850,170,800,0,1100,115,1150};
//        mt.reset();
//        mt.setPolyToPoly(from,0,tooo,0,4);
//        canvas.concat(mt);
//        canvas.drawBitmap(bmp,10,900,mPaint);
//        canvas.restore();

        mPaint.setAntiAlias(true);
        Camera cam = new Camera();
        canvas.save();
        cam.save();
        cam.rotateX(30);
        canvas.translate(264, 264);
        cam.applyToCanvas(canvas);
        canvas.translate(-264, -264);
        cam.restore();
        canvas.drawBitmap(bmp,200,200,mPaint);
        canvas.restore();
    }
}
