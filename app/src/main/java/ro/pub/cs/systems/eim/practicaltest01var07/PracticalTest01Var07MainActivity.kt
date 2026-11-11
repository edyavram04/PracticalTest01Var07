package ro.pub.cs.systems.eim.practicaltest01var07

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import kotlin.random.Random

private lateinit var setButton: Button
private lateinit var firstNum: EditText
private lateinit var secondNum: EditText
private lateinit var thirdNum: EditText
private lateinit var fourthNum: EditText
private lateinit var randomButton: Button



class PracticalTest01Var07MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var07_main)

        setButton = findViewById(R.id.set_button)
        firstNum = findViewById(R.id.first_num)
        secondNum = findViewById(R.id.second_num)
        thirdNum = findViewById(R.id.third_num)
        fourthNum = findViewById(R.id.fourth_num)
        randomButton = findViewById(R.id.random_button)

        randomButton.setOnClickListener {
            val primaVal = firstNum.text.toString()
            val douaVal = secondNum.text.toString()
            val treiaVal = thirdNum.text.toString()
            val patraVal = fourthNum.text.toString()

            if (primaVal.toFloatOrNull() == null){
                val numRandom1 = Random.nextDouble(0.0, 10.0000000001)
                firstNum.setText("$numRandom1")

            }
            else {
                firstNum.setText("$primaVal")
            }
            if (douaVal.toFloatOrNull() == null){
                val numRandom2 = Random.nextDouble(0.0, 10.0000000001)
                secondNum.setText("$numRandom2")
            }
            else {
                secondNum.setText("$douaVal")
            }
            if (treiaVal.toFloatOrNull() == null){
                val numRandom3 = Random.nextDouble(0.0, 10.0000000001)
                thirdNum.setText("$numRandom3")
            }
            else {
                thirdNum.setText("$treiaVal")
            }
            if (patraVal.toFloatOrNull() == null){
                val numRandom4 = Random.nextDouble(0.0, 10.0000000001)
                fourthNum.setText("$numRandom4")
            }
            else {
                fourthNum.setText("$patraVal")
            }


        }

    }
}
