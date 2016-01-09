package remington.productions.viewpager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

@SuppressLint("NewApi")
public class ViewPager_Example extends FragmentActivity implements OnClickListener {
	// FRAGMENT
	private static final int NUM_PAGES = 3;
	private ViewPager mPager;
	private PagerAdapter mPagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_view_pager);

		mPager = (ViewPager) findViewById(R.id.pager);
		/** set animations */
		// mPager.setPageTransformer(true, new ZoomOutPageTransformer());
		mPager.setPageTransformer(true, new AnimationTransition1());
		mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
		mPager.setAdapter(mPagerAdapter);
		mPager.setCurrentItem(1);
	}

	@Override
	public void onBackPressed() {
		if (mPager.getCurrentItem() == 1) {
			super.onBackPressed();
		} else {
			mPager.setCurrentItem(1);
		}
	}

	private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
		public ScreenSlidePagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {

			if (position == 0) {
				return new Fragment_Example_One();
			}
			if (position == 1) {
				return new Fragment_Example_Two();
			}
			if (position == 2) {
				return new Fragment_Example_Three();
			}
			return new Fragment_Example_One();
		}

		@Override
		public int getCount() {
			return NUM_PAGES;
		}
	}

	@Override
	public void onClick(View v) {

	}
}