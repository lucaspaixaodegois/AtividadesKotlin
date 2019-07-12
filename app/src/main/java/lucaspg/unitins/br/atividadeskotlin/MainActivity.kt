package lucaspg.unitins.br.atividadeskotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLoginAtividade = findViewById<Button>(R.id.btnAtividadeLogin)
        btnLoginAtividade.setOnClickListener {
            var intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }
        var btnIMCAtividade = findViewById<Button>(R.id.btnAtividadeIMC)
        btnIMCAtividade.setOnClickListener {
            var intent = Intent(applicationContext, CalculadoraImcActivity::class.java)
            startActivity(intent)
        }
        var btnCalcAtividade = findViewById<Button>(R.id.btnAtividadeCalculadoraNormal)
        btnCalcAtividade.setOnClickListener {
            var intent = Intent(applicationContext, CalculadoraNormalActivity::class.java)
            startActivity(intent)
        }
        var btnJogoDaVelhaAtividade = findViewById<Button>(R.id.btnAtividadeJogoDaVelha)
        btnJogoDaVelhaAtividade.setOnClickListener {
            var intent = Intent(applicationContext, JogoDaVelhaActivity::class.java)
            startActivity(intent)
        }
    }
}