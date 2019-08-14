package kr.co.ajou.lalulintasforecast;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.view.View;

class ViewPagerAdapter extends PagerAdapter {
    public ViewPagerAdapter(FragmentManager supportFragmentManager) {
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return false;
    }
}
