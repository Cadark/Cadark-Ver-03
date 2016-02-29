package com.heykorean.cadark.models;


import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.heykorean.cadark.R;
import com.heykorean.cadark.others.RoundImage;


public class Carlist_Adapter extends BaseAdapter {

    Context context;
    List<Carlist_Item> rowItem;
    private LayoutInflater inflater;

    RoundImage roundImage;

    public Carlist_Adapter(Context context, List<Carlist_Item> rowItem) {
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
        this.rowItem = rowItem;
    }

    @Override
    public int getCount() {

        return rowItem.size();
    }

    @Override
    public Object getItem(int position) {

        return rowItem.get(position);
    }

    @Override
    public long getItemId(int position) {

        return rowItem.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        ViewHolder holder;

        if (itemView == null) {
            itemView = inflater.inflate(R.layout.car_list_item, null);
            holder = new ViewHolder();

            holder.imgCar = (ImageView) itemView.findViewById(R.id.carImgCover);
            holder.titleCar = (TextView) itemView.findViewById(R.id.nameItemTv);
            holder.timeBid = (TextView) itemView.findViewById(R.id.numBidItemTv);
            holder.imgAvar = (ImageView) itemView.findViewById(R.id.avarItemImg);
            holder.topPrice = (TextView) itemView.findViewById(R.id.priceItemTv);

            itemView.setTag(holder);
        }
        else {
            holder = (ViewHolder)itemView.getTag();
        }

        Carlist_Item row_pos = rowItem.get(position);
        // setting the image resource and title

        //setting round image
        Bitmap bm = BitmapFactory.decodeResource(context.getResources(), row_pos.getImgAvarItem());
        roundImage = new RoundImage(bm);
        holder.imgAvar.setImageDrawable(roundImage);
        //end round image

        holder.titleCar.setText(row_pos.getNameCarItem());
        holder.imgCar.setImageResource(row_pos.getImgCarItem());
        holder.timeBid.setText(row_pos.getNumBidItem());
        holder.topPrice.setText(row_pos.getPriceCarItem());

        return itemView;

    }

    public class ViewHolder{
        public ImageView imgCar;
        public TextView titleCar;
        public TextView timeBid;
        public ImageView imgAvar;
        public TextView topPrice;
    }
}

