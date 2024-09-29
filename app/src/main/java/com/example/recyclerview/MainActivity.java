package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        StateAdapter adapter = new StateAdapter(this, states);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        states.add(new State("Россия", "Москва", R.drawable.flag, "Россия — крупнейшая страна в мире, расположенная в Восточной Европе и Северной Азии."));
        states.add(new State("Германия", "Берлин", R.drawable.flag2, "Германия — страна в Центральной Европе, известная своим культурным наследием и экономической мощью."));
        states.add(new State("Италия", "Рим", R.drawable.flag3, "Италия — страна в Южной Европе, известная своим искусством, историей и кухней."));
    }

}