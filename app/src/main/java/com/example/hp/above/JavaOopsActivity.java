package com.example.hp.above;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JavaOopsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_oops);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void openjava_classes(View view)
    {
        Intent i = new Intent(this, JavaClassesActivity.class);
        startActivity(i);
    }

    public void openjava_constructor(View view)
    {
        Intent i = new Intent(this, JavaConstructorsActivity.class);
        startActivity(i);
    }

    public void openjava_accessModifier(View view)
    {
        Intent i = new Intent(this, JavaAccessmodifierActivity.class);
        startActivity(i);
    }

    public void openjava_inheritance(View view)
    {
        Intent i = new Intent(this, JavaInheritanceActivity.class);
        startActivity(i);
    }

    public void openjava_polymorphism(View view)
    {
        Intent i = new Intent(this, JavaPolymorphismActivity.class);
        startActivity(i);
    }

    public void openjava_package(View view)
    {
        Intent i = new Intent(this, JavaPackageActivity.class);
        startActivity(i);
    }

    public void openjava_abstraction(View view)
    {
        Intent i = new Intent(this, JavaAbstractionActivity.class);
        startActivity(i);
    }

    public void openjava_interface(View view)
    {
        Intent i = new Intent(this, JavaInterfaceActivity.class);
        startActivity(i);
    }
}