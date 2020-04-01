package com.example.pro_gridview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;

import androidx.annotation.Nullable;

public class GridViewActivity extends Activity {
    private Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化上下文
        mContext= GridViewActivity.this;
        //设置gridview
        setContentView(R.layout.t_gridview);
        //获取GridView
        GridView gridView=findViewById(R.id.gv1);
        //创建数据
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i<20;i++){
            list.add("gridView"+i);
        }
        //创建适配器
        GridViewAdapter gridViewAdapter = new GridViewAdapter(mContext,list);
        //GridView设置适配器
        gridView.setAdapter(gridViewAdapter);
    }
}
