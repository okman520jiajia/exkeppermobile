package com.okman.exkeppermobile.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RadioGroup
import com.okman.exkeppermobile.PreferencesMannager
import com.okman.exkeppermobile.R
import com.okman.exkeppermobile.base.BaseFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navBottom.setOnCheckedChangeListener(this)
        loadPages()
        showPage(PreferencesMannager.getInt("LastPageIndex",0))

    }

    override fun onCheckedChanged(p0: RadioGroup?, id: Int) =when(id)
    {
        R.id.rb_okex ->{
            showPage(0)
        }

        R.id.rb_market->{
            showPage(1)
        }

        R.id.rb_curreny->{
            showPage(2)
        }

        R.id.rb_c2c->{
            showPage(3)
        }

        R.id.rb_contract->{
            showPage(4)
        }

        else -> {
        }
    }

    var frags = listOf(OkExPage(),MarketPage(),CurrenyPage(),C2CPage(),ContractPage())

    private fun loadPages()
    {
        if(supportFragmentManager.fragments.size==0)
        {
            val t = supportFragmentManager.beginTransaction()
            for(frag in frags)
            {
                t.add(R.id.mainContent,frag)
                t.hide(frag)
            }
            t.commit()
        }else{
            frags = supportFragmentManager.fragments as List<BaseFragment>
        }
        currentPage = -1
    }

    var currentPage = -1
    val navIds = listOf(R.id.rb_okex,R.id.rb_market,R.id.rb_curreny,R.id.rb_c2c,R.id.rb_contract)

    private fun showPage(index:Int)
    {
        navBottom.check(navIds[index])
        with(supportFragmentManager.beginTransaction())
        {
            if(currentPage!=-1)
                hide(frags[currentPage])
            show(frags[index])
            commit()
            currentPage = index
        }
        PreferencesMannager.putInt("LastPageIndex",currentPage)
    }
}
