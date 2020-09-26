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
* Интервал свечи и допустимый промежуток запроса: - 1min [1 minute, 1 day] - 2min [2 minutes, 1 day] - 3min [3 minutes, 1 day] - 5min [5 minutes, 1 day] - 10min [10 minutes, 1 day] - 15min [15 minutes, 1 day] - 30min [30 minutes, 1 day] - hour [1 hour, 7 days] - day [1 day, 1 year] - week [7 days, 2 years] - month [1 month, 10 years] 
* Values: _1min,_2min,_3min,_5min,_10min,_15min,_30min,hour,day,week,month
*/

enum class CandleResolution(val value: kotlin.String){


    @Json(name = "1min")
    _1min("1min"),


    @Json(name = "2min")
    _2min("2min"),


    @Json(name = "3min")
    _3min("3min"),


    @Json(name = "5min")
    _5min("5min"),


    @Json(name = "10min")
    _10min("10min"),


    @Json(name = "15min")
    _15min("15min"),


    @Json(name = "30min")
    _30min("30min"),


    @Json(name = "hour")
    hour("hour"),


    @Json(name = "day")
    day("day"),


    @Json(name = "week")
    week("week"),


    @Json(name = "month")
    month("month");



	/**
	This override toString avoids using the enum var name and uses the actual api value instead.
	In cases the var name and value are different, the client would send incorrect enums to the server.
	**/
	override fun toString(): String {
        return value
    }

}

