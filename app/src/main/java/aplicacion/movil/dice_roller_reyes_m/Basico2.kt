package aplicacion.movil.dice_roller_reyes_m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Basico2 : AppCompatActivity() {
    var txt: TextView? = null
    var valor: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basico2)
        val obetoIntent: Intent =intent
        txt= findViewById<EditText>(R.id.textView)
        valor= findViewById<EditText>(R.id.textView2)
        var Nombre=obetoIntent.getStringExtra("lads")
        var Valor=obetoIntent.getStringExtra("valor")
        txt?.setText(Nombre.toString())
        valor?.setText(Valor.toString())
    }
    fun Regre(view: View) {
        val intent = Intent(this, Basico::class.java)
        // start your next activity
        startActivity(intent)
    }
}