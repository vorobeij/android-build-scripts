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
 * @param trackingId
 * @param status
 * @param payload
 */
data class UserAccountsResponse(
    val trackingId: kotlin.String,
    val status: kotlin.String,
    val payload: UserAccounts

) {
}