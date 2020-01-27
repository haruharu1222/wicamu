package com.example.wicamu_main;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.os.Bundle;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MyView myView = new MyView(this);
//        setContentView(myView);


        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_calendar, R.id.navigation_wicamu)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


    }


    // Viewを継承したクラス
    class MyView extends View {
        Paint paint;

        // 描画するラインの太さ
        float StrokeWidth = 20.0f;

        public MyView(Context context) {
            super(context);
            paint = new Paint();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            // ペイントする色の設定
            paint.setColor(Color.argb(255, 255, 0, 255));
            // ペイントストロークの太さを設定
            paint.setStrokeWidth(StrokeWidth);
            // Styleのストロークを設定する
            paint.setStyle(Paint.Style.STROKE);

            // drawRectを使って矩形を描画する、引数に座標を設定
            // (x1,y1,x2,y2,paint) 左上の座標(x1,y1), 右下の座標(x2,y2)
            canvas.drawRect(300, 300,600, 600, paint);
        }
    }



/*
    class MyView extends View {
        Paint paint;
        Path path;

        float StrokeWidth1 = 20f;
        float StrokeWidth2 = 40f;
        float dp;

        public MyView(Context context) {
            super(context);
            paint = new Paint();
            path = new Path();

            // スクリーンサイズからdipのようなものを作る
            DisplayMetrics metrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(metrics);

            dp = getResources().getDisplayMetrics().density;
            Log.d("debug","fdp="+dp);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            // 背景
            canvas.drawColor(Color.argb(255, 0, 0, 125));

            // Canvas 中心点
            float xc = getWidth() / 2;
            float yc = getHeight() / 2;

            // 円
            paint.setColor(Color.argb(255, 125, 125, 255));
            paint.setStrokeWidth(StrokeWidth1);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            // (x1,y1,r,paint) 中心x1座標, 中心y1座標, r半径
            canvas.drawCircle(xc - 15*dp, yc - 55*dp, xc / 2, paint);

            // 矩形
            paint.setColor(Color.argb(255, 255, 0, 255));
            paint.setStyle(Paint.Style.STROKE);
            // (x1,y1,x2,y2,paint) 左上の座標(x1,y1), 右下の座標(x2,y2)
            canvas.drawRect(xc - 30*dp, yc - 50*dp,
                    xc + 120*dp, yc + 100*dp, paint);

            // 線
            paint.setStrokeWidth(StrokeWidth1);
            paint.setColor(Color.argb(255, 0, 255, 0));
            // (x1,y1,x2,y2,paint) 始点の座標(x1,y1), 終点の座標(x2,y2)
            canvas.drawLine(xc + 20*dp, yc - 30*dp, xc - 70*dp, yc + 70*dp, paint);

            // 三角形を書く
            float tx1 = 230*dp;
            float ty1 = 370*dp;
            float tx2 = 100*dp;
            float ty2 = 500*dp;
            float tx3 = 350*dp;
            float ty3 = 500*dp;

            paint.setStrokeWidth(10);
            paint.setColor(Color.WHITE);
            path.moveTo(tx1, ty1);
            path.lineTo(tx2, ty2);
            path.lineTo(tx3, ty3);
            path.lineTo(tx1, ty1);
            canvas.drawPath(path, paint);

            // 円
            paint.setColor(Color.YELLOW);
            paint.setStrokeWidth(StrokeWidth2);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            // (x,y,r,paint) x座標, y座標, r半径
            canvas.drawCircle(220*dp, 130*dp, 40*dp, paint);

        }
    }
 */

}
