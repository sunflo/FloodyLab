package flo.zues.com.floodylab;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;
import butterknife.OnClick;
import flo.zues.com.floodylab.module.animation.ui.AnimationActivity;
import flo.zues.com.floodylab.module.brvah.ui.BrvahActivity;
import flo.zues.com.floodylab.ui.CanvasActivity;
import flo.zues.com.floodylab.ui.RetrofitActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.btn_retrofit, R.id.btn_view, R.id.btn_brvah, R.id.btn_animation})
    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i;
        switch (id) {
            case R.id.btn_retrofit:
                i = new Intent(MainActivity.this, RetrofitActivity.class);
                startActivity(i);
                break;

            case R.id.btn_view:
                i = new Intent(MainActivity.this, CanvasActivity.class);
                startActivity(i);
                break;

            case R.id.btn_brvah:
                i = new Intent(MainActivity.this, BrvahActivity.class);
                startActivity(i);
                break;
            case R.id.btn_animation:
                i = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(i);
                break;

        }

    }
}
