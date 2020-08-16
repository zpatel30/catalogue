package com.example.homepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final String image_title[]= {
            "pic01",
            "pic02",
            "pic03",
            "pic04",
            "pic05",
            "pic06",
            "pic07",
            "pic08",
            "pic09",
            "pic10",
            "pic11",
            "pic12"
    };
    private final int image_id[]= {
            R.drawable.pic01,
            R.drawable.pic02,
            R.drawable.pic03,
            R.drawable.pic04,
            R.drawable.pic05,
            R.drawable.pic06,
            R.drawable.pic07,
            R.drawable.pic08,
            R.drawable.pic09,
            R.drawable.pic10,
            R.drawable.pic11,
            R.drawable.pic12
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Cell> cells = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), cells);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<Cell> prepareData()
    {
        ArrayList<Cell> theimage = new ArrayList<>();
        for(int i=0; i < image_title.length; i++)
        {
            Cell cell = new Cell();
            cell.setTitle(image_title[i]);
            cell.setImg(image_id[i]);
            theimage.add(cell);
        }

        return theimage;
    }

}
