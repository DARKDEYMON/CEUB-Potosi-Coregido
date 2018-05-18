package com.darkdeymon.ceub_potosi.staticDataClases;

import com.darkdeymon.ceub_potosi.clases.CentrosSalud;

import java.util.ArrayList;

public class CentroSaludData {
    private static ArrayList<CentrosSalud> centrSalud = new ArrayList<CentrosSalud>();
    private static boolean llenadoCs = true;

    static public ArrayList<CentrosSalud> getCentroSaludData(){
        if(llenadoCs){
            centrSalud.add(new CentrosSalud(
                    "Cruz roja filial Potosí",
                    "Zona Central",
                    "",
                    -19.585701f,
                    -65.756766f
                    ));
            centrSalud.add(new CentrosSalud("Caja de Salud de Caminos Potosí"," Av Sevilla","2 6231451",-19.580611f, -65.758784f));
            centrSalud.add(new CentrosSalud("Seguro Social Universitario ","calama","2 6224597",-19.581295f,-65.757055f));
            centrSalud.add(new CentrosSalud("Hospital Madre Teresa de Calcuta","zona plan 40 ","6246251",-19.564494f,-65.768532f));
            centrSalud.add(new CentrosSalud("Hospital Boliviano -Cubano San Cristóbal","Zona de San Cristóbal.","62-41478",-19.595264f,-65.744770f));
            centrSalud.add(new CentrosSalud("Hospital Daniel Bracamonte","Zona de Villa Armonía.","62 - 42456",-19.582834f, -65.765738f));

            llenadoCs = false;
        }
        return centrSalud;
    }
}
