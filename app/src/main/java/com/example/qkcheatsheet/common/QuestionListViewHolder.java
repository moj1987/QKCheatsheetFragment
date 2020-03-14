package com.example.qkcheatsheet.common;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qkcheatsheet.R;

class QuestionListViewHolder extends RecyclerView.ViewHolder {

    final TextView question;
    final TextView answer;
    final ImageView image;

    public QuestionListViewHolder(@NonNull View itemView) {
        super(itemView);

        question = itemView.findViewById(R.id.item_question_name);
        answer = itemView.findViewById(R.id.item_question_answer);
        image = itemView.findViewById(R.id.item_question_image);
    }
}
