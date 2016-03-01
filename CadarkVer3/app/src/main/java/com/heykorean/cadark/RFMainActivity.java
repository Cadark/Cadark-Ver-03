package com.heykorean.cadark;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.ListView;

import com.heykorean.cadark.adapter.RFAdapterListCarHome;
import com.heykorean.cadark.api_retrofit.RFApi;
import com.heykorean.cadark.models.CarListHome;

import java.util.ArrayList;


public class RFMainActivity extends Activity {
    private ListView listViewContact;
    private RFAdapterListCarHome adapterContact;
    private ArrayList<CarListHome> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_listcar_frag_layout);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        arrayList =  RFApi.getContact();
        listViewContact = (ListView)findViewById(R.id.listViewContact);
        adapterContact = new RFAdapterListCarHome(this, R.layout.car_list_item, arrayList);
        listViewContact.setAdapter(adapterContact);


    }


}
