package aplicacion.movil.dice_roller_reyes_m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Con_Boton : AppCompatActivity() {
    var btn1: Button? = null
    var txt: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_con_boton)
        txt= findViewById<EditText>(R.id.textView)
        btn1 = findViewById<Button>(R.id.button)
    }

    fun Regre(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
    fun Crear(view: View) {
        val myFirstDice = Dice(6)

        txt?.setText(myFirstDice.roll().toString())
        val textViewValue = txt?.text

        //convert to String and set it as text inside the textview
    }

}



class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}