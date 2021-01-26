package com.xavi.examen_pmdm_t1.entidad;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(strict = false)
public class Camaras {
    @ElementList(entry = "Camara", inline = true)
    private List<Camara> lista_camara;

    public List<Camara> getLista_camara() {
        return lista_camara;
    }

    public void setLista_camara(List<Camara> lista_camara) {
        this.lista_camara = lista_camara;
    }

    @Override
    public String toString() {
        return "Camaras{" +
                "lista_camara=" + lista_camara +
                '}';
    }
}
