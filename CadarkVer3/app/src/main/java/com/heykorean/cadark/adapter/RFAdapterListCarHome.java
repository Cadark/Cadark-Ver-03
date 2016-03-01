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
import com.heykorean.cadark.models.CarListHome;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * Created by SonNV1368 on 10/22/15.
 */
public class RFAdapterListCarHome extends ArrayAdapter<CarListHome>{
    private ArrayList<CarListHome> arrayContact;
    private LayoutInflater inflater;


    public RFAdapterListCarHome(Context context, int resource, ArrayList<CarListHome> objects) {
        super(context, resource, objects);

        this.arrayContact = objects;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();

            convertView = inflater.inflate(R.layout.car_list_item, null);

            holder.carName = (TextView)convertView.findViewById(R.id.nameItemTv);
            holder.carImage = (ImageView)convertView.findViewById(R.id.carImgCover);
            holder.numBid = (TextView)convertView.findViewById(R.id.numBidItemTv);
            holder.avarImage = (ImageView)convertView.findViewById(R.id.avarItemImg);
            holder.topPricce = (TextView)convertView.findViewById(R.id.priceItemTv);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }

        CarListHome carListHome = arrayContact.get(position);
        holder.carName.setText(carListHome.getCarName());
        //holder.carImage.setImageURI(Uri.parse(carListHome.getImageCar()));
        Picasso.with(holder.carImage.getContext()).load(carListHome.getImageCar()).into(holder.carImage);
        holder.numBid.setText(carListHome.getNumBid());
        //holder.avarImage.setImageURI(Uri.parse(carListHome.getImageAvar()));
        //Picasso.with(holder.avarImage.getContext()).load(carListHome.getImageAvar()).into(holder.avarImage);
        holder.topPricce.setText(carListHome.getTopPrice());

        return convertView;
    }

    public class ViewHolder{
        public TextView carName;
        public ImageView carImage;
        public TextView numBid;
        public ImageView avarImage;
        public TextView topPricce;
    }
}
