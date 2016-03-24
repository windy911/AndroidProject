package com.windy.androidplayer.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.windy.androidplayer.R;
import com.windy.androidplayer.utils.MyToast;

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
                MyToast.showToast(getActivity(), "Line1");
                break;
            case R.id.rlLine2:
                MyToast.showToast(getActivity(), "Line2");
                break;
            case R.id.rlLine3:
                MyToast.showToast(getActivity(), "Line3");
                break;
            case R.id.rlLine4:
                MyToast.showToast(getActivity(), "Line4");
                break;
            case R.id.rlLine5:
                MyToast.showToast(getActivity(), "Line5");
                break;
            default:
                break;
        }
    }

}
