package com.rogeruliano.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by uliano.roger on 22/07/2015.
 */
public class BoaViajemActivity extends Activity {

    private EditText usuario;
    private EditText senha;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usuario = (EditText) findViewById(R.id.usuario);
        senha = (EditText) findViewById(R.id.senha);
    }

    public void entrarOnClick(View v) {

        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = senha.getText().toString();

        if ("leitor".equals(usuarioInformado) && "123".equals(senhaInformada)) {
            startActivity(new Intent(this,DashboardActivity.class));
        } else {
            String menssageErro = getString(R.string.erro_autenticacao);
            Toast toast = Toast.makeText(this, menssageErro, Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
