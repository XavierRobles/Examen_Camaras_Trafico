package com.xavi.examen_pmdm_t1.recurso;

import com.xavi.examen_pmdm_t1.entidad.Camara;
import com.xavi.examen_pmdm_t1.entidad.Camaras;
import com.xavi.examen_pmdm_t1.entidad.Posicion;

import java.util.List;

public class PintarWebView {

    public static String crearTabla(Camaras camarasHTML) {
        List<Camara> lista = camarasHTML.getLista_camara();
        String html = "<table><tr><th>Latitud</th><th>Longitud</th><th>Foto</th></tr>";
        for (Camara c : lista) {
            html += "<tr><td>" + c.getLista_posiciones().get(0).getLatitud() + "</td><td>"
                    + lista.get(0).getLista_posiciones().get(0).getLongitud() + "</td>" +
                    "<td><img src='http://" + c.getURL() + "' width='200' height='100'></img></td></tr>";
        }
        html = "</table><html><head></head><body>" + html + "</body></html>";
        return html;
    }
}
