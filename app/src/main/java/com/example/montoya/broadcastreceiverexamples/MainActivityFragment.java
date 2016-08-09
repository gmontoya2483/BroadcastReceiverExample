package com.example.montoya.broadcastreceiverexamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    private Button mSendBroadcast;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_main, container, false);

        mSendBroadcast=(Button) rootView.findViewById(R.id.btn_SendBroadcast);


        mSendBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent();
                intent.setAction("com.example.montoya.custombroadcast");
                getActivity().sendBroadcast(intent);

            }
        });



        return rootView;

    }
}
