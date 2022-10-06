package aplicacion.movil.dice_roller_reyes_m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Suerte : AppCompatActivity() {
    var btn1: Button? = null
    var txt: TextView? = null
    var mensaje: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suerte)
        txt= findViewById<EditText>(R.id.textView)
        mensaje= findViewById<EditText>(R.id.Mensaje)
        btn1 = findViewById<Button>(R.id.button)
    }

    fun Regre(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
    fun Crear(view: View) {
        var rollResult=0
        val myFirstDice = Random(6)
        txt?.setText(myFirstDice.roll().toString())

        rollResult = myFirstDice.roll()
        txt?.setText(rollResult.toString())
        val luckyNumber = 4
        when (rollResult) {
            luckyNumber -> mensaje?.setText("Ganaste")


            1 -> mensaje?.setText("¡Lo siento mucho! Sacaste un 1. ¡Inténtalo de nuevo!")
            2 -> mensaje?.setText("¡Lo siento mucho! Sacaste un 2. ¡Inténtalo de nuevo!")
            3 -> mensaje?.setText("¡Lo siento mucho! Sacaste un 3. ¡Inténtalo de nuevo!")
            5 -> mensaje?.setText("¡Lo siento mucho! Sacaste un 5. ¡Inténtalo de nuevo!")
            6 -> mensaje?.setText("¡Lo siento mucho! Sacaste un 6. ¡Inténtalo de nuevo!")
        }


        //convert to String and set it as text inside the textview
    }
}
class Random (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}