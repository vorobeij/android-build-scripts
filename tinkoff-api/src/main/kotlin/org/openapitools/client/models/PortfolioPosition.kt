/**
* OpenAPI
* tinkoff.ru/invest OpenAPI.
*
* The version of the OpenAPI document: 1.0.0
* Contact: n.v.melnikov@tinkoff.ru
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.InstrumentType
import org.openapitools.client.models.MoneyAmount

import com.squareup.moshi.Json
/**
 * 
 * @param figi 
 * @param instrumentType 
 * @param balance 
 * @param lots 
 * @param name 
 * @param ticker 
 * @param isin 
 * @param blocked 
 * @param expectedYield 
 * @param averagePositionPrice 
 * @param averagePositionPriceNoNkd 
 */

data class PortfolioPosition (
    @Json(name = "figi")
    val figi: kotlin.String,
    @Json(name = "instrumentType")
    val instrumentType: InstrumentType,
    @Json(name = "balance")
    val balance: kotlin.Double,
    @Json(name = "lots")
    val lots: kotlin.Int,
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "ticker")
    val ticker: kotlin.String? = null,
    @Json(name = "isin")
    val isin: kotlin.String? = null,
    @Json(name = "blocked")
    val blocked: kotlin.Double? = null,
    @Json(name = "expectedYield")
    val expectedYield: MoneyAmount? = null,
    @Json(name = "averagePositionPrice")
    val averagePositionPrice: MoneyAmount? = null,
    @Json(name = "averagePositionPriceNoNkd")
    val averagePositionPriceNoNkd: MoneyAmount? = null
)

