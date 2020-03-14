package com.example.qkcheatsheet.tabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qkcheatsheet.R;
import com.example.qkcheatsheet.common.QuestionListAdapter;
import com.example.qkcheatsheet.model.QuestionModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    RecyclerView list;

    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_food, container, false);
        list = rootView.findViewById(R.id.food_recycler_view);
        list.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        ArrayList<QuestionModel> items = new ArrayList<>(5);
        items.add(new QuestionModel("Mirza Ghasemi", "Guilan", R.drawable.mirza_ghasemi));
        final QuestionListAdapter adapter = new QuestionListAdapter(items, getActivity());
        list.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
