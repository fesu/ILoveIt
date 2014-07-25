package com.blackfoxmedia.iloveit;



import com.blackfoxmedia.iloveit.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class fragment_home extends Fragment implements View.OnClickListener{

	private ImageView ivprofile;
	private TextView tvrank;
	public Button btntest;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View view = inflater.inflate(R.layout.fragment_home,container, false);
		ivprofile = (ImageView)view.findViewById(R.id.iv_profilepic);
		tvrank = (TextView)view.findViewById(R.id.tv_rank);
		btntest = (Button)view.findViewById(R.id.btn_test);
		
		btntest.setOnClickListener(this);
		
		
		return view;
	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.tv_rank:
			tvrank.setText("Hi");
			break;

		default:
			break;
		}
		
		
	}
	
	

}
