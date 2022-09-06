package com.anayaenterprises.features.stockCompetetorStock.api

import com.anayaenterprises.base.BaseResponse
import com.anayaenterprises.features.orderList.model.NewOrderListResponseModel
import com.anayaenterprises.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.anayaenterprises.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}