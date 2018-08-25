package com.miraclehwan.aboutdatabinding.blog_post.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.miraclehwan.aboutdatabinding.R;
import com.miraclehwan.aboutdatabinding.databinding.ActivityFragmentBinding;
import com.miraclehwan.aboutdatabinding.databinding.ActivityMainBinding;

public class FragmentActivity extends AppCompatActivity {

    ActivityFragmentBinding binding;
    MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fragment);

        myFragment = MyFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, myFragment)
                .commitNow();

        binding.changeFragmentTextViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFragment.binding.textView.setText("액티비티에서 인스턴스를 통한 binding 접근");
            }
        });
    }
}
