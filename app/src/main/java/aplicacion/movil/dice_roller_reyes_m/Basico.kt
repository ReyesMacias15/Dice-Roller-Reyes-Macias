package aplicacion.movil.dice_roller_reyes_m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Basico : AppCompatActivity() {
    var txt: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basico)
        txt= findViewById<EditText>(R.id.editTextNumber)
    }
    fun Crear(view: View) {
        var Lado:String=txt?.text.toString()
        val intent = Intent(this, Basico2::class.java)
        val valor=Lado?.toInt()
        val myFirstDice = valor?.let { Dice(it) }
        val data=myFirstDice?.roll().toString()
        // start your next activity
        startActivity(intent.putExtra("lads",Lado))
        startActivity(intent.putExtra("valor",data))

    }
    fun Regre(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
    class Dice (val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}