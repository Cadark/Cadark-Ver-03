package com.heykorean.cadark.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.heykorean.cadark.R;

/**
 * Created by Hey!TheAnh on 3/1/2016.
 */
public class EditProfileActivity extends Activity implements View.OnClickListener{
    private ImageView ivBack,ivOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        initView();
    }

    private void initView() {
        ivBack = (ImageView) findViewById(R.id.iv_confirm_back);
        ivOk = (ImageView) findViewById(R.id.iv_ok);
        ivBack.setOnClickListener(this);
        ivOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_confirm_back:
                finish();
                break;
            case R.id.iv_ok:
                finish();
                break;
        }
    }
}
