package lucaspg.unitins.br.atividadeskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculadora_imc.*

class CalculadoraImcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_imc)

        var btCalcIMC = findViewById(R.id.btnCalcularIMC) as Button
        btCalcIMC.setOnClickListener { CalcularIMC() }

        var btLimpar = findViewById(R.id.btnLimpar) as Button
        btLimpar.setOnClickListener { Limpar() }
    }

    fun CalcularIMC() {

//        var imc  =((R.id.tPeso) / (R.id.tAltura) * (R.id.tAltura))as Float
//
//        if(imc < 19){
//            //abaixo
//
//            msgIMC.setText(imc.toString())
//            alert("Abaixo do peso!")
//        }
//        else if(imc > 32){
//            //obeso
//
//            msgIMC.setText(imc.toString())
//            alert("Acima do peso!")
//            msgIMC.setText(""+imc)
//
//        }
//        else{
//            //ok
//
//            msgIMC.setText(imc.toString())
//            msgIMC.setText(""+imc)
//            alert("PESO OK!")
//        }
    }

    fun Limpar(){

        tAltura.setText("")
        tPeso.setText("")
        tAltura.requestFocus()
    }
    fun alert(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
}