package com.okman.exkeppermobile.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.okman.exkeppermobile.R

class OkexTopInfoAdapter :BaseQuickAdapter<List<String>,BaseViewHolder>(R.layout.okextop_item) {

    override fun convert(helper: BaseViewHolder?, item: List<String>?) {
        helper?.setText(R.id.main_title,item?.get(0) ?: "")
        helper?.setText(R.id.sub_title,item?.get(1) ?: "")
    }
}