package com.example.chartsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lib.ChartDataBean
import kotlinx.android.synthetic.main.activity_curve_chart.*
import java.math.BigDecimal

/**
 * 曲线图
 */
class CurveChartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curve_chart)

        resetData.setOnClickListener {
            setChartData()
        }
        setChartData()
    }

    private fun setChartData() {
        val list = arrayListOf<ChartDataBean>()
        list.add(ChartDataBean("9/1", BigDecimal(40000)))
        list.add(ChartDataBean("9/2", BigDecimal(35000)))
        list.add(ChartDataBean("9/3", BigDecimal(56800)))
        list.add(ChartDataBean("9/4", BigDecimal(45000)))
        list.add(ChartDataBean("9/5", BigDecimal(38000)))
        list.add(ChartDataBean("9/6", BigDecimal(52000)))
        curveChartView.mData = list
    }
}