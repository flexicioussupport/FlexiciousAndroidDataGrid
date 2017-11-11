package com.example.fexicious.androidDataGrid.renderer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import com.example.fexicious.androidDataGrid.R;

public class ButtonRenderer extends android.support.v7.widget.AppCompatButton implements View.OnClickListener {

	public ButtonRenderer(Context context) {
		super(context);
	}

	public ButtonRenderer(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public ButtonRenderer(Context context,
                          AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;

		this.setText(getResources().getString(R.string.view));
		this.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
		this.setTextColor(Color.parseColor("#FAFAFA"));
		this.setBackgroundResource(R.drawable.bg_button);
		this.setOnClickListener(this);
	}

	private Object data;

	@Override
	public void onClick(View view) {
		Toast.makeText(this.getContext(),"Button Clicked "+getData().toString(),Toast.LENGTH_LONG).show();
	}
}
