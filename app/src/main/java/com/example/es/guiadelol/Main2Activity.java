package com.example.es.guiadelol;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;



public class Main2Activity extends AppCompatActivity {

    final String TAG=this.getClass().getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
    public void iraatrox(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","aatrox");
        startActivity(o);
    }
    public void irahri(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","ahri");
        startActivity(o);
    }
    public void irakali(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","akali");
        startActivity(o);
    }

    public void iralistar(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","alistar");
        startActivity(o);
    }
    public void iramumu(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","amumu");
        startActivity(o);
    }
    public void iranivia(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","anivia");
        startActivity(o);
    }
    public void irannie(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","annie");
        startActivity(o);
    }
    public void irashe(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","ashe");
        startActivity(o);
    }
    public void iraurelionsol(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","aurelionsol");
        startActivity(o);
    }
    public void irazir(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","azir");
        startActivity(o);
    }
    public void irbardo(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","bardo");
        startActivity(o);
    }
    public void irblitzcrank(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","blitzcrank");
        startActivity(o);
    }
    public void irbrand(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","brand");
        startActivity(o);
    }
    public void irbraum(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","braum");
        startActivity(o);
    }
    public void ircaitlyn(View v)
    {
        Intent o=new Intent(getApplication(),Main23Activity.class);
        o.putExtra("valor","caitlyn");
        startActivity(o);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_camp, menu);
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
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);

        }else{
            if(id==R.id.action_settings2)
            {
                return true;
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
        Toast.makeText(Main2Activity.this, "Presione nuevamente para salir", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                tw=false;
                Log.d(TAG,"tw:"+tw);
            }
        },3000);
    }

}
