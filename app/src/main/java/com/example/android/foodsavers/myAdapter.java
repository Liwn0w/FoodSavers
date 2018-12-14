package com.example.android.foodsavers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder>{
        private List<String> myList;     private int rowLayout;    private Context mContext;
        public static Button b1;
        public myAdapter(List<String> myList, int rowLayout, Context context) {
            this.myList = myList;         this.rowLayout = rowLayout;         this.mContext = context;
        }
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
            return new ViewHolder(v);  //this is the major change here.
        }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String entry = myList.get(i);
        viewHolder.myName.setText(entry);
        viewHolder.myName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)v;
                Toast.makeText(mContext,tv.getText(),Toast.LENGTH_SHORT).show();
            }
        });
//        viewHolder.Pic.setImageResource(R.drawable.image1);
    }

    @Override
        public int getItemCount() {
            return myList == null ? 0 : myList.size();
        }
        public static class ViewHolder extends RecyclerView.ViewHolder {
            public TextView myName;
            public ImageView Pic;
            public TextView myNameInfomation;
            public ViewHolder(View itemView) {
                super(itemView);
                Pic = (ImageView) itemView.findViewById(R.id.imageView_test);
                //Pic.setImageResource( R.mipmap.ic_5_round );
                myName = (TextView) itemView.findViewById(R.id.editText);
                myNameInfomation = (TextView) itemView.findViewById(R.id.editText2);
                myName.setFocusable(false);
                myNameInfomation.setFocusable(false);
//                Pic= (ImageView)itemView.findViewById(R.id.picture);
//                b1= itemView.findViewById(R.id.button);
            }
         }

}
