package com.example.es.guiadelol;

import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements c1Fragment.OnFragmentInteractionListener,c2Fragment.OnFragmentInteractionListener,c3Fragment.OnFragmentInteractionListener,c4Fragment.OnFragmentInteractionListener {

    final String TAG=this.getClass().getName();
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hecho por: Alvaro Nogales :3", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void irc1(View v)
    {
        c1Fragment fra1=new c1Fragment();
        FragmentTransaction transaction1=getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.contenedor,fra1);
        transaction1.commit();
    }
    public void irc2(View v)
    {
        c2Fragment fra2=new c2Fragment();
        FragmentTransaction transaction2=getSupportFragmentManager().beginTransaction();
        transaction2.replace(R.id.contenedor, fra2);
        transaction2.commit();
    }
    public void irc3(View v)
    {
        c3Fragment fra3=new c3Fragment();
        FragmentTransaction transaction3=getSupportFragmentManager().beginTransaction();
        transaction3.replace(R.id.contenedor, fra3);
        transaction3.commit();
    }
    public void irc4(View v)
    {
        c4Fragment fra3=new c4Fragment();
        FragmentTransaction transaction3=getSupportFragmentManager().beginTransaction();
        transaction3.replace(R.id.contenedor, fra3);
        transaction3.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }else{
            if(id==R.id.action_settings2)
            {
                Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }else{
                if(id==R.id.action_settings3)
                {
                    Intent i=new Intent(getApplicationContext(),Main22Activity.class);
                    startActivity(i);
                }
            }
        }

        return super.onOptionsItemSelected(item);
    }

    boolean tw;
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Log.d(TAG, "click");
        if(tw==true)
        {
            Intent i=new Intent(Intent.ACTION_MAIN);
            i.addCategory(Intent.CATEGORY_HOME);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            System.exit(0);
        }
        tw=true;
        Log.d(TAG,"tw: "+tw);
        Toast.makeText(MainActivity.this, "Presione nuevamente para salir", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                tw=false;
                Log.d(TAG,"tw:"+tw);
            }
        },3000);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
