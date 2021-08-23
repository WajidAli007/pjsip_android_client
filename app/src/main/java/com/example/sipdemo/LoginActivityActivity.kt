package com.example.sipdemo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.sipdemo.ui.MainActivity
import com.example.sipdemo.databinding.ActivityLoginBinding
import com.example.sipdemo.data.db.MyRoomDatabase
import com.example.sipdemo.data.db.entities.SipAccount

class LoginActivityActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(MyRoomDatabase.db.sipAccountDao().getSipAccounts().isNotEmpty()){
            gotoMain()
            return
        }

        val inflater: LayoutInflater = layoutInflater
        binding = ActivityLoginBinding.inflate(inflater)
        setContentView(binding.root)

        val adapter = ArrayAdapter.createFromResource(this, R.array.transport_types, android.R.layout.simple_dropdown_item_1line)
        binding.spinnerTransport.adapter = adapter

        binding.btnAddAccount.setOnClickListener {
            val portNumber = binding.etPortNumber.text.toString()
            val sipAccount = SipAccount(
                0,
                domain = binding.etDomain.text.toString(),
                userName = binding.etUserName.text.toString(),
                displayName = binding.etDisplayName.text.toString(),
                password = binding.editTextTextPassword.text.toString(),
                port = if(portNumber.isNotEmpty()) portNumber else "5060",
                transport = binding.spinnerTransport.selectedItem?.toString() ?: "TLS",
                isSelf = true
            )
            MyRoomDatabase.db.sipAccountDao().insertSipAccount(sipAccount)
            gotoMain()
        }

    }

    private fun gotoMain(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}