package com.xavi.examen_pmdm_t1.entidad;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Posicion {
    @Element(required = false)
    private String Latitud;
    @Element(required = false)
    private String Longitud;

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String latitud) {
        Latitud = latitud;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String longitud) {
        Longitud = longitud;
    }

    @Override
    public String toString() {
        return "Posicion{" +
                "Latitud='" + Latitud + '\'' +
                ", Longitud='" + Longitud + '\'' +
                '}';
    }
}
