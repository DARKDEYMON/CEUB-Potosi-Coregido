package com.darkdeymon.darkd.ceub_potos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.google.android.gms.maps.model.LatLng;

public class StacticMethods {

    public static void llevame(Context d, LatLng dat){
        Uri gmmIntentUri = Uri.parse("google.navigation:q="+ dat.latitude +","+dat.longitude);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        d.startActivity(mapIntent);
    }
}
