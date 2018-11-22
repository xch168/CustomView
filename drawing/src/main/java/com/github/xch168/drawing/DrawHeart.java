package com.github.xch168.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by XuCanHui on 2018/11/23.
 */
public class DrawHeart extends View {

    private Paint paint = new Paint();
    private Path path = new Path();

    public DrawHeart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    {
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawPath(path, paint);
    }
}
