package com.dontknowpub.canvasdemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a reference to the ImageView in the layout
        ImageView ourFrame = (ImageView)
                findViewById(R.id.imageView);

        //Create a bitmap object to use on our Canvas
        Bitmap ourBitmap = Bitmap.createBitmap(300, 600, Bitmap.Config.ARGB_8888);
        Canvas ourCanvas = new Canvas(ourBitmap);

        //A paint object that does our drawing on our canvas
        Paint paint = new Paint();

        //set the background color
        ourCanvas.drawColor(Color.BLACK);

        //Change the color of the virutal paint brush
        paint.setColor(Color.argb(255,255,255,255));

        //Now draw a lot of stuff on our Canvas
        ourCanvas.drawText("Score: 42 lives: 3 High:97", 10, 10, paint);
        ourCanvas.drawLine(10, 50, 200, 50, paint);
        ourCanvas.drawCircle(110, 160, 100, paint);
        ourCanvas.drawPoint(10, 260, paint);

        //Now put the canvas in ourFrame
        ourFrame.setImageBitmap(ourBitmap);

    } //end of onCreate

}
