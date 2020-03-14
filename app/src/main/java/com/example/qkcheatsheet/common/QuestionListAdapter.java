package com.example.qkcheatsheet.common;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qkcheatsheet.R;
import com.example.qkcheatsheet.model.QuestionModel;

import java.util.ArrayList;

public class QuestionListAdapter extends RecyclerView.Adapter<QuestionListViewHolder> {

    private final ArrayList<QuestionModel> items;
    private final Context context;

    public QuestionListAdapter(final ArrayList<QuestionModel> items, final Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public QuestionListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(context).inflate(R.layout.item_question, viewGroup, false);
        return new QuestionListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionListViewHolder questionListViewHolder, int position) {
        QuestionModel currentQuestion = items.get(position);

        questionListViewHolder.question.setText(currentQuestion.getQuestion());
        questionListViewHolder.answer.setText(currentQuestion.getAnswer());
        questionListViewHolder.image.setImageResource(currentQuestion.getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
