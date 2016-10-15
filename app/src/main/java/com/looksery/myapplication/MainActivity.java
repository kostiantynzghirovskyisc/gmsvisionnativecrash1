package com.looksery.myapplication;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG = "silentnuke-debugging";

    private FaceDetector mDetector;
    private ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        singleThreadExecutor.submit(new Runnable() {
            @Override
            public void run() {
                detectOn("/sdcard/img_1.jpg");
                detectOn("/sdcard/img_2.jpg");
            }
        });
    }

    private void detectOn(String thumbnailFile) {
        if (mDetector == null) {
            Log.d(TAG, "Build face detector started.");
            mDetector = new FaceDetector.Builder(this)
                    .setTrackingEnabled(false)
                    .setLandmarkType(FaceDetector.ALL_LANDMARKS)
                    .setMode(FaceDetector.FAST_MODE)
                    .setClassificationType(FaceDetector.NO_CLASSIFICATIONS)
                    .build();
            Log.d(TAG, "Build face detector ended. isOperational=" + mDetector.isOperational());
        }

        Log.d(TAG, "try to decode file to bitmap started" + thumbnailFile);
        Bitmap bitmap = BitmapFactory.decodeFile(thumbnailFile);
        Log.d(TAG, "try to decode file to bitmap ended" + thumbnailFile);
        Frame frame = new Frame.Builder().setBitmap(bitmap).build();
        Log.d(TAG, "create frame from bitmap " + thumbnailFile);
        SparseArray<Face> faces = mDetector.detect(frame);
        Log.d(TAG, "detect faces for frame " + faces.size());
    }
}
