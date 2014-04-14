package com.example.ex_templete;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class OOActivity extends Activity {
	private boolean areButtonsShowing;
	private RelativeLayout composerButtonsWrapper;
	private ImageView composerButtonsShowHideButtonIcon;
	private RelativeLayout composerButtonsShowHideButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_oo);
		MyAnimations.initOffset(OOActivity.this);
		composerButtonsWrapper = (RelativeLayout) findViewById(R.id.composer_buttons_wrapper);
		composerButtonsShowHideButton = (RelativeLayout) findViewById(R.id.composer_buttons_show_hide_button);
		findViewById(R.id.OO_next).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(OOActivity.this,HahaActivity.class));				
			}
		});
		composerButtonsShowHideButtonIcon = (ImageView) findViewById(R.id.composer_buttons_show_hide_button_icon);
		
		composerButtonsShowHideButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (!areButtonsShowing) {
					MyAnimations.startAnimationsIn(composerButtonsWrapper, 300);
					composerButtonsShowHideButtonIcon
							.startAnimation(MyAnimations.getRotateAnimation(0,
									-270, 300));
				} else {
					MyAnimations
							.startAnimationsOut(composerButtonsWrapper, 300);
					composerButtonsShowHideButtonIcon
							.startAnimation(MyAnimations.getRotateAnimation(
									-270, 0, 300));
				}
				areButtonsShowing = !areButtonsShowing;
			}
		});
		for (int i = 0; i < composerButtonsWrapper.getChildCount(); i++) {
			composerButtonsWrapper.getChildAt(i).setOnClickListener(
					new View.OnClickListener() {
						@Override
						public void onClick(View arg0) {
						}
					});
		}
		
		composerButtonsShowHideButton.startAnimation(MyAnimations
				.getRotateAnimation(0, 360, 200));
		
		}
}
