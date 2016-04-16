package com.github.jmonad.kaybe.kaybesample.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.github.jmonad.kaybe.kaybesample.R
import com.jmonad.kaybe.maybe

class SomeActivity : AppCompatActivity() {

  val toolbar by lazy { findViewById(R.id.toolbar) as Toolbar }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_some)
    configToolbar()
  }

  fun configToolbar() {
    setSupportActionBar(toolbar)
    maybe(supportActionBar).bind {
      actionBar.setHomeButtonEnabled(true)
      actionBar.setDisplayHomeAsUpEnabled(true)
    }
  }

}