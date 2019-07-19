package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.isEnabled = false

        editPass.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

                if ((editEmail.getText().isNotEmpty()) && (editPass.getText().isNotEmpty())){
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

        editEmail.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if ((editEmail.getText().isNotEmpty()) && (editPass.getText().isNotEmpty())){
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

        button.setOnClickListener{
            layout.visibility = View.INVISIBLE

        }

    }

}


