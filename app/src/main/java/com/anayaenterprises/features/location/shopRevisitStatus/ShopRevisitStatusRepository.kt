package com.anayaenterprises.features.location.shopRevisitStatus

import com.anayaenterprises.base.BaseResponse
import com.anayaenterprises.features.location.model.ShopDurationRequest
import com.anayaenterprises.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}