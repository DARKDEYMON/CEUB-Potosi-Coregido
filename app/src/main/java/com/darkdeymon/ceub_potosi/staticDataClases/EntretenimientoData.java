package com.darkdeymon.ceub_potosi.staticDataClases;

import com.darkdeymon.ceub_potosi.clases.Entretenimiento;

import java.util.ArrayList;

public class EntretenimientoData {
    private static ArrayList<Entretenimiento> entretenimiento = new ArrayList<Entretenimiento>();
    private static boolean llenadoen = true;

    public static ArrayList<Entretenimiento> getEnttetenimientoData(){
        if(llenadoen){

            entretenimiento.add(new Entretenimiento(
                "Valentinos",
                "Calle Eduardo Pérez",
                "Discoteca Karaoke",
                -19.579976f,
                -65.767188f
            ));
            entretenimiento.add(new Entretenimiento("Blackmon","Plazuela Tumusla","Discoteca",1231321f,1231231f));
            entretenimiento.add(new Entretenimiento("Killa","Av. Universitaria","Karaoke Discoteca",-19.577764f,-65.76585f));
            entretenimiento.add(new Entretenimiento("Venus","Av. Universitaria","Karaoke Discoteca",-19.583606f,-65.759285f));
            entretenimiento.add(new Entretenimiento("Alternatico","Av. Arce","Karaoke Discoteca",-19.580501f,-65.755586f));
            entretenimiento.add(new Entretenimiento("el encanto","chayanta","Karaoke Discoteca",-19.586458f,-65.755183f));
            entretenimiento.add(new Entretenimiento("valentinos","italia","Karaoke Discoteca",-19.580019f,-65.767261f));
            entretenimiento.add(new Entretenimiento("babel","murillo","Karaoke Discoteca",-19.576723f,-65.765448f));
            entretenimiento.add(new Entretenimiento("abnesia","italia","Karaoke Discoteca",-19.580657f,-65.766198f));
            entretenimiento.add(new Entretenimiento("babilon","saavedra","Discoteca",-19.572967f,-65.759191f));

            llenadoen = false;
        }
        return entretenimiento;
    }
}
