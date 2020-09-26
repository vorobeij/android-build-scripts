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

import org.openapitools.client.models.SandboxAccount

import com.squareup.moshi.Json
/**
 * 
 * @param trackingId 
 * @param status 
 * @param payload 
 */

data class SandboxRegisterResponse (
    @Json(name = "trackingId")
    val trackingId: kotlin.String,
    @Json(name = "status")
    val status: kotlin.String,
    @Json(name = "payload")
    val payload: SandboxAccount
)

