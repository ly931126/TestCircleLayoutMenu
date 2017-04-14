package com.android.tv.settings.testcirclelayoutmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.android.tv.settings.library_circle_layout.CircleMenuLayout;

public class CircleActivity extends Activity
{

	private CircleMenuLayout mCircleMenuLayout;

	private String[] mItemTexts = new String[] { "吃饭", "画画", "工作",
			"看电视", "健身", "谈恋爱" };
	private int[] mItemImgs = new int[] { R.drawable.eat,
			R.drawable.draw, R.drawable.work,
			R.drawable.tv, R.drawable.body,
			R.drawable.love };

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		//自已切换布局文件看效
		setContentView(R.layout.activity_circle);

		mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
		mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);
		
		

		mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener()
		{
			
			@Override
			public void itemClick(View view, int pos)
			{
				Toast.makeText(CircleActivity.this, mItemTexts[pos],
						Toast.LENGTH_SHORT).show();

			}
			
			@Override
			public void itemCenterClick(View view)
			{
				Toast.makeText(CircleActivity.this,
						"you can do something just like ccb  ",
						Toast.LENGTH_SHORT).show();
				
			}
		});
		
	}

}
