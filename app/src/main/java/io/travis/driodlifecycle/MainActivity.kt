package io.travis.driodlifecycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button


class MainActivity : LoggingActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val opaqueActivityButton = findViewById(R.id.opaqueActivityButton) as Button
        opaqueActivityButton.setOnClickListener {
            val intent = Intent(getApplicationContext(), OpaqueActivity::class.java)
            startActivity(intent)
        }

        val transparentActivityButton = findViewById(R.id.transparentActivityButton) as Button
        transparentActivityButton.setOnClickListener {
            val intent = Intent(getApplicationContext(), TransparentActivity::class.java)
            startActivity(intent)
        }
    }

    init {
        setActivityName("MainActivity")
    }
}
