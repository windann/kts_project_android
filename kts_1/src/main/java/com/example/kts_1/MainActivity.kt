package com.example.kts_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.isEnabled = false

        var passEnter = false
        var emailEnter = false

        editPass.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                passEnter = true

                if (emailEnter) {
                    button.isEnabled = true
                }
            }

            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int) {}

            override fun onTextChanged(
                s: CharSequence?,
                start: Int,
                before: Int,
                count: Int) {

            }
        })

        editPass.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                emailEnter = true

                if (passEnter) {
                    button.isEnabled = true
                }
            }

            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int) {}

            override fun onTextChanged(
                s: CharSequence?,
                start: Int,
                before: Int,
                count: Int) {

            }
        })

    }

}


