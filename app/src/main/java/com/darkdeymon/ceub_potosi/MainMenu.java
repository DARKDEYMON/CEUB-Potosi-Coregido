package com.darkdeymon.ceub_potosi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.darkdeymon.ceub_potosi.Fragments.FragmentMain;
import com.darkdeymon.ceub_potosi.Fragments.FragmentMapsBancos;
import com.darkdeymon.ceub_potosi.Fragments.FragmentMapsCentroSalud;
import com.darkdeymon.ceub_potosi.Fragments.FragmentMapsEntretenimiento;
import com.darkdeymon.ceub_potosi.Fragments.FragmentMapsHoteles;
import com.darkdeymon.ceub_potosi.Fragments.FragmentMapsLugaresEvento;
import com.darkdeymon.ceub_potosi.Fragments.FragmentMapsRestaurantes;
import com.darkdeymon.ceub_potosi.Fragments.FragmentMapsTurismo;
import com.darkdeymon.ceub_potosi.R;

public class MainMenu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        if(null== savedInstanceState){
            Intent i = new Intent(MainMenu.this,MainActivityPresentation.class);
            startActivity(i);
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, new FragmentMain()).commit();
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
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
    */
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        //si esta seleccionado retornar
        if(item.isChecked())
            return true;
        int id = item.getItemId();
        if(id == R.id.home){
            //pop inclusive quita el boton retroceser
            FragmentManager fr = getSupportFragmentManager();
            fr.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            fr.beginTransaction().replace(R.id.contenedor, new FragmentMain()).commit();
        } else if (id == R.id.hoteles) {
            FragmentManager fr = getSupportFragmentManager();
            fr.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            fr.beginTransaction().replace(R.id.contenedor, new FragmentMapsHoteles()).commit();
        } else if (id == R.id.restaurantes) {
            FragmentManager fr = getSupportFragmentManager();
            fr.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            fr.beginTransaction().replace(R.id.contenedor, new FragmentMapsRestaurantes()).commit();
        } else if (id == R.id.salud) {
            FragmentManager fr = getSupportFragmentManager();
            fr.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            fr.beginTransaction().replace(R.id.contenedor, new FragmentMapsCentroSalud()).commit();
        } else if (id == R.id.finacieras) {
            FragmentManager fr = getSupportFragmentManager();
            fr.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            fr.beginTransaction().replace(R.id.contenedor, new FragmentMapsBancos()).commit();
        } else if (id == R.id.turismo) {
            FragmentManager fr = getSupportFragmentManager();
            fr.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            fr.beginTransaction().replace(R.id.contenedor, new FragmentMapsTurismo()).commit();
        } else if (id == R.id.entretenimiento) {
            FragmentManager fr = getSupportFragmentManager();
            fr.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            fr.beginTransaction().replace(R.id.contenedor, new FragmentMapsEntretenimiento()).commit();
        } else if (id == R.id.lugaresevento) {
            FragmentManager fr = getSupportFragmentManager();
            fr.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            fr.beginTransaction().replace(R.id.contenedor, new FragmentMapsLugaresEvento()).commit();
        } else if (id == R.id.programa) {
            Intent i = new Intent(MainMenu.this,ProgramaInaguracionActivity.class);
            startActivity(i);
        } else if (id == R.id.cronograma){
            Intent i = new Intent(MainMenu.this,CronogramaActivity.class);
            startActivity(i);
        }
        return true;
    }
}
