package com.korx.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var kapasiteSonuc: TextView = findViewById(R.id.twKapasite)
        var tankinHacmiii: EditText = findViewById(R.id.etTankinHacmi)
        var tankinDolumsuresiii: EditText = findViewById(R.id.etTankinDolumSuresi)
        var btnHesaplaaa: Button = findViewById(R.id.btnHesaplal)
        var basinc: EditText = findViewById(R.id.etBasinc)


        /*btnHesaplaaa.setOnClickListener {
                       var basincssss = basinc.text.toString()

                        if(basincssss==""){
                        Toast.makeText(applicationContext, "B;oOŞ", Toast.LENGTH_LONG)
                            .show()
                                var looogg = "a"
                        Log.e( looogg,"Boş")
                   // kapasiteSonuc.text=basincssss

                }else{

                        var looogg = "1"
                        Log.e( looogg,"QQQQQQQQQQQ"+basincssss+basinc)
                        kapasiteSonuc.text=basincssss


                }
    }*/


        /* btnHesaplaaa.setOnClickListener {
            var basincc = Integer.parseInt(basinc.text.toString())
            var sure = Integer.parseInt(tankinDolumsuresiii.text.toString())
            var hacim = Integer.parseInt(tankinHacmiii.text.toString())
            var islemm = basincc * hacim / sure * 60
//FORMÜL= 7*500/12*60=17500  bar*hacim//saniye*60

            kapasiteSonuc.text = islemm.toString()

        }*/


        btnHesaplaaa.setOnClickListener {


            var basincc = basinc.text.toString()
            var sure = tankinDolumsuresiii.text.toString()
            var hacim = tankinHacmiii.text.toString()
            if (basincc == "" || sure == "" || hacim == "") {

                Toast.makeText(applicationContext, "Değer giriniz.", Toast.LENGTH_LONG)
                    .show()


            } else {
                var basincc = basinc.text.toString().toDouble()
                var sure = tankinDolumsuresiii.text.toString().toDouble()
                var hacim = tankinHacmiii.text.toString().toDouble()
                var islemm = hacim / sure * basincc * 60
                var islemmm = String.format("%.2f", islemm).toDouble()
                kapasiteSonuc.text = islemmm.toString() + "m³"
                //  val number:Double = 0.0449999
                // val number3digits:Double = String.format("%.2f", number).toDouble()
                // kapasiteSonuc.text=number3digits.toString()
            }

/*


var basincc = etBasinc.text.toString().toInt()
var sure = etTankinDolumSuresi.text.toString().toInt()
var hacim = etTankinHacmi.text.toString().toInt()
var islemm=  sure!! * hacim!! / basincc!! *60*/


        }
    }
}




