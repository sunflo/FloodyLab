package flo.zues.com.floodylab.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

import flo.zues.com.floodylab.R;

/**
 * Created by huangxz on 2018/1/22.
 */

public class CanvasTestView extends View {

    Paint mPaint = new Paint();

    public CanvasTestView(Context context) {
        super(context);
    }

    public CanvasTestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public CanvasTestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr, 0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#f2f2f2"));
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(20);

        mPaint.setColor(Color.parseColor("#457dd7"));
        canvas.drawCircle(100, 100, 80, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(new Rect(20, 200, 180, 260), mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(200, 200, 350, 260, mPaint);

        mPaint.setColor(Color.RED);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(20, 300, mPaint);

        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
// 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
        canvas.drawPoints(points, 2 /* 跳过两个数，即前两个 0 */,
                8 /* 一共绘制 8 个数（4 个点）*/, mPaint);

        canvas.drawOval(10, 280, 250, 400, mPaint);

        mPaint.setStrokeCap(Paint.Cap.SQUARE);
        mPaint.setStrokeWidth(2);
        canvas.drawLine(20, 450, 500, 500, mPaint);

        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(8);
        float[] pointss = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
        canvas.drawLines(pointss, mPaint);

        mPaint.setColor(Color.RED);
        canvas.drawRoundRect(20, 500, 300, 680, 20, 20, mPaint);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(320, 500, 600, 680, 20, 20, mPaint);

        mPaint.setColor(Color.BLUE);
        canvas.drawArc(20, 700, 600, 900, -180, 90, true, mPaint);


//        Shader shader = new LinearGradient(30, 980, 370, 980, Color.BLUE, Color.RED, Shader.TileMode.CLAMP);
        Shader shader = new RadialGradient(200, 980, 170, Color.RED, Color.BLUE, Shader.TileMode.CLAMP);
//        Shader shader = new SweepGradient(200,980,Color.RED,Color.BLUE);
//        mPaint.setShader(shader);
//
//        Path p = new Path();
//        p.setFillType(Path.FillType.WINDING);
//        p.addCircle(150, 980, 120, Path.Direction.CW);
//        p.addCircle(250, 980, 120, Path.Direction.CCW);


//        canvas.drawPath(p, mPaint);

        mPaint.setColor(Color.BLACK);
        canvas.drawText("Floody Test ", 20, 1150, mPaint);

//        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.pangqiu);
//
//        Shader ss = new BitmapShader(bmp, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
//
//        mPaint.setShader(ss);
//        canvas.drawCircle(300,1500,200,mPaint);

    }
}
