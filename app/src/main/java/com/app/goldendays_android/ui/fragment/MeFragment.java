package com.app.goldendays_android.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.goldendays_android.R;
import com.app.goldendays_android.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends BaseFragment {

    public static MeFragment newInstance() {
        // Required empty public constructor
        Bundle args = new Bundle();

        MeFragment fragment = new MeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_me, container, false);
    }

}
