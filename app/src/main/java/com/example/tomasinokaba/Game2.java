package com.example.tomasinokaba;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Game2 extends ActionBarActivity  {
    Button Q2A;
    Button Q2B;
    Button Q2C;
    Button Q2D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        Q2A=(Button)findViewById(R.id.button1); //Bring your XML button inside java
        Q2A.setOnClickListener(new ButtonHandler());
        Q2B=(Button)findViewById(R.id.button2);
        Q2B.setOnClickListener(new ButtonHandler());
        Q2C=(Button)findViewById(R.id.button3);
        Q2C.setOnClickListener(new ButtonHandler());
        Q2D=(Button)findViewById(R.id.button4);
        Q2D.setOnClickListener(new ButtonHandler());


    }


    class ButtonHandler implements OnClickListener {
        @Override


        public void onClick(View v) {

            if (v.getId()==R.id.button1)
            {

                Intent myIntent = new Intent(Game2.this, Game3.class);
                Game2.this.startActivity(myIntent);
            }
            if (v.getId() == R.id.button2)
            {

                Intent myIntent = new Intent(Game2.this, Game3.class);
                Game2.this.startActivity(myIntent);
            }
            if (v.getId() == R.id.button3)
            {

                Intent myIntent = new Intent(Game2.this, Game3.class);
                Game2.this.startActivity(myIntent);
            }
            if (v.getId() == R.id.button4)
            {

                Intent myIntent = new Intent(Game2.this, Game3.class);
                Game2.this.startActivity(myIntent);
            }

        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
