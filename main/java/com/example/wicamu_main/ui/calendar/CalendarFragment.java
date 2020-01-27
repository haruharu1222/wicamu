package com.example.wicamu_main.ui.calendar;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import android.view.ViewGroup;


import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.wicamu_main.R;


public class CalendarFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_calendar, container, false);
        final TextView textView = root.findViewById(R.id.text_calendar);
        class main_calendar extends AppCompatActivity {

            private Button prevButton, nextButton;
            private CalendarViewModel mCalendarViewModel;
            private GridView calendarGridView;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.fragment_calendar);


                prevButton = findViewById(R.id.prevButton);
                prevButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mCalendarViewModel.prevMonth();
                        textView.setText(mCalendarViewModel.getTitle());
                    }
                });
                nextButton = findViewById(R.id.nextButton);
                nextButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mCalendarViewModel.nextMonth();
                        textView.setText(mCalendarViewModel.getTitle());
                    }
                });
                calendarGridView = findViewById(R.id.calendarGridView);
                mCalendarViewModel = new CalendarViewModel(this);
                calendarGridView.setAdapter(mCalendarViewModel);
                textView.setText(mCalendarViewModel.getTitle());
            }
        }
        return root;
    }
}