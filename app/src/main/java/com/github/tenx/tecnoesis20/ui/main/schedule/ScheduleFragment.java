package com.github.tenx.tecnoesis20.ui.main.schedule;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.tenx.tecnoesis20.R;

import java.util.ArrayList;
import java.util.List;

public class ScheduleFragment extends Fragment {

    private RecyclerView myrecyclerView;
    View v;
    private List<Day> lstContact;



    public  ScheduleFragment() {

    }
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstContact =new ArrayList<>();
      lstContact.add(new Day("razmataz","gallery","day1","10 AM"));
        lstContact.add(new Day("razmataz","gallery","day1","10 AM"));
        lstContact.add(new Day("razmataz","gallery","day1","10 AM"));
        lstContact.add(new Day("razmataz","gallery","day1","10 AM"));
        lstContact.add(new Day("razmataz","gallery","day1","10 AM"));
        lstContact.add(new Day("razmataz","gallery","day1","10 AM"));
        lstContact.add(new Day("razmataz","gallery","day1","10 AM"));
        lstContact.add(new Day("razmataz","gallery","day1","10 AM"));
        lstContact.add(new Day("razmataz","gallery","day1","10 AM"));
        lstContact.add(new Day("razmataz","gallery","day1","10 AM"));



    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_schedule, container, false);
        myrecyclerView=(RecyclerView)v.findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(adapter);
        return v;
    }
}
