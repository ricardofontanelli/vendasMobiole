package com.fiap.vendas;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button botao = (Button)findViewById(R.id.btnPesquisar);
        botao.setOnClickListener(this);
        
        
        
    }

	@Override
	public void onClick(View v) {
		TextView codProduto = (TextView)findViewById(R.id.txtCodigoProduto);
		TextView descricao = (TextView)findViewById(R.id.txtDescricao);
		
		if(codProduto.getText().toString().equals("1")){
			descricao.setText("BRusa");
			Toast.makeText(this, "R$ 10,00", Toast.LENGTH_LONG).show();	
			AlertDialog.Builder b = new AlertDialog.Builder(this);
			b.setTitle("Volte sempre!");
			b.setMessage("Promoção de liquidação na sexta, tá SERTO");
			b.setPositiveButton("OK", null);
			b.show();
		}
		else{
			descricao.setText("CalSa");
			Toast.makeText(this, "R$ 20,00", Toast.LENGTH_LONG).show();				
			AlertDialog.Builder b = new AlertDialog.Builder(this);
			b.setTitle("Volte sempre!");
			b.setMessage("Promoção de liquidação na sexta, tá SERTO");
			b.setPositiveButton("OK", null);
			b.show();
		}
		
	}    
}
