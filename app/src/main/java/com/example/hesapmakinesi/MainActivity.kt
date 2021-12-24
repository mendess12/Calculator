package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun butontik(view: View) {

        if (yenioperator) {
            hesaplama.text = ""
        }
        yenioperator = false

        var butonsec = view as Button
        var butondegeri: String = hesaplama.text.toString()

        when (butonsec.id) {

            sayi0.id -> {
                butondegeri += "0"
            }
            sayi1.id -> {
                butondegeri += "1"
            }
            sayi2.id -> {
                butondegeri += "2"
            }
            sayi3.id -> {
                butondegeri += "3"
            }
            sayi4.id -> {
                butondegeri += "4"
            }
            sayi5.id -> {
                butondegeri += "5"
            }
            sayi6.id -> {
                butondegeri += "6"
            }
            sayi7.id -> {
                butondegeri += "7"
            }
            sayi8.id -> {
                butondegeri += "8"
            }
            sayi9.id -> {
                butondegeri += "9"
            }
        }
        hesaplama.setText(butondegeri)
    }

    var operator = "*"
    var eskisayi = ""
    var yenioperator = true

    fun butonislem(view: View) {

        var butonsec = view as Button

        when (butonsec.id) {
            bolu.id -> {
                operator = "/"
            }
            carpi.id -> {
                operator = "*"
            }
            eksi.id -> {
                operator = "-"
            }
            arti.id -> {
                operator = "+"
            }
        }
        eskisayi = hesaplama.text.toString()
        yenioperator = true
    }

    fun butonhesapla(view: View) {

        var yenisayi = hesaplama.text.toString()
        var sonuc: Double? = null

        when (operator) {
            "/" -> {
                sonuc = eskisayi.toDouble() / yenisayi.toDouble()
            }
            "*" -> {
                sonuc = eskisayi.toDouble() * yenisayi.toDouble()
            }
            "+" -> {
                sonuc = eskisayi.toDouble() + yenisayi.toDouble()
            }
            "-" -> {
                sonuc = eskisayi.toDouble() - yenisayi.toDouble()
            }
        }
        hesaplama.setText(sonuc.toString())
        yenioperator = true
    }

    fun temizle(view: View){

        hesaplama.setText("0")
        yenioperator = true
    }
}