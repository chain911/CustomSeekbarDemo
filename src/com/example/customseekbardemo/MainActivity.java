package com.example.customseekbardemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.LinearLayout;

import com.example.customseekbardemo.MyDoubleSeekBar.OnRangeSeekBarChangeListener;

public class MainActivity extends Activity {

	private Context mContext = null;
	private LinearLayout ll = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		mContext = getApplicationContext();
		
		ll = (LinearLayout) findViewById(R.id.llLayout);
		
		//双游标自定义seekbar
		MyDoubleSeekBar<Integer> doubleSeekbar = new MyDoubleSeekBar<Integer>(0, 100, mContext);
		doubleSeekbar.setOnRangeSeekBarChangeListener(new OnRangeSeekBarChangeListener<Integer>() {
			@Override
			public void onRangeSeekBarValuesChanged(MyDoubleSeekBar<?> bar, Integer minValue, Integer maxValue) {
				// TODO 左右游标滑动监听事件
			}
		});
		ll.addView(doubleSeekbar);
	}
}
