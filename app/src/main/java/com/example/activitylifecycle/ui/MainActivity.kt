package com.example.activitylifecycle.ui

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.activitylifecycle.R
import com.example.activitylifecycle.util.logError

class MainActivity : AppCompatActivity() {
    //Uygulamayi ilk calistirdigimizda onCreate methodu calisir.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        "onCreateBeforeContentView".logError()

        //setContentView methodu cagrildigi icin onContentChanged methodu calistirilir.
        setContentView(R.layout.activity_main)
        "onCreateAfterContentView".logError()
        // "onCreate".logError()
    }

    //onCreate methodundan sonra calisacak method.
    override fun onStart() {
        super.onStart()
        "onStart".logError()
    }

    //onStart methodundan sonra calisir ve bu method calistiginda ui acilmis olur.
    override fun onResume() {
        super.onResume()
        "onResume".logError()
    }

    //Uygulamayi arka plana aldigimizda, ekrani yan cevirdigimizde veya geri tusuna bastigimizda ilk calisacak method.
    override fun onPause() {
        super.onPause()
        "onPause".logError()
    }

    //onStop methodundan sonra eger activity oldurmeden tekrar cagirmissak calisacak method.
    //Buradan onStart methoduna gecer ve akis devam eder.
    override fun onRestart() {
        super.onRestart()
        "onRestart".logError()
    }

    //Uygulamayi tamamen kapattigimizda veya ekrani yataya-dikeye cevirdigimizde calisir.
    //Devamında onCreate methodundan itibaren calismaya baslar.
    override fun onDestroy() {
        super.onDestroy()
        "onDestroy".logError()
    }

    //onPause methodundan sonra calisir. Uygulamayi kapatirsak onDestroy methoduna gecer.
    //Kapatmadan devam edersek buradan onRestart methoduna gecer.
    override fun onStop() {
        super.onStop()
        "onStop".logError()
    }

    //Bazı methodlar cagrildiginde calisir. Burada setContentView methodu cagrildigi icin calisir.
    override fun onContentChanged() {
        super.onContentChanged()
        "onContentChanged".logError()
    }

    //Geri tusunu kullandigimizda calisir ve sirasiyla onPause ve onStop methodlari calisir.
    override fun onBackPressed() {
        super.onBackPressed()
        "onBackPressed".logError()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        "onOptionsItemSelected".logError()
        return super.onOptionsItemSelected(item)
    }

    override fun onOptionsMenuClosed(menu: Menu?) {
        super.onOptionsMenuClosed(menu)
        "onOptionsMenuClosed".logError()
    }

    //ActionBarda yer alan menuleri yapilandirmak icin kullanilan method.
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        "onCreateOptionsMenu".logError()
        return super.onCreateOptionsMenu(menu)
    }

    //ActionBarda yer alan menuleri yapilandirmak icin kullanilan method.
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        "onPrepareOptionsMenu".logError()
        return super.onPrepareOptionsMenu(menu)
    }

    //onSaveInstanceState methodu tarafından toplanan bilgileri set eder.
    //onStart ve onResume methodları arasında calisir.
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        "onRestoreInstanceState".logError()
    }

    //Uygulamayi arka plana aldigimizda onStop methodundan onDestroy methoduna gecerken arada calisir.
    //Ui daki degistirilebilir alanların bilgisini tutar.
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        "onSaveInstanceState".logError()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        "onConfigurationChanged".logError()
    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)
        "startActivityForResult".logError()
    }

    //Ui da herhangi bir alana dokunuldugunda calisir.
    override fun onUserInteraction() {
        super.onUserInteraction()
        "onUserInteraction".logError()
    }
}

