package com.example.test1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.example.test1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MyViewModel myViewModel;
//    关联textview对象，使用activitymainbinding之后都不在需要
//    TextView textView;
//    Button button1,button2;
//    ImageButton imageButton3,imageButton4;

//切换了布局模式才能出现这个类
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //这句不需要，等会儿注释，不注释也不错。
//        setContentView(R.layout.activity_main);
        //替换为后，所有XML的标签，关键词都会成为成员。
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);


//        本activity myviewmodel字节吗
        myViewModel= ViewModelProviders.of(this).get(MyViewModel.class);

        //绑定之后,livedata观察变化
        //databind后也不需要了
//
//        myViewModel.getLikedNum().observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer integer) {
//                binding.textView.setText(String.valueOf(integer));
//            }
//        });

        //这两句可以替代之前的observe方法，在xml中配置好text标签
        binding.setData(myViewModel);
        binding.setLifecycleOwner(this);



//      找所有控件id
//        但如果漏了某个findviewbyid，编译也不会报错，但运行时会闪退
//        textView=findViewById(R.id.textView);
//        button1=findViewById(R.id.button);
//        button2=findViewById(R.id.button2);
//        imageButton3=findViewById(R.id.imageButton3);
//        imageButton4=findViewById(R.id.imageButton4);



//        binding.textView.setText(String.valueOf(myViewModel.number));

//       点击事件实现




//        binding.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myViewModel.number++;
////              在textview位置显示，数字调用相应重载方法，打印必须转字符
//                binding.textView.setText(String.valueOf(myViewModel.number));
//            }
//        });
//        binding.button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myViewModel.number+=2;
//                binding.textView.setText(String.valueOf(myViewModel.number));
//            }
//        });

//        binding.imageButton3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myViewModel.addLikedNum(1);
//
//            }
//        });

//        binding.imageButton4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myViewModel.addLikedNum(-1);
//
//            }
//        });

    }
}
