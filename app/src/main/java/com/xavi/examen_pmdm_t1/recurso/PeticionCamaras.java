package com.xavi.examen_pmdm_t1.recurso;

import com.xavi.examen_pmdm_t1.entidad.Camaras;

import retrofit2.Call;
import retrofit2.http.GET;
//http://www.mc30.es/components/com_hotspots/datos/camaras.xml
public interface PeticionCamaras {
    @GET("components/com_hotspots/datos/camaras.xml")
    Call<Camaras> pedirCamaras();

}
