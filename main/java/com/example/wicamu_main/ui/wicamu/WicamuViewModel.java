package com.example.wicamu_main.ui.wicamu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class WicamuViewModel extends View {

    Paint paint;

    private float x=700;
    private float y=1000;
    private float r=300;
    private float a=200;
  // ルート３は"17320/10000”;



    public WicamuViewModel(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        //縦：2000
        //横：1400


        // 背景、半透明
        canvas.drawColor(Color.argb(127, 0, 127, 63));

        // must円
        paint.setColor(Color.argb(255, 0, 255, 0));
        paint.setStrokeWidth(30);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        // (x1,y1,r,paint) 中心x1座標, 中心y1座標, r半径
        canvas.drawCircle(x, y-(17320*(2*r-a))/(3*10000), r, paint);
        //canvas.drawCircle(x, y-2*r/3, r, paint);
        //canvas.drawCircle(x, y-2*r/3, r, paint);

        // can円
        paint.setColor(Color.argb(255, 255, 0, 0));
        paint.setStrokeWidth(30);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        // (x1,y1,r,paint) 中心x1座標, 中心y1座標, r半径
        canvas.drawCircle(x-(2*r-a)/2, y+(17320*(2*r-a))/(10000*6), r, paint);
        //canvas.drawCircle(x-r/root_three, y+r/3, r, paint);
        //canvas.drawCircle(x-r/2, y+r/3, r, paint);

        // will円
        paint.setColor(Color.argb(255, 0, 0, 255));
        paint.setStrokeWidth(30);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        // (x1,y1,r,paint) 中心x1座標, 中心y1座標, r半径
        canvas.drawCircle(x+(2*r-a)/2, y+(17320*(2*r-a))/(10000*6), r, paint);
        //canvas.drawCircle(x+r/root_three, y+r/3, r, paint);
        //canvas.drawCircle(x+r/2, y+r/3, r, paint);
    }
}