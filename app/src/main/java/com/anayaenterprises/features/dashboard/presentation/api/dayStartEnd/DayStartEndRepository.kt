package com.anayaenterprises.features.dashboard.presentation.api.dayStartEnd

import com.anayaenterprises.app.Pref
import com.anayaenterprises.base.BaseResponse
import com.anayaenterprises.features.dashboard.presentation.model.DaystartDayendRequest
import com.anayaenterprises.features.dashboard.presentation.model.StatusDayStartEnd
import com.anayaenterprises.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.anayaenterprises.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}