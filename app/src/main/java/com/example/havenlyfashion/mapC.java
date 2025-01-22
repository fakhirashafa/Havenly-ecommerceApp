package com.example.havenlyfashion;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.Manifest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.havenlyfashion.R;

import org.osmdroid.config.Configuration;
import org.osmdroid.events.MapEventsReceiver;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.MapEventsOverlay;
import org.osmdroid.views.overlay.Marker;

import java.util.ArrayList;

public class mapC extends AppCompatActivity implements MapEventsReceiver {

    private final int REQUEST_PERMISSION_REQUEST_CODE = 1;
    private MapView map = null;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_c);

        Context ctx = getApplicationContext();
        Configuration.getInstance().load(ctx,
                PreferenceManager.getDefaultSharedPreferences(ctx));
        map = (MapView) findViewById(R.id.mapOutletC);
        MapEventsOverlay mapEventsOverlay = new MapEventsOverlay(this,this);
        map.getOverlays().add(0, mapEventsOverlay);
        map.setTileSource(TileSourceFactory.MAPNIK);
        //Permission Checking
        String[] permissionStrings = {Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION};
        requestPermissionsIfNecessary(permissionStrings);

        map.getController().setZoom(5);
        GeoPoint g = new GeoPoint(-6.912804868628957, 107.59174141113208);
        map.getController().setCenter(g);
        Marker outletC = new Marker(map);
        outletC.setPosition(g);
        outletC.setTitle("Outlet C");
        outletC.setSnippet("Jl. Simpang Industri 3-5, Arjuna, Kec. Cicendo, Kota Bandung, Jawa Barat 40172");
        map.getOverlays().add(outletC);
        map.invalidate();
        //End permisson checking


    }
    private void requestPermissionsIfNecessary(String[] permissions){
        ArrayList<String> permissionToRequest = new ArrayList();
        for (String permission:permissions){
            if(ContextCompat.checkSelfPermission(this, permission)
                    != PackageManager.PERMISSION_GRANTED){
                permissionToRequest.add(permission);
            }
        }
        if(permissionToRequest.size() > 0 ){
            ActivityCompat.requestPermissions(this,
                    permissionToRequest.toArray(new String[permissionToRequest.size()]),
                    REQUEST_PERMISSION_REQUEST_CODE);
        }
    }

    @Override
    public boolean singleTapConfirmedHelper(GeoPoint p) {
        return false;
    }

    @Override
    public boolean longPressHelper(GeoPoint p) {
        return false;
    }
}