package com.windy.androidplayer.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.windy.androidplayer.R;

public class MenuFragment extends Fragment implements OnClickListener {

	private RelativeLayout rlLine1, rlLine2, rlLine3, rlLine4, rlLine5;
	private View rootView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.layout_menu, null);
		rlLine1 = (RelativeLayout) rootView.findViewById(R.id.rlLine1);
		rlLine2 = (RelativeLayout) rootView.findViewById(R.id.rlLine2);
		rlLine3 = (RelativeLayout) rootView.findViewById(R.id.rlLine3);
		rlLine4 = (RelativeLayout) rootView.findViewById(R.id.rlLine4);
		rlLine5 = (RelativeLayout) rootView.findViewById(R.id.rlLine5);

		rlLine1.setOnClickListener(this);
		rlLine2.setOnClickListener(this);
		rlLine3.setOnClickListener(this);
		rlLine4.setOnClickListener(this);
		rlLine5.setOnClickListener(this);
		return rootView;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.rlLine1:
			Toast.makeText(getActivity(), "Line1", Toast.LENGTH_SHORT).show();
			break;
		case R.id.rlLine2:
			Toast.makeText(getActivity(), "Line2", Toast.LENGTH_SHORT).show();
			break;
		case R.id.rlLine3:
			Toast.makeText(getActivity(), "Line3", Toast.LENGTH_SHORT).show();
			break;
		case R.id.rlLine4:
			Toast.makeText(getActivity(), "Line4", Toast.LENGTH_SHORT).show();
			break;
		case R.id.rlLine5:
			Toast.makeText(getActivity(), "Line5", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
	}

}
