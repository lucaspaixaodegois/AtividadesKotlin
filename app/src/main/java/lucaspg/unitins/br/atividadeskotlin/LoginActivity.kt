package lucaspg.unitins.br.atividadeskotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btlogin = findViewById<Button>(R.id.btLogin)
        btlogin.setOnClickListener { Logar() }

        var btLimpar = findViewById<Button>(R.id.btnLimpar)
        btLimpar.setOnClickListener { Limpar() }
    }

    fun Logar() {

        var tLogin = findViewById<EditText>(R.id.editTextLogin)
        var tSenha = findViewById<EditText>(R.id.tSenha)


        var login = tLogin.text.toString()
        var senha = tSenha.text.toString()

        if ("admin".equals(login) && "123".equals(senha)) {
            alert("Bem Vindo, Acesso Realizado com Sucesso")
        }
        if ("02995812170".equals(login) && "123".equals(senha)) {
            alert("Bem Vindo, Acesso Realizado com Sucesso")
        }
        if ("a".equals(login) && "a".equals(senha)) {
            alert("Bem Vindo, Acesso Realizado com Sucesso")
        }
        else {
            alert("Login e Senha Incorretos")
        }
    }

    fun Limpar() {

        editTextLogin.setText("")
        tSenha.setText("")
        editTextLogin.requestFocus()
    }

    fun alert(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
}