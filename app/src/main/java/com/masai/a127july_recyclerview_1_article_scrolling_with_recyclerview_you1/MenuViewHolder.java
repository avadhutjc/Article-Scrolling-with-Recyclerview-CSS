package com.masai.a127july_recyclerview_1_article_scrolling_with_recyclerview_you1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView1;
    private ImageView imageView2;


    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        imageView1 = itemView.findViewById(R.id.ivItem1);
        imageView2 = itemView.findViewById(R.id.ivItem2);
    }

    //setting of data here
    public void setData(Menu menu) {
        imageView1.setImageResource(menu.getImage());
        imageView2.setImageResource(menu.getImage());
    }
}
