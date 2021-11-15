package com.example.as_c4_sp_diagrams_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;


import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f,0));
        entries.add(new BarEntry(8f,1));
        entries.add(new BarEntry(6f,2));
        entries.add(new BarEntry(12f,3));
        entries.add(new BarEntry(18f,4));
        entries.add(new BarEntry(9f,5));
        BarDataSet dataSet = new BarDataSet(entries, "");
        ArrayList<String> labels = new ArrayList<>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        BarChart chart = new BarChart(this);
        setContentView(chart);
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        BarData data = new BarData(labels, dataSet);
        chart.setData(data);
        chart.setDescription("Диаграмма");
    }
}