package com.example.pro_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class GridViewAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<String> datas;
    public GridViewAdapter(Context mContext, ArrayList<String> datas){
        this.mContext=mContext;
        this.datas=datas;
    }
    @Override
    public int getCount() {
        return datas!=null?datas.size():0;
    }
    @Override
    public Object getItem(int position) {
        return datas!=null?datas.get(position):null;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if (convertView==null){
            //获取ItemView
            convertView = LayoutInflater.from(mContext).inflate(R.layout.t_gridview_item,null);
            //创建ViewHolder
            viewHolder=new ViewHolder();
            //ViewHolder绑定组件
            viewHolder.textView= convertView.findViewById(R.id.tv1);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //设置view组件参数
        viewHolder.textView.setText(datas.get(position));
        return convertView;
    }
    class ViewHolder{
        TextView textView;
    }
}
