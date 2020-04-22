package com.example.mymail2;


import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyMailItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    List<MyMailItemModel> items;

    public MyMailItemAdapter(List<MyMailItemModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);
        return new MyMailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyMailViewHolder viewHolder =(MyMailViewHolder) holder;
        MyMailItemModel item = items.get(position);

        viewHolder.textLetter.setText(item.getName().substring(0,1));
        Drawable background = viewHolder.textLetter.getBackground();
        background.setColorFilter(new PorterDuffColorFilter(item.getColor(), PorterDuff.Mode.SRC_ATOP));
        viewHolder.textName.setText(item.getName());
        viewHolder.textSubject.setText(item.getSubject());
        viewHolder.textContent.setText(item.getContent());
        viewHolder.textTime.setText(item.getTime());
        if (item.isCheck())
            viewHolder.imageCheck.setImageResource(R.drawable.ic_star_selected);
        else
            viewHolder.imageCheck.setImageResource(R.drawable.ic_star_nonselected);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class MyMailViewHolder extends RecyclerView.ViewHolder{
        TextView textLetter;
        TextView textName;
        TextView textSubject;
        TextView textContent;
        TextView textTime;
        ImageView imageCheck;

        public MyMailViewHolder(@NonNull View itemView) {
            super(itemView);

            textLetter = itemView.findViewById(R.id.round_bg);
            textName = itemView.findViewById(R.id.text_name);
            textSubject = itemView.findViewById(R.id.text_subject);
            textContent = itemView.findViewById(R.id.text_content);
            textTime = itemView.findViewById(R.id.time);
            imageCheck = itemView.findViewById(R.id.imgchk);

            imageCheck.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isCheck = items.get(getAdapterPosition()).isCheck();
                    items.get(getAdapterPosition()).setCheck(!isCheck);
                    notifyDataSetChanged();
                }
            });
        }
    }
}
