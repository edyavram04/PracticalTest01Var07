package ro.pub.cs.systems.eim.practicaltest01var07

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent

private lateinit var firstNum: EditText
private lateinit var secondNum: EditText
private lateinit var thirdNum: EditText
private lateinit var fourthNum: EditText

private lateinit var  sumButton: Button
private lateinit var  productButton: Button


class PracticalTest01Var07SecondaryActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var07_secondary)

        firstNum = findViewById(R.id.first_num)
    secondNum = findViewById(R.id.second_num)
    thirdNum = findViewById(R.id.third_num)
    fourthNum = findViewById(R.id.fourth_num)



}
}