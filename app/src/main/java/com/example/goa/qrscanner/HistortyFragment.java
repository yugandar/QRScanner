package com.example.goa.qrscanner;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class HistortyFragment extends Fragment {
    public HistortyFragment() {
    }

    public static Fragment newInstance() {
        HistortyFragment myfragment = new HistortyFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);

        return myfragment;
    }
    public void onscannerclick(View view) {
         Intent intent = new Intent(getActivity(), ScannerActivity.class);
        startActivity(intent);

    }
}
