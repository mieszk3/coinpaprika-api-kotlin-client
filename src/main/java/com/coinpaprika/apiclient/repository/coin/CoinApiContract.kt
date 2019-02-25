/*
 * Created by Piotr Kostecki on 09.01.19 12:04
 * kontakt@piotrkostecki.pl
 *
 * Last modified 09.01.19 12:04
 */

package com.coinpaprika.apiclient.repository.coin

import com.coinpaprika.apiclient.entity.*
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinApiContract {
    @GET("coins/{id}")
    fun getCoin(@Path("id") id: String): Observable<Response<CoinEntity>>

    @GET("coins")
    fun getCoins(): Observable<Response<List<CoinEntity>>>

    @GET("coins/{id}/events/")
    fun getEvents(@Path("id") id: String): Observable<Response<List<EventEntity>>>

    @GET("coins/{id}/exchanges/")
    fun getExchanges(@Path("id") id: String): Observable<Response<List<ExchangeEntity>>>

    @GET("coins/{id}/markets/")
    fun getMarkets(@Path("id") id: String): Observable<Response<List<MarketEntity>>>

    @GET("coins/{id}/twitter/")
    fun getTweets(@Path("id") id: String): Observable<Response<List<TweetEntity>>>
}