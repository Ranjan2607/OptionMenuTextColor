package com.example.rajivranjan.optionmenutextcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.tv1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_red) {
            tv1.setTextColor(Color.RED);

            return true;
        }

        if (id == R.id.action_green) {
            tv1.setTextColor(Color.GREEN);

            return true;
        }

        if (id == R.id.action_blue) {
            tv1.setTextColor(Color.BLUE);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
