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

public class HomePage extends ActionBarActivity  {
    Button NewGameB;
    Button InstructB;
    Button HSB;
    Button AboutB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        NewGameB=(Button)findViewById(R.id.button); //Bring your XML button inside java
        NewGameB.setOnClickListener(new ButtonHandler());
        InstructB=(Button)findViewById(R.id.button2);
        InstructB.setOnClickListener(new ButtonHandler());
        HSB=(Button)findViewById(R.id.button3);
        HSB.setOnClickListener(new ButtonHandler());
        AboutB=(Button)findViewById(R.id.button4);
        AboutB.setOnClickListener(new ButtonHandler());


    }


    class ButtonHandler implements OnClickListener {
        @Override


        public void onClick(View v) {

            if (v.getId()==R.id.button)
            {
                Log.d("Pam","New Game");
                Intent myIntent = new Intent(HomePage.this, NewGame.class);
                HomePage.this.startActivity(myIntent);
            }
            if (v.getId() == R.id.button2)
            {
                Log.d("Pam", "Instructions");
                Intent myIntent = new Intent(HomePage.this, Instructions.class);
                HomePage.this.startActivity(myIntent);
            }
            if (v.getId() == R.id.button3)
            {
                Log.d("Pam", "High Scores");
                Intent myIntent = new Intent(HomePage.this, HighScores.class);
                HomePage.this.startActivity(myIntent);
            }
            if (v.getId() == R.id.button4)
            {
                Log.d("Pam", "About");
                Intent myIntent = new Intent(HomePage.this, About.class);
                HomePage.this.startActivity(myIntent);
            }

        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_page, menu);
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
