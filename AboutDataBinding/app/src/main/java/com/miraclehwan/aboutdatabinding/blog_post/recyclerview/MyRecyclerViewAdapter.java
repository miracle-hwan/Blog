package com.miraclehwan.aboutdatabinding.blog_post.recyclerview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miraclehwan.aboutdatabinding.databinding.ItemRecyclerviewBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miraclehwan on 2018-07-08.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    Context context;
    List<String> datas;

    public MyRecyclerViewAdapter(Context context, List<String> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position % 2 == 0){
            ((MyViewHolder) holder).binding.itemRecyclerViewTextView.setText(datas.get(position) + " 바인딩으로 수정");
        }else{
            ((MyViewHolder) holder).binding.itemRecyclerViewTextView.setText(datas.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ItemRecyclerviewBinding binding;

        public MyViewHolder(ItemRecyclerviewBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
