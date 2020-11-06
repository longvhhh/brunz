package junction.brunz.data.network

import io.reactivex.Single
import junction.brunz.data.model.base.RecommendRequest
import junction.brunz.data.model.place.PlacesResponse
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Long Vu on 6.11.2020
 */
interface AitoApi {

  @POST("api/v1/_recommend")
  fun getRecommendPlaces(@Body request: RecommendRequest): Single<PlacesResponse>

  companion object {

    private val instance = RetrofitProvider.provide()
      .create(AitoApi::class.java)

    fun get(): AitoApi = instance
  }
}