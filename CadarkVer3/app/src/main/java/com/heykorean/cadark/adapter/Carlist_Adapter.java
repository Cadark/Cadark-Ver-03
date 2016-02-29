package com.heykorean.cadark.adapter;


import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.heykorean.cadark.R;
import com.heykorean.cadark.models.Carlist_Item;
import com.heykorean.cadark.ui.Home_Listcar_Frag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SonNV1368 on 10/22/15.
 */
public class Carlist_Adapter extends ArrayAdapter<Carlist_Item> {

    Context context;
    private ArrayList<Carlist_Item> arrayContact;
    private LayoutInflater inflater;


    public Carlist_Adapter(Context context, int resource, ArrayList<Carlist_Item> rowItem) {
        super(context, resource, rowItem);
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
        this.arrayContact = rowItem;
    }

    public Carlist_Adapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();

            convertView = inflater.inflate(R.layout.car_list_item, null);

            holder.nameCar = (TextView)convertView.findViewById(R.id.nameItemTv);
            holder.imageCar = (ImageView) convertView.findViewById(R.id.carImgCover);
            holder.numBid = (TextView)convertView.findViewById(R.id.numBidItemTv);
            holder.imageAvar = (ImageView) convertView.findViewById(R.id.avarItemImg);
            holder.topPriceCar = (TextView)convertView.findViewById(R.id.priceItemTv);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }

        Carlist_Item contacts = arrayContact.get(position);
        holder.nameCar.setText(contacts.getName_car());
        holder.imageCar.setImageURI(Uri.parse(contacts.getImage_car()));
        holder.numBid.setText(contacts.getNum_bid());
        holder.imageAvar.setImageURI(Uri.parse(contacts.getImage_avar()));
        holder.topPriceCar.setText(contacts.getTop_price_car());

        return convertView;
    }

    public class ViewHolder{
        public TextView nameCar;
        public ImageView imageCar;
        public TextView numBid;
        public ImageView imageAvar;
        public TextView topPriceCar;
    }
}
