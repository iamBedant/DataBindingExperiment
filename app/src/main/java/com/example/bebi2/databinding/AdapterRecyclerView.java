package com.example.bebi2.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.adapters.AdapterViewBindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bebi2.databinding.databinding.LayoutRecyclerviewItemBinding;

import java.util.ArrayList;

/**
 * Created by bebi2 on 12/18/2015.
 */
public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    ArrayList<Pojo> mDataset = new ArrayList<Pojo>();
    Context mContext;

    public AdapterRecyclerView(Context context, ArrayList<Pojo> mDataset) {
        this.mContext = context;
        this.mDataset = mDataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutRecyclerviewItemBinding binding = DataBindingUtil.inflate(LayoutInflater
                        .from(parent.getContext()),
                R.layout.layout_recyclerview_item, parent, false);


        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pojo item = mDataset.get(position);
        holder.bindConnection(item);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private LayoutRecyclerviewItemBinding binding;

        public ViewHolder(LayoutRecyclerviewItemBinding _binding) {
            super(_binding.getRoot());
            binding = _binding;
        }

        public void bindConnection(Pojo pojo) {
            binding.setUser(pojo);
        }
    }
}
