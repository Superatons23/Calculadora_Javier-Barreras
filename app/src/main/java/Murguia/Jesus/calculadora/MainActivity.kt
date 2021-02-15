package Murguia.Jesus.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

   
    var numero_dos:String =""
     var numero_uno:String =""
    var primerNumero=false
    var segundoNumero=false
    var res:Float =0.0f
    var str:String=""
    var operacion:String="nada"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado: TextView = findViewById(R.id.tvResultado)
        val tvInput:TextView=findViewById(R.id.tvInput)

        val button_cero:Button=findViewById(R.id.button_cero)
        val button_uno:Button=findViewById(R.id.button_uno)
        val button_dos:Button=findViewById(R.id.button_dos)
        val button_tres:Button=findViewById(R.id.button_tres)
        val button_cuatro:Button=findViewById(R.id.button_cuatro)
        val button_cinco:Button=findViewById(R.id.button_cinco)
        val button_seis:Button=findViewById(R.id.button_seis)
        val button_siete:Button=findViewById(R.id.button_siete)
        val button_ocho:Button=findViewById(R.id.button_ocho)
        val button_nueve:Button=findViewById(R.id.button_nueve)
        val button_igual:Button=findViewById(R.id.button_resultado)
        val button_borrar:Button=findViewById(R.id.button_borrar)
        val button_dividir:Button=findViewById(R.id.button_dividir)
        val button_sumar:Button=findViewById(R.id.button_sumar)
        val button_multiplicar:Button=findViewById(R.id.button_multiplicar)
        val button_restar:Button=findViewById(R.id.button_restar)

        button_cero.setOnClickListener {
            if(!primerNumero) {
                numero_uno+="0"
                tvInput.setText(numero_uno)
            }
            else {numero_dos+="0"
            tvInput.setText(str+numero_dos)
            }
        }
        button_uno.setOnClickListener {
            if(!primerNumero) {
                numero_uno+="1"
                tvInput.setText(numero_uno)
            }
            else {numero_dos+="1"
                tvInput.setText(str+numero_dos)
            }
        }
        button_dos.setOnClickListener {
            if(!primerNumero) {
                numero_uno+="2"
                tvInput.setText(numero_uno)
            }
            else {numero_dos+="2"
                tvInput.setText(str+numero_dos)
            }
        }
        button_tres.setOnClickListener {
            if(!primerNumero) {
                numero_uno+="3"
                tvInput.setText(numero_uno)
            }
            else {numero_dos+="3"
                tvInput.setText(str+numero_dos)
            }
        }
        button_cuatro.setOnClickListener {
            if(!primerNumero) {
                numero_uno+="4"
                tvInput.setText(numero_uno)
            }
            else {numero_dos+="4"
                tvInput.setText(str+numero_dos)
            }
        }
        button_cinco.setOnClickListener {
            if(!primerNumero) {
                numero_uno+="5"
                tvInput.setText(numero_uno)
            }
            else {numero_dos+="5"
                tvInput.setText(str+numero_dos)
            }
        }
        button_seis.setOnClickListener {
            if(!primerNumero) {
                numero_uno+="6"
                tvInput.setText(numero_uno)
            }
            else {numero_dos+="6"
                tvInput.setText(str+numero_dos)
            }
        }
        button_siete.setOnClickListener {
            if(!primerNumero) {
                numero_uno+="7"
                tvInput.setText(numero_uno)
            }
            else {numero_dos+="7"
                tvInput.setText(str+numero_dos)
            }
        }
        button_ocho.setOnClickListener {
            if(!primerNumero) {
                numero_uno+="8"
                tvInput.setText(numero_uno)
            }
            else {numero_dos+="8"
                tvInput.setText(str+numero_dos)
            }
        }
        button_nueve.setOnClickListener {
            if(!primerNumero) {
                numero_uno+="9"
                tvInput.setText(numero_uno)
            }
            else {numero_dos+="9"
                tvInput.setText(str+numero_dos)
            }
        }
        button_sumar.setOnClickListener {
            if(!primerNumero){
                primerNumero=true
                str=numero_uno+"+"
                tvInput.setText(str)
                operacion="suma"
            }
        }
        button_restar.setOnClickListener {
            if(!primerNumero){
                primerNumero=true
                str=numero_uno+"-"
                tvInput.setText(str)
                operacion="resta"
            }
        }
        button_multiplicar.setOnClickListener {
            if(!primerNumero){
                primerNumero=true
                str=numero_uno+"*"
                tvInput.setText(str)
                operacion="multiplicacion"
            }
        }
        button_dividir.setOnClickListener {
            if(!primerNumero){
                str=numero_uno+"/"
                primerNumero=true
                tvInput.setText(str)
                operacion="division"
            }
        }

        button_borrar.setOnClickListener {
            tvInput.setText("")
            tvResultado.setText("")
            operacion="nada"
            res=0.0f
            str=""
            numero_uno=""
            numero_dos=""
            primerNumero=false
            segundoNumero=false

        }
        button_igual.setOnClickListener {
            if(primerNumero){
                when(operacion){
                    "suma" -> res=(numero_uno.toInt()+numero_dos.toInt()).toFloat()
                    "resta" -> res=(numero_uno.toInt()-numero_dos.toInt()).toFloat()
                    "division" -> res=(numero_uno.toInt()/numero_dos.toInt()).toFloat()
                    "multiplicacion" -> res=(numero_uno.toInt()*numero_dos.toInt()).toFloat()
                }
                tvResultado.setText(str+numero_dos+"="+res.toString())
                tvInput.setText("")
                numero_uno=""
                numero_dos=""
                operacion="nada"
                res=0.0f
                str=""
                primerNumero=false
                segundoNumero=false
            }
        }
    }
}