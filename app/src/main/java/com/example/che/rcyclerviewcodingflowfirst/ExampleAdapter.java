package com.example.che.rcyclerviewcodingflowfirst;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleviewHolder> {
    private ArrayList<ExampleIetm> mExampleList;


    public ExampleAdapter(ArrayList<ExampleIetm> exampleList) {
        mExampleList = exampleList;
    }

    @NonNull
    @Override
    public ExampleviewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleviewHolder evh = new ExampleviewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleviewHolder holder, int position) {
        ExampleIetm currentItem = mExampleList.get(position);

        holder.mImageView.setImageResource(currentItem.getmImageResource());
        holder.mTextView1.setText(currentItem.getmText1());
        holder.mTextView2.setText(currentItem.getmText2());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public static class ExampleviewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;


        public ExampleviewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textSmall);
        }
    }
}
