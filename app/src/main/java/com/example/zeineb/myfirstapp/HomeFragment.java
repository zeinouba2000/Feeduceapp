package com.example.zeineb.myfirstapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    private ListView myList;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        String[] values = new String[]{
                "Bonjour",
                "Bienvenue a formalab",
                "Zeineb et Mayssa",
        };
        view = inflater.inflate(R.layout.fragment_home, container, false);

        myList = view.findViewById(R.id.listViewHome);
        ArrayAdapter<String>myadapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,values);
        myList.setAdapter(myadapter);

        return view;

    }

}
