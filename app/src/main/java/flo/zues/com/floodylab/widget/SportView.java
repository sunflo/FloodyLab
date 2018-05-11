package flo.zues.com.floodylab.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by huangxz on 2018/1/24.
 */

public class SportView extends View {

    Paint mPaint = new Paint();

    private int progress = 20;

    public SportView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.GRAY);
        mPaint.setColor(Color.parseColor("#E71E64"));

        mPaint.setStrokeWidth(30);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStyle(Paint.Style.STROKE);
        float degree = (float) progress / 100f * 365f;
        canvas.drawArc(30, 30, 300, 300, -180, degree, false, mPaint);

        mPaint.reset();
        mPaint.setTextSize(14);
        mPaint.setColor(Color.WHITE);
        canvas.drawText(progress + "%", 60, 180, mPaint);



    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureSpec.getMode(widthMeasureSpec);
        MeasureSpec.getSize(widthMeasureSpec);




        setMeasuredDimension(resolveSize(350, widthMeasureSpec), resolveSize(350, heightMeasureSpec));
    }
}
