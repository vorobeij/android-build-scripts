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

import org.openapitools.client.models.MoneyAmount
import org.openapitools.client.models.OperationType
import org.openapitools.client.models.OrderStatus

import com.squareup.moshi.Json
/**
 * 
 * @param orderId 
 * @param operation 
 * @param status 
 * @param requestedLots 
 * @param executedLots 
 * @param rejectReason 
 * @param message Сообщение об ошибке
 * @param commission 
 */

data class PlacedLimitOrder (
    @Json(name = "orderId")
    val orderId: kotlin.String,
    @Json(name = "operation")
    val operation: OperationType,
    @Json(name = "status")
    val status: OrderStatus,
    @Json(name = "requestedLots")
    val requestedLots: kotlin.Int,
    @Json(name = "executedLots")
    val executedLots: kotlin.Int,
    @Json(name = "rejectReason")
    val rejectReason: kotlin.String? = null,
    /* Сообщение об ошибке */
    @Json(name = "message")
    val message: kotlin.String? = null,
    @Json(name = "commission")
    val commission: MoneyAmount? = null
)

