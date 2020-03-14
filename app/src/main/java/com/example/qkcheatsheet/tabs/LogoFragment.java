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
public class LogoFragment extends Fragment {

    RecyclerView list;

    public LogoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_logo, container, false);
        /*
         * for activity version:
         * setContentView(R.layout.activity_logo);
         * */
        list = rootView.findViewById(R.id.logo_recycler_view);
        list.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        ArrayList<QuestionModel> items = new ArrayList<>(5);
        items.add(new QuestionModel("Mustang", "Wild Horse", R.drawable.mustang));
        final QuestionListAdapter adapter = new QuestionListAdapter(items, getActivity());
        list.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

}
