package com.example.remedial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

import com.example.remedial.Adaptador.Adaptadorcito;
import com.example.remedial.Modelos.Opciones;
import com.example.remedial.Modelos.Permisos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView re;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Permisos> Permisitos = new ArrayList<>();

        Permisitos.add(new Permisos("LLAMAR", Manifest.permission.CALL_PHONE));

        re = findViewById(R.id.recyclerid);

        List<Opciones> Opcioncitas = new ArrayList<>();

        Opcioncitas.add(new Opciones("LLAMAR", new Intent(Intent.ACTION_CALL,
                Uri.parse("tel: 8714122825")),R.drawable.luna2));
        Opcioncitas.add(new Opciones("CAMARA",new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA),R.drawable.luna3));
        //Opcioncitas.add(new Opciones("DIALER",new Intent()))

        verificarPermisos(Permisitos);


        Adaptadorcito ad = new Adaptadorcito(Opcioncitas);
        re.setAdapter(ad);
        re.setHasFixedSize(true);
        LinearLayoutManager lr = new LinearLayoutManager(this);
        re.setLayoutManager(lr);
    }

    private void verificarPermisos(List<Permisos> permisitos) {
        String [] PermisosDenegados = new String[2];
        for(int i =0; i<permisitos.size();i++)
        {
            if(ContextCompat.checkSelfPermission(this,permisitos.get(i)
                    .getNombreNoR())== PackageManager.PERMISSION_DENIED);
            {
                PermisosDenegados[i]=permisitos.get(i).getNombreReal();
            }
        }
        requestPermissions(PermisosDenegados,300);
    }

}