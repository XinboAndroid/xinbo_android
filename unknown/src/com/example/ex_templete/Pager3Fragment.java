package com.example.ex_templete;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class Pager3Fragment extends Fragment {

	public Pager3Fragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View layout = inflater.inflate(R.layout.fragment_pager3, container, false);
		layout.findViewById(R.id.btn_start);
		return layout;
	}
	public void btn_start(View v) {
        Intent intent = new Intent();
//		startActivity(intent);
	}

}
