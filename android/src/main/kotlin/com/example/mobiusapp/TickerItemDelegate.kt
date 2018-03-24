package com.example.mobiusapp

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hannesdorfmann.adapterdelegates3.AdapterDelegate
import com.revolut.domain.models.Market
import com.revolut.domain.models.Ticker
import kotlinx.android.synthetic.main.ticker_item_layout.view.*

class TickerItemDelegate : AdapterDelegate<List<Any>>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup?): RecyclerView.ViewHolder
            = ViewHolder(LayoutInflater.from(viewGroup?.context).inflate(R.layout.ticker_item_layout, viewGroup, false))

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(list: List<Any>, position: Int, holder: RecyclerView.ViewHolder, payloads: MutableList<Any>) {
        val marketTicker = list[position] as MarketTicker
        (holder as? ViewHolder)?.apply {
            tickerTextView.text = "${marketTicker.market.marketName} bid: ${marketTicker.ticker.bid} ask: ${marketTicker.ticker.ask}"
        }
    }

    override fun isForViewType(list: List<Any>, position: Int): Boolean = list[position] is MarketTicker


    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val tickerTextView: TextView = view.tickerTextView

    }

    data class MarketTicker(val market: Market, val ticker: Ticker)

}
