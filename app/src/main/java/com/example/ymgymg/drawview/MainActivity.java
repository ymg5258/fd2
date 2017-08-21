package com.example.ymgymg.drawview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));


//        setContentView(R.layout.activity_main);
//        findViewById(R.id.bn1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent();
//                String data="http://www.baidu.com";
//                Uri uri= Uri.parse(data);
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.setData(uri);
//                startActivity(intent);
//            }
//        });
    }
    public void viewWeb(){

        Intent intent=new Intent();
        String data="http://www.crazyit.org";
        Uri uri= Uri.parse(data);
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(uri);
        startActivity(intent);
    }
    class MyView extends View{
        public MyView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.WHITE);
            Paint paint=new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(4);
            int viewWidth=this.getWidth();
            canvas.drawCircle(viewWidth/10+10,viewWidth/10+10,viewWidth/10,paint);
        }
    }

}
