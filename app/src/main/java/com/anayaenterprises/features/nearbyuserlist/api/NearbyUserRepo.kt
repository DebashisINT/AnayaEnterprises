package com.anayaenterprises.features.nearbyuserlist.api

import com.anayaenterprises.app.Pref
import com.anayaenterprises.features.nearbyuserlist.model.NearbyUserResponseModel
import com.anayaenterprises.features.newcollection.model.NewCollectionListResponseModel
import com.anayaenterprises.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}