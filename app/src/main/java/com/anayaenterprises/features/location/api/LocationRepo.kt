package com.anayaenterprises.features.location.api

import com.anayaenterprises.app.Pref
import com.anayaenterprises.base.BaseResponse
import com.anayaenterprises.features.location.model.AppInfoInputModel
import com.anayaenterprises.features.location.model.AppInfoResponseModel
import com.anayaenterprises.features.location.model.ShopDurationRequest
import com.anayaenterprises.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }
}