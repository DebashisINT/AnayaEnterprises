package com.anayaenterprises.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.anayaenterprises.app.FileUtils
import com.anayaenterprises.base.BaseResponse
import com.anayaenterprises.features.NewQuotation.model.*
import com.anayaenterprises.features.addshop.model.AddShopRequestData
import com.anayaenterprises.features.addshop.model.AddShopResponse
import com.anayaenterprises.features.damageProduct.model.DamageProductResponseModel
import com.anayaenterprises.features.damageProduct.model.delBreakageReq
import com.anayaenterprises.features.damageProduct.model.viewAllBreakageReq
import com.anayaenterprises.features.login.model.userconfig.UserConfigResponseModel
import com.anayaenterprises.features.myjobs.model.WIPImageSubmit
import com.anayaenterprises.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}