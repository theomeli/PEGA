package com.example.totoros.pegapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {

    private Button infoBackButton;
    private TextView text;

    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_info, container, false);

        infoBackButton = (Button)rootView.findViewById(R.id.infoBackButton);
        text = (TextView)rootView.findViewById(R.id.info_2nd_paragraph);

        text.setMovementMethod(new ScrollingMovementMethod());

        infoBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityFragment mainFragment = new MainActivityFragment();
                getFragmentManager().beginTransaction().replace(R.id.fragment, mainFragment).commit();
            }
        });

        return rootView;
    }
}
