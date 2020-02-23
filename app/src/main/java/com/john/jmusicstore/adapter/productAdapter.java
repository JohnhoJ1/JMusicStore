package com.john.jmusicstore.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.john.jmusicstore.R;
import com.john.jmusicstore.model.Product;
import com.john.jmusicstore.url.URL;

import java.util.List;

public class productAdapter extends RecyclerView.Adapter<productAdapter.ItemViewHolder>  {

    Context context;

    List<Product> itemList;
    public productAdapter(Context context, List<Product> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public productAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.product,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productAdapter.ItemViewHolder holder, int position) {
        final Product item=itemList.get(position);
        holder.tvName.setText(item.getName());
        holder.tvDescription.setText(item.getDescription());
        if (item.getDiscount_rate() != 0){
            holder.tvDiscountRate.setText(" -" + item.getDiscount_rate() + "% ");
            double price = item.getPrice();
            double discount_rate = item.getDiscount_rate();
            double new_price = price - ((discount_rate/100) * price);
            holder.tvPrice.setText("Rs." + new_price);
            holder.tvOldPrice.setText("Rs." + item.getPrice());
            holder.tvOldPrice.setPaintFlags(holder.tvOldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        else{
            holder.tvPrice.setText("Rs." + item.getPrice());
        }
        holder.pop_ratingbar.setRating(item.getRating());
        Picasso.get().load(URL.base_url_image+itemList.get(position).getImage()).into(holder.imgImage);

    }

