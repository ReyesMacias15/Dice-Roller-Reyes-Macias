package aplicacion.movil.dice_roller_reyes_m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Imagen(view: View) {

        val intent = Intent(this, Imagen::class.java)
        // start your next activity
        startActivity(intent)
    }
    fun Condicion(view: View) {
        val intent = Intent(this, Suerte::class.java)
        // start your next activity
        startActivity(intent)

    }
    fun Botones(view: View) {
        val intent = Intent(this, Con_Boton::class.java)
        // start your next activity
        startActivity(intent)
    }
    fun Basico(view: View) {
        val intent = Intent(this, Basico::class.java)
        // start your next activity
        startActivity(intent)
    }
}