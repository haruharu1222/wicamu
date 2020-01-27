package com.example.wicamu_main.ui.wicamu;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.wicamu_main.R;


public class WicamuFragment extends Fragment {
    private WicamuViewModel wicamuViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wicamuViewModel =
                ViewModelProviders.of(this).get(WicamuViewModel.class);
        View root = inflater.inflate(R.layout.fragment_wicamu, container, false);
        final TextView textView = root.findViewById(R.id.text_wicamu);
        wicamuViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}


