package com.xavi.examen_pmdm_t1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.xavi.examen_pmdm_t1.entidad.Camaras;
import com.xavi.examen_pmdm_t1.recurso.PedirXml;
import com.xavi.examen_pmdm_t1.recurso.PintarWebView;

/**
 * @author Xavier Robles
 */
public class MainActivity extends AppCompatActivity implements PedirXml.ActualizacionDatos {
    WebView web_html;
    Button solicitar;
    TextView titulo;
    MainActivity context = this;
    private ProgressBar miprogress;
    private ObjectAnimator anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web_html = findViewById(R.id.wb_view);
        solicitar = findViewById(R.id.bnt_solicitar);
        titulo = findViewById(R.id.tv_camaras_title);
        miprogress = (ProgressBar) findViewById(R.id.circularProgress);
        solicitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PedirXml.pedirCamaras(context);
                anim = ObjectAnimator.ofInt(miprogress, "progress", 0, 100);
                miprogress.setVisibility(View.VISIBLE);
                mostrarProgress();
            }
        });
    }

    @Override
    public void llamarCamaras(Camaras c) {
        String html = PintarWebView.crearTabla(c);
        web_html.loadData(html, "text/html", "UTF-8");
        Log.d("Respueta", html);
        Log.d("Respueta", "html");
        miprogress.setVisibility(View.INVISIBLE);
    }

    private void mostrarProgress() {
        anim.setDuration(20000);
        anim.setInterpolator(new DecelerateInterpolator());
        anim.start();
    }
}