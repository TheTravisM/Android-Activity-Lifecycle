package io.travis.driodlifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class LoggingActivity : AppCompatActivity() {

    private val mFilterTag = "LifecycleExample"
    private var mActivityName = ""

    protected fun setActivityName(activityName: String) {
        mActivityName = activityName
    }

    protected override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(mFilterTag, "$mActivityName onCreate")
        super.onCreate(savedInstanceState)
    }

    protected override fun onStart() {
        Log.d(mFilterTag, "$mActivityName onStart")
        super.onStart()
    }

    protected override fun onResume() {
        Log.d(mFilterTag, "$mActivityName onResume")
        super.onResume()
    }

    protected override fun onPause() {
        Log.d(mFilterTag, "$mActivityName onPause")
        super.onPause()
    }

    protected override fun onStop() {
        Log.d(mFilterTag, "$mActivityName onStop")
        super.onStop()
    }

    protected override fun onRestart() {
        Log.d(mFilterTag, "$mActivityName onRestart")
        super.onRestart()
    }

    protected override fun onDestroy() {
        Log.d(mFilterTag, "$mActivityName onDestroy")
        super.onDestroy()
    }
}