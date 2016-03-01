package com.heykorean.cadark.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.heykorean.cadark.R;

/**
 * Created by Hey.Hung on 2/25/2016.
 */
public class Profile_User_Frag extends Fragment implements View.OnClickListener {
    private LinearLayout llEditProfile;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        initView(v);
        return v;
    }

    private void initView(View v) {
        llEditProfile = (LinearLayout) v.findViewById(R.id.ll_edit_profile);
        llEditProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_edit_profile:
                startActivity(new Intent(getContext(),EditProfileActivity.class));
                break;
        }
    }
}
