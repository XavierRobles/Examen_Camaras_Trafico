package com.xavi.examen_pmdm_t1.recurso;

import android.util.Log;

import com.xavi.examen_pmdm_t1.entidad.Camara;
import com.xavi.examen_pmdm_t1.entidad.Camaras;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class PedirXml {
    public static void pedirCamaras(ActualizacionDatos llamante) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.mc30.es/")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        PeticionCamaras service = retrofit.create(PeticionCamaras.class);
        Call<Camaras> llamada = service.pedirCamaras();
        llamada.enqueue(new Callback<Camaras>() {
            @Override
            public void onResponse(Call<Camaras> call, Response<Camaras> response) {
                Camaras c = response.body();
                Log.d("RESPUESTA", c.getLista_camara().toString());
                llamante.llamarCamaras(c);
            }

            @Override
            public void onFailure(Call<Camaras> call, Throwable t) {
                Log.d("RESPUESTA", t.getMessage());
            }
        });
    }

    public interface ActualizacionDatos {
        void llamarCamaras(Camaras c);
    }
}
