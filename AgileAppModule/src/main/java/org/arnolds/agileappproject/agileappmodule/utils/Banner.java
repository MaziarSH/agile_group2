package org.arnolds.agileappproject.agileappmodule.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import org.arnolds.agileappproject.agileappmodule.R;

@SuppressWarnings("unused, deprecated")
public class Banner extends View {

    private final Drawable logo;

    public Banner(Context context) {
        super(context);
        logo = context.getResources().getDrawable(R.drawable.ic_arnold_body_build);
        setBackgroundDrawable(logo);
    }

    public Banner(Context context, AttributeSet attrs) {
        super(context, attrs);
        logo = context.getResources().getDrawable(R.drawable.ic_arnold_body_build);
        setBackgroundDrawable(logo);
    }

    public Banner(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        logo = context.getResources().getDrawable(R.drawable.ic_arnold_body_build);
        setBackgroundDrawable(logo);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec,
                             int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = width * logo.getIntrinsicHeight() / logo.getIntrinsicWidth();
        setMeasuredDimension(width, height);
    }
}
