package com.okman.exkeppermobile.ui

import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.okman.exkeppermobile.R
import com.okman.exkeppermobile.adapter.OkexTopInfoAdapter
import com.okman.exkeppermobile.base.BaseFragment
import kotlinx.android.synthetic.main.okexpage.*

class OkExPage :BaseFragment(){

    override fun getLayoutID(): Int {
        return R.layout.okexpage
    }

    override fun initView(contentView: View?) {
        login.setOnClickListener {
            startActivity(Intent(context,Login::class.java))
        }
        okexTopInfo.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        okexTopInfo.adapter = OkexTopInfoAdapter()
        (okexTopInfo.adapter as OkexTopInfoAdapter).replaceData(listOf(
                listOf("买币指南","手把手实操攻略")
                , listOf("玩转OKEX钱包","深入了解OKEX钱包")
                , listOf("加入社区","老司机带你玩转币圈")
        ))

        (okexTopInfo.adapter as OkexTopInfoAdapter).setOnItemClickListener { _, _, position ->
            println("$position clicked")
        }

    }

    override fun initData() {

    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        if(!hidden)
        {
            println("okExpage Visible")
        }
    }

}