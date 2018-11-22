package com.github.xch168.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by XuCanHui on 2018/11/23.
 */
public class DrawArc extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public DrawArc(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200, 100, 800, 500, -110, 100, true, paint);
        canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint);

    }
}
