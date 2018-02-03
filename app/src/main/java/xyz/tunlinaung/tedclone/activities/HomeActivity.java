package xyz.tunlinaung.tedclone.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import adapters.TedByCategoryAdapter;
import adapters.TopicsAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import fragments.TopicsFragment;
import xyz.tunlinaung.tedclone.R;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolBar;

    @BindView(R.id.vp_ted_by_category)
    ViewPager vpTedByCategory;

    @BindView(R.id.tb_ted_by_category)
    TabLayout tbTedByCategory;

    @BindView(R.id.fab)
    FloatingActionButton mFab;

    private TedByCategoryAdapter tedByCategoryAdapter;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        ButterKnife.bind(this, this);

        setSupportActionBar(mToolBar);

        tedByCategoryAdapter = new TedByCategoryAdapter(getSupportFragmentManager(), getApplicationContext());
        vpTedByCategory.setAdapter(tedByCategoryAdapter);

        tbTedByCategory.setupWithViewPager(vpTedByCategory);

        tedByCategoryAdapter.addTap(0, R.drawable.ic_list_24dp, new TopicsFragment());
        tedByCategoryAdapter.addTap(1, R.drawable.ic_playlist_play_24dp, new TopicsFragment());
        tedByCategoryAdapter.addTap(2, R.drawable.ic_queue_music_24dp, new TopicsFragment());
        tedByCategoryAdapter.addTap(3, R.drawable.ic_lightbulb_outline_24dp, new TopicsFragment());
        tedByCategoryAdapter.addTap(4, R.drawable.ic_account_circle_24dp, new TopicsFragment());

        tedByCategoryAdapter.addTapIcons(tbTedByCategory);

        vpTedByCategory.setOffscreenPageLimit(tedByCategoryAdapter.getCount());

        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
