package com.example.totoros.pegapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button infoButton;
    private Button listButton;
    private Button mapButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        infoButton = (Button)rootView.findViewById(R.id.infoButton);
        listButton = (Button)rootView.findViewById(R.id.listButton);
        mapButton = (Button)rootView.findViewById(R.id.mapButton);


        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InfoFragment infoFragment = new InfoFragment();
                getFragmentManager().beginTransaction().replace(R.id.fragment, infoFragment).commit();
            }
        });

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListFragment listFragment = new ListFragment();
                getFragmentManager().beginTransaction().replace(R.id.fragment, listFragment).commit();
            }
        });

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mapfragment mapfragment = new Mapfragment();
                getFragmentManager().beginTransaction().replace(R.id.fragment, mapfragment).commit();
            }
        });


        return rootView;
    }

}
