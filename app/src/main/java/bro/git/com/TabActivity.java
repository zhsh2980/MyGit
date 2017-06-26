package bro.git.com;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import bro.git.com.fragment.TabListFragment;
import bro.git.com.MainFragmentPagerAdapter;


public class TabActivity extends AppCompatActivity {


    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private int mTabCount = 4;
    private MainFragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        mTabLayout = (TabLayout) findViewById(R.id.id_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
        fragmentPagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager(), mTabCount);
        mViewPager.setAdapter(fragmentPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
