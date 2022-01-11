package com.wilson.maxtapeplayer;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import static com.wilson.maxtapeplayer.R.raw.*;

/**
 * This class is used to demonstrate how Hotstar App can show Ad Images every 10th sec for 5 sec
 * @author Wilson Daniel
 * @version 0.1
 * */


public class MainActivity extends AppCompatActivity {
    private SurfaceView surfaceView;
    MediaPlayer mediaPlayer;
    private ImageView imageView;
    int finalN = 0;

    @SuppressLint("ResourceType")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surfaceView = findViewById(R.id.surfaceView);
        imageView = findViewById(R.id.imageView);

        mediaPlayer = MediaPlayer.create(this, sample);
        mediaPlayer.start();
        surfaceView.setKeepScreenOn(true);
        SurfaceHolder surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaPlayer.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.cc4);
            }
        }, 10000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageBitmap(null);
            }
        }, 15000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.cc1);
            }
        }, 20000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageBitmap(null);
            }
        }, 25000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.cc3);
            }
        }, 30000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageBitmap(null);
            }
        }, 35000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.cc2);
            }
        }, 40000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageBitmap(null);
            }
        }, 45000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.cc5);
            }
        }, 50000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageBitmap(null);
            }
        }, 55000);

        //OPTIMIZED SOLUTION
//        Integer image[] = {R.drawable.cc1,R.drawable.cc2,R.drawable.cc3,R.drawable.cc4,R.drawable.cc5};
//        int i=10000;
//        int hi = i+5000;
//        while(mediaPlayer.isPlaying()){
//            //Integer finalN = n;
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    imageView.setImageResource(image[finalN]);
//                }
//            }, i);
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    imageView.setImageBitmap(null);
//                }
//            }, hi);
//            i+=10000;
//            finalN++;
//        }
//        int last = mediaPlayer.getDuration();
//        for(int i=10000 ; i<last ; i++){
//
//        }
//        if(mediaPlayer.isPlaying()){
//            int last = mediaPlayer.getDuration();
//            while(i!=last){
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        imageView.setImageResource(image[finalN]);
//                    }
//                }, i);
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        imageView.setImageBitmap(null);
//                    }
//                }, hi);
//                i+=5000;
//                finalN++;
//            }
//        }
//        while(mediaPlayer.isPlaying()){
//            //Integer finalN = n;
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    imageView.setImageResource(image[finalN]);
//                }
//            }, i);
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    imageView.setImageBitmap(null);
//                }
//            }, hi);
//            i+=5000;
//            finalN++;
//        }
//        imageView.setImageDrawable(getResources().getDrawable(R.drawable.cc));
//        imageView.setImageDrawable(getResources().getDrawable(R.drawable.cc1)); // set image2

//        while(mediaPlayer.isPlaying()){
//            int last = mediaPlayer.getDuration();
//            for(int i=0 ; i<last ; i++){
//                if(i>=10000 & i<=15000){
//                    imageView.setImageResource(cc);
//                }else{
//                    imageView.setImageResource(null);
//                }
//            }
//        }
//        imageView.setImageResource(cc);
//        imageView.setImageBitmap(bitmapObject);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                imageView.setImageBitmap(null);
//            }
//        }, 5000);
//        imageView.setImageResource(cc);
//        imageView.setImageBitmap(bitmapObject);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                imageView.setImageBitmap(null);
//            }
//        }, 10000);
//        imageView.setImageResource(cc1);
        //int last = mediaPlayer.getDuration();
//        for(int i=0 ; i<last ; i++){
//            i = mediaPlayer.getCurrentPosition();
//            if(i>=10 & i<=15){
//                //imageview.setImageResource(cc);
//            }
//        }
//        if(mediaPlayer.getCurrentPosition()>=5){
//            imageview.setImageResource(cc);
//        }
        //imageView.setImageResource(cc);
    }


}