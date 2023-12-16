package com.example.rm_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.LinearLayoutManager

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        //initRcView()
        supportFragmentManager.beginTransaction()
            .replace(R.id.placeHolder, DeviceListFragment()).commit()

    }
//    private fun initRcView(){
//        val rcView = findViewById<RecyclerView>(R.id.rcViewPaired)
//        rcView.layoutManager = LinearLayoutManager(this)
//        val adapter = ItemAdapter()
//        rcView.adapter = adapter
//        adapter.submitList(createDeviceList())
//    }
//    private fun createDeviceList():List<ListItem>{
//        val list = ArrayList<ListItem>()
//        for(i in 0 until 5){
//            list.add(
//                ListItem(
//                    "Samsung",
//                    true
//
//                )
//            )
//        }
//        return list
//    }
}