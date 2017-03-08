package com.example.matthew.punishermotors;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(new MyView(this));
    }
    //public class MyView extends View
    {
        //Paint paint = null;
        //public MyView(Context context)
        {
            //super(context);
            //paint = new Paint();
        }

        //@Override
        //protected void onDraw(Canvas canvas)
        //{
            //super.onDraw(canvas);
            //int x = getWidth();
            //int y = 500;
            //int radius;
            //radius = 100;
            //paint.setStyle(Paint.Style.FILL);
            //paint.setColor(Color.WHITE);
            //canvas.drawPaint(paint);
            // Use Color.parseColor to define HTML colors
            //paint.setColor(Color.parseColor("#CD5C5C"));
            //canvas.drawCircle(x / 2, y , radius, paint);
        //}
    }
}
