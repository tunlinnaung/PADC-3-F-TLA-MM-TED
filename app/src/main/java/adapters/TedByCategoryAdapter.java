package adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eidoshack on 2/2/18.
 */

public class TedByCategoryAdapter extends FragmentStatePagerAdapter {

    private int[] titleIcons;
    private List<Fragment> categories;
    private Context context;

    public TedByCategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        titleIcons = new int[5];
        categories = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return categories.get(position);
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    public void addTap(int index, int imageRes, Fragment fragment)
    {
        titleIcons[index] = imageRes;
        categories.add(fragment);
        notifyDataSetChanged();
    }

    public void addTapIcons(TabLayout mTabLayout) {
        for (int i = 0; i < categories.size(); i++) {
            mTabLayout.getTabAt(i).setIcon(titleIcons[i]);
        }
    }
}
