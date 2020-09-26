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
* Статус заявки
* Values: new,partiallyFill,fill,cancelled,replaced,pendingCancel,rejected,pendingReplace,pendingNew
*/

enum class OrderStatus(val value: kotlin.String){


    @Json(name = "New")
    new("New"),


    @Json(name = "PartiallyFill")
    partiallyFill("PartiallyFill"),


    @Json(name = "Fill")
    fill("Fill"),


    @Json(name = "Cancelled")
    cancelled("Cancelled"),


    @Json(name = "Replaced")
    replaced("Replaced"),


    @Json(name = "PendingCancel")
    pendingCancel("PendingCancel"),


    @Json(name = "Rejected")
    rejected("Rejected"),


    @Json(name = "PendingReplace")
    pendingReplace("PendingReplace"),


    @Json(name = "PendingNew")
    pendingNew("PendingNew");



	/**
	This override toString avoids using the enum var name and uses the actual api value instead.
	In cases the var name and value are different, the client would send incorrect enums to the server.
	**/
	override fun toString(): String {
        return value
    }

}

