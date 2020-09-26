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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param total
 * @param instruments
 */

@Serializable
data class MarketInstrumentList(
    @SerialName("total")
    val total: java.math.BigDecimal,
    @SerialName("instruments")
    val instruments: List<MarketInstrument>
)

