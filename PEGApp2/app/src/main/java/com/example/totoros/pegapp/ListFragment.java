package com.example.totoros.pegapp;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private Button listBackButton;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_list, container, false);
        listBackButton = (Button)rootView.findViewById(R.id.listBackButton);

        listBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityFragment mainFragment = new MainActivityFragment();
                getFragmentManager().beginTransaction().replace(R.id.fragment, mainFragment).commit();
            }
        });


        DBHelper dbHelper = new DBHelper(getActivity());

        ArrayList<Instructor> instructors = new ArrayList<>();
        Cursor cur = dbHelper.getReadableDatabase().rawQuery("SELECT * FROM instructors_list", null);

        if (cur.moveToFirst()) {
            do {
                String name = cur.getString(cur.getColumnIndexOrThrow("name"));
                String mail = cur.getString(cur.getColumnIndexOrThrow("mail"));
                int image = Integer.parseInt(getString(cur.getColumnIndexOrThrow("image")));
                Instructor instructor = new Instructor(name, mail, image);
                instructors.add(instructor);
            } while (cur.moveToNext());
        }
        cur.close();
        dbHelper.close();


        ListView lv = (ListView)rootView.findViewById(R.id.listView);
        AdapterInstructor adapter = new AdapterInstructor(getActivity(), instructors);
        lv.setAdapter(adapter);

        return rootView;
    }


}
