package com.revolut.data.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by yatsinar on 17/03/2018.
 * Revolut
 * All rights reserved
 *
{
"MarketCurrency": "LTC",
"BaseCurrency": "BTC",
"MarketCurrencyLong": "Litecoin",
"BaseCurrencyLong": "Bitcoin",
"MinTradeSize": 0.01231527,
"MarketName": "BTC-LTC",
"IsActive": true,
"IsRestricted": false,
"Created": "2014-02-13T00:00:00",
"Notice": null,
"IsSponsored": null,
"LogoUrl": "https://bittrexblobstorage.blob.core.windows.net/public/6defbc41-582d-47a6-bb2e-d0fa88663524.png"
}
 */
@Serializable
data class MarketResponse(
        @SerialName("MarketCurrency") val marketCurrency: String,
        @SerialName("MarketCurrencyLong") val marketCurrencyLong: String,
        @SerialName("BaseCurrency") val baseCurrency: String,
        @SerialName("BaseCurrencyLong") val baseCurrencyLong: String,
        @SerialName("MinTradeSize") val minTradeSize: Double,
        @SerialName("MarketName") val marketName: String,
        @SerialName("IsActive") val isActive: Boolean,
        @SerialName("IsRestricted") val isRestricted: Boolean,
        @SerialName("Created") val created: String,
        @SerialName("Notice") val notice: String?,
        @SerialName("IsSponsored") val isSponsored: Boolean?,
        @SerialName("LogoUrl") val logoUrl: String?
)