package com.example.ex_templete;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class ViewPagerFragment extends Fragment {

	public ViewPagerFragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View layout = inflater.inflate(R.layout.fragment_view_pager, container, false);
		ViewPager viewPager = (ViewPager) layout.findViewById(R.id.pager1);
		FragmentManager fm = getChildFragmentManager();
		viewPager.setAdapter(new MyAdapter(fm));
		return layout;
	}
	class MyAdapter extends FragmentPagerAdapter{

		public MyAdapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int position) {
			switch (position) {
			case 0:
				return new Pager1Fragment();
			case 1:
				return new Pager2Fragment();
			case 2:
				return new Pager3Fragment();

			default:
				break;
			}
			return null;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 3;
		}
		
	}

}
