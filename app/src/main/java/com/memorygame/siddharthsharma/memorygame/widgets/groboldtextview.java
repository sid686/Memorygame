package com.memorygame.siddharthsharma.memorygame.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by siddharth sharma on 1/11/2018.
 */

public class groboldtextview extends android.support.v7.widget.AppCompatTextView {
    public groboldtextview(Context context) {
        super(context);
        Typeface face=Typeface.createFromAsset(context.getAssets(),"fonts/grobold.ttf");
        this.setTypeface(face);
    }

    public groboldtextview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getAssets(),"fonts/grobold.ttf");
        this.setTypeface(face);
    }

    public groboldtextview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Typeface face=Typeface.createFromAsset(context.getAssets(),"fonts/grobold.ttf");
        this.setTypeface(face);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
