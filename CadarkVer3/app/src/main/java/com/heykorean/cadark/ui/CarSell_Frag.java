package com.heykorean.cadark.ui;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.heykorean.cadark.R;
import com.heykorean.cadark.adapter.PostCarAdapter;
import com.heykorean.cadark.adapter.RFAdapterListCarHome;
import com.heykorean.cadark.api_retrofit.RFApi;
import com.heykorean.cadark.models.CarListHome;

import java.util.ArrayList;

/**
 * Created by Hey.Hung on 2/25/2016.
 */
public class CarSell_Frag extends Fragment implements AdapterView.OnItemClickListener{

    private ListView listViewContact;
    private PostCarAdapter adapterContact;
    private ArrayList<CarListHome> arrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.carsell_frag_layout, container, false);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        arrayList =  RFApi.getContact();
        listViewContact = (ListView)v.findViewById(R.id.listViewSell);
        adapterContact = new PostCarAdapter(getActivity(), R.layout.car_post_item, arrayList);
        listViewContact.setOnItemClickListener(this);
        listViewContact.setAdapter(adapterContact);

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), "OK", Toast.LENGTH_SHORT).show();
    }
}

