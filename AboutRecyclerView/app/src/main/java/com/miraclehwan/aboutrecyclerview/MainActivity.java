package com.miraclehwan.aboutrecyclerview;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.miraclehwan.aboutrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    List<MyData> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        datas.add(new MyData("ViewType 0 - 첫번째", 0));
        datas.add(new MyData("ViewType 1 - 첫번째", 1));
        datas.add(new MyData("ViewType 0 - 두번째", 0));
        datas.add(new MyData("ViewType 1 - 두번째", 1));
        datas.add(new MyData("ViewType 0 - 세번째", 0));
        datas.add(new MyData("ViewType 0 - 네번째", 0));
        datas.add(new MyData("ViewType 1 - 세번째", 1));
        datas.add(new MyData("ViewType 1 - 네번째", 1));
        datas.add(new MyData("ViewType 1 - 다섯번째", 1));
        datas.add(new MyData("ViewType 0 - 다섯번째", 0));

        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(this, datas);

        binding.mainRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        //구분선추가
        binding.mainRecyclerview.addItemDecoration(new SimpleDividerItemDecoration(this));
        binding.mainRecyclerview.setAdapter(adapter);
    }
}
