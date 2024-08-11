package com.example.taskrecycler;
import android.content.Context;
import android.view.View;

import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.ArrayList;

public abstract class CardAdapter extends RecyclerView.Adapter< CardAdapter.BookViewHolder> {

      List<Book> books;
     BookClickListener clickListener;

    public CardAdapter(ArrayList<Book> books) {
        this.books=books;
    }



    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.card_cell,null,false);
       BookViewHolder bookViewHolder=new BookViewHolder(v.getContext());
        return bookViewHolder;
    }


    public void onBindViewHolder(@NonNull CardAdapter holder, int position) {

    }


    public void onBindViewHolder(@NonNull CardView holder, int position) {
      Book b=books.get(position);
    }

   

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder{

        public BookViewHolder(@NonNull Context itemView) {
            super(itemView);
        }
    }


}
