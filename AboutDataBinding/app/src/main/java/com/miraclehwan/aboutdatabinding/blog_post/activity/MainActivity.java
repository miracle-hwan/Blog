package com.miraclehwan.aboutdatabinding.blog_post.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.miraclehwan.aboutdatabinding.R;
import com.miraclehwan.aboutdatabinding.blog_post.fragment.MyFragment;
import com.miraclehwan.aboutdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.textView.setText("바인딩 성공!!!");
    }
}
