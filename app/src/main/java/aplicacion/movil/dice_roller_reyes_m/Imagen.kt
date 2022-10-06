package aplicacion.movil.dice_roller_reyes_m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Imagen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagen)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        // Realiza un lanzamiento al iniciar la aplicación
        rollDice()
    }
    /**
     * Tira los dados y actualiza la pantalla con el resultado.
     */
    private fun rollDice() {
        // Crea un nuevo objeto Dice con 6 lados y tira los dados
        val dice = Lanza(6)
        val diceRoll = dice.roll()
        // Encuentre el ImageView en el diseño
        val diceImage: ImageView = findViewById(R.id.imageView)
        // Determine qué ID de recurso extraíble usar en función de la tirada de dados
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // Actualice ImageView con el ID de recurso dibujable correcto
        diceImage.setImageResource(drawableResource)
        // Actualizar la descripción del contenido
        diceImage.contentDescription = diceRoll.toString()
    }
    fun Regre(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
}
class Lanza(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}