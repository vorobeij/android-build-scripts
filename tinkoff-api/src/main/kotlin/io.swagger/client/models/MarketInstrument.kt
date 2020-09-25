/**
 * OpenAPI
 * tinkoff.ru/invest OpenAPI.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: n.v.melnikov@tinkoff.ru
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.models

/**
 *
 * @param figi
 * @param ticker
 * @param isin
 * @param minPriceIncrement Шаг цены
 * @param lot
 * @param minQuantity Минимальное число инструментов для покупки должно быть не меньше, чем размер лота х количество лотов
 * @param currency
 * @param name
 * @param type
 */
data class MarketInstrument(
    val figi: kotlin.String,
    val ticker: kotlin.String,
    val lot: kotlin.Int,
    val name: kotlin.String,
    val type: InstrumentType,
    val isin: kotlin.String? = null,
    /* Шаг цены */
    val minPriceIncrement: kotlin.Double? = null,
    /* Минимальное число инструментов для покупки должно быть не меньше, чем размер лота х количество лотов */
    val minQuantity: kotlin.Int? = null,
    val currency: Currency? = null
) {
}