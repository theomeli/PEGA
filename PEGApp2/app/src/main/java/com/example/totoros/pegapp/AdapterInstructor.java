package com.example.totoros.pegapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by totoros on 13/10/2015.
 */
public class AdapterInstructor extends BaseAdapter{

    ArrayList<Instructor> mInstructors = new ArrayList<Instructor>();
    Context mContext;

    public AdapterInstructor(Context context, ArrayList<Instructor> Instructors){
        mInstructors = Instructors;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mInstructors.size();
    }

    @Override
    public Object getItem(int position) {
        return mInstructors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.item, null);

        ImageView iv = (ImageView)v.findViewById(R.id.imageView);
        TextView tv1 = (TextView)v.findViewById(R.id.textView1);
        TextView tv2 = (TextView)v.findViewById(R.id.textView2);

        tv1.setText(mInstructors.get(position).getName());
        tv2.setText(mInstructors.get(position).getMail());
        iv.setImageResource(mInstructors.get(position).getImage());

        return v;
    }
}
