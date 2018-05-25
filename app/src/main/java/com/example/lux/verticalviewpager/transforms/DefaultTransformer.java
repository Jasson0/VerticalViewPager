package com.example.lux.verticalviewpager.transforms;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by lux on 2018/5/25.
 */

public class DefaultTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        page.setTranslationX(page.getWidth() * -position);
        float yPosition = position * page.getHeight();
        page.setTranslationY(yPosition);
    }
}
