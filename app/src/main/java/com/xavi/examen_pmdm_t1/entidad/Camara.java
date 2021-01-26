package com.xavi.examen_pmdm_t1.entidad;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(strict = false)
public class Camara {
    @ElementList(entry = "Posicion", inline = true)
    private List<Posicion> lista_posiciones;
    @Element(required = false)
    private String URL;

    public List<Posicion> getLista_posiciones() {
        return lista_posiciones;
    }

    public void setLista_posiciones(List<Posicion> lista_posiciones) {
        this.lista_posiciones = lista_posiciones;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Camara{" +
                "lista_posiciones=" + lista_posiciones +
                ", URL='" + URL + '\'' +
                '}';
    }
}
