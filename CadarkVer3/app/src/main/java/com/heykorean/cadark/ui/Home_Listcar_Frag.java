package com.heykorean.cadark.ui;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.heykorean.cadark.R;
import com.heykorean.cadark.adapter.RFAdapterListCarHome;
import com.heykorean.cadark.api_retrofit.RFApi;
import com.heykorean.cadark.models.CarListHome;

import java.util.ArrayList;

/**
 * Created by Hey.Hung on 2/25/2016.
 */
public class Home_Listcar_Frag extends Fragment {

    private ListView listViewContact;
    private RFAdapterListCarHome adapterContact;
    private ArrayList<CarListHome> arrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home_listcar_frag_layout, container, false);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        arrayList =  RFApi.getContact();
        listViewContact = (ListView)v.findViewById(R.id.listViewContact);
        adapterContact = new RFAdapterListCarHome(getActivity(), R.layout.car_list_item, arrayList);
        listViewContact.setAdapter(adapterContact);

        return v;
    }
}
