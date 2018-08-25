package com.miraclehwan.aboutrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miraclehwan.aboutrecyclerview.databinding.ItemABinding;
import com.miraclehwan.aboutrecyclerview.databinding.ItemBBinding;

import java.util.List;

/**
 * Created by miraclehwan on 2018-07-13.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<MyData> datas;

    public MyRecyclerViewAdapter(Context context, List<MyData> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public int getItemViewType(int position) {
        if (datas.get(position).viewType == 0){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0){
            return new ViewA(ItemABinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }else{
            return new ViewB(ItemBBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (datas.get(position).viewType == 0){
            ((ViewA) holder).bind(position);

//             bind(position)을 호출하지 않고 바로 사용할 때 아래코드 사용
//            ((ViewA) holder).binding.itemATextView.setText(datas.get(position).getText());
        }else{
            ((ViewB) holder).bind(position);
        }
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }



    public class ViewA extends RecyclerView.ViewHolder {

        ItemABinding binding;

        public ViewA(ItemABinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(int posistion){
            binding.itemATextView.setText(datas.get(posistion).getText());
        }
    }

    public class ViewB extends RecyclerView.ViewHolder {

        ItemBBinding binding;

        public ViewB(ItemBBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(int posistion){
            binding.itemBTextView.setText(datas.get(posistion).getText());
        }
    }
}
