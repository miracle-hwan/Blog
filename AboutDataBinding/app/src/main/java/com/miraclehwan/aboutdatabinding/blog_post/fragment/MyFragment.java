package com.miraclehwan.aboutdatabinding.blog_post.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miraclehwan.aboutdatabinding.R;
import com.miraclehwan.aboutdatabinding.databinding.FragmentMainBinding;

/**
 * Created by miraclehwan on 2018-07-08.
 */

public class MyFragment extends Fragment {

    FragmentMainBinding binding;

    public static MyFragment newInstance() {
        
        Bundle args = new Bundle();
        
        MyFragment fragment = new MyFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        
        binding.textView.setText("프래그먼트 바인딩 성공!!!");
        return binding.getRoot();
    }

    /*
     *  만약 onCreateView가 아닌 onViewCreated에서 데이터바인딩을 사용하신다면 아래 주석 부분을 사용하면 됩니다.
     */
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        binding = DataBindingUtil.bind(view);
//        binding.textView.setText("프래그먼트 바인딩 성공!!!");
//    }
}
