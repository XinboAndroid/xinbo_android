package com.example.ex_templete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Lwk_View extends View{

	public Lwk_View(Context context) {
		super(context);
		paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		paint.setColor(Color.YELLOW);
		paint.setTextSize(10);	
	}
	private Paint paint;	
	private int i;
	private float j;
	
	public Lwk_View(Context context, AttributeSet attrs) {
		super(context, attrs);
		paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		paint.setColor(Color.YELLOW);
		paint.setTextSize(i);				
	}
	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawText("呵呵呵呵呵",5, 10, paint);
		super.onDraw(canvas);
	}
	public void setIJ(int i,float j){
		this.i=i;
		this.j=j;
	}
}
