package com.heykorean.cadark.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.heykorean.cadark.R;

/**
 * Created by Hey.Hung on 2/25/2016.
 */
public class Profile_User_Frag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.profile_user_frag_layout, container, false);
        return v;
    }
}
