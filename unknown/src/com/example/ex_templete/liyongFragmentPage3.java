package com.example.ex_templete;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

@SuppressLint("NewApi")
public class liyongFragmentPage3 extends Fragment implements OnClickListener{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {	
		View layout = inflater.inflate(R.layout.fragment_3, null);
		Button btnnext = (Button) layout.findViewById(R.id.bt_dianji);
		btnnext.setOnClickListener(this);
		
		return layout;
		
	}

	@Override
	public void onClick(View v)
	{
		Intent intent=new Intent();
		intent.setClass(getActivity(), RuanActivity10.class);
		startActivity(intent);
		
	}	
	
	
}