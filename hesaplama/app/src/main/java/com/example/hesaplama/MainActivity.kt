package com.example.hesaplama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun topla(view: View){

        var a = editTextTextPersonName3.text.toString().toIntOrNull()
        var b = editTextTextPersonName4.text.toString().toIntOrNull()

        if (a == null || b == null){
            sonuc.text = "Lütfen sayı giriniz"

        } else {
            var sonuclar = a+b
            sonuc.text= "Sonuç ${sonuclar}"
        }


    }
    fun cikar(view: View){
        var a = editTextTextPersonName3.text.toString().toIntOrNull()
        var b = editTextTextPersonName4.text.toString().toIntOrNull()

        if (a == null || b == null){
            sonuc.text = "Lütfen sayı giriniz"

        } else {
            var sonuclar = a-b
            sonuc.text= "Sonuç ${sonuclar}"
        }
    }
    fun carp(view: View){
        var a = editTextTextPersonName3.text.toString().toIntOrNull()
        var b = editTextTextPersonName4.text.toString().toIntOrNull()

        if (a == null || b == null){
            sonuc.text = "Lütfen sayı giriniz"

        } else {
            var sonuclar = a*b
            sonuc.text= "Sonuç ${sonuclar}"
        }
    }
    fun bolme(view: View){
        var a = editTextTextPersonName3.text.toString().toIntOrNull()
        var b = editTextTextPersonName4.text.toString().toIntOrNull()

        if (a == null || b == null){
            sonuc.text = "Lütfen sayı giriniz"

        } else {
            var sonuclar = a/b
            sonuc.text= "Sonuç ${sonuclar}"
        }
    }

}