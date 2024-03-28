package com.example.mentalhealthscreening;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.imageview.ShapeableImageView;


public class HomeFragment extends Fragment {

    ShapeableImageView depression;
    ShapeableImageView anxiety;
    ShapeableImageView ocd;
    ShapeableImageView ptsd;
    ShapeableImageView insomnia;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        depression = view.findViewById(R.id.depression);
        depression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), depression_q1.class);
                startActivity(intent);
            }
        });

        anxiety = view.findViewById(R.id.boxthreeimagee);
        anxiety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), anxiety_q1.class);
                startActivity(intent);
            }
        });

        ocd = view.findViewById(R.id.ocdimagee);
        ocd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ocd_q1.class);
                startActivity(intent);
            }
        });

        ptsd = view.findViewById(R.id.ptsdimage);
        ptsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ptsd_q1.class);
                startActivity(intent);
            }
        });

        insomnia = view.findViewById(R.id.insomniaimg);
        insomnia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), insomnia_q1.class);
                startActivity(intent);
            }
        });

        return view;
    }
}