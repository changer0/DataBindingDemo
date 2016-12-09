package com.example.lulu.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lulu.databindingdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //使用DataBinding的方式载入 在使用DataBinding的形式写完布局文件后会默认形成下面这样的类
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User();
        user.setName("用户名");
        user.setNickName("昵称");
        user.setEmail("example@qq.com");
        user.setVip(true);

        User user1 = new User();
        user1.setName("新用户名");
        user1.setNickName("新昵称");
        user1.setEmail("new@qq.com");
        user1.setVip(false);

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);

        binding.setUsers(list);

    }

}
