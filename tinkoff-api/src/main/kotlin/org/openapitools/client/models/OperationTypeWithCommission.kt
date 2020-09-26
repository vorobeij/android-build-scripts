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


import com.squareup.moshi.Json

/**
* 
* Values: buy,buyCard,sell,brokerCommission,exchangeCommission,serviceCommission,marginCommission,otherCommission,payIn,payOut,tax,taxLucre,taxDividend,taxCoupon,taxBack,repayment,partRepayment,coupon,dividend,securityIn,securityOut
*/

enum class OperationTypeWithCommission(val value: kotlin.String){


    @Json(name = "Buy")
    buy("Buy"),


    @Json(name = "BuyCard")
    buyCard("BuyCard"),


    @Json(name = "Sell")
    sell("Sell"),


    @Json(name = "BrokerCommission")
    brokerCommission("BrokerCommission"),


    @Json(name = "ExchangeCommission")
    exchangeCommission("ExchangeCommission"),


    @Json(name = "ServiceCommission")
    serviceCommission("ServiceCommission"),


    @Json(name = "MarginCommission")
    marginCommission("MarginCommission"),


    @Json(name = "OtherCommission")
    otherCommission("OtherCommission"),


    @Json(name = "PayIn")
    payIn("PayIn"),


    @Json(name = "PayOut")
    payOut("PayOut"),


    @Json(name = "Tax")
    tax("Tax"),


    @Json(name = "TaxLucre")
    taxLucre("TaxLucre"),


    @Json(name = "TaxDividend")
    taxDividend("TaxDividend"),


    @Json(name = "TaxCoupon")
    taxCoupon("TaxCoupon"),


    @Json(name = "TaxBack")
    taxBack("TaxBack"),


    @Json(name = "Repayment")
    repayment("Repayment"),


    @Json(name = "PartRepayment")
    partRepayment("PartRepayment"),


    @Json(name = "Coupon")
    coupon("Coupon"),


    @Json(name = "Dividend")
    dividend("Dividend"),


    @Json(name = "SecurityIn")
    securityIn("SecurityIn"),


    @Json(name = "SecurityOut")
    securityOut("SecurityOut");



	/**
	This override toString avoids using the enum var name and uses the actual api value instead.
	In cases the var name and value are different, the client would send incorrect enums to the server.
	**/
	override fun toString(): String {
        return value
    }

}

