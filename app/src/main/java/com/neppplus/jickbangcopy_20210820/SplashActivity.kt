package com.neppplus.jickbangcopy_20210820

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        로딩화면 -> (3초정도 노출 후에) -> 메인화면으로 이동.

//        인텐트 관련 코드를 => 3초 후에 실행.

        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({

            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            finish()

        }, 3000)



    }
}