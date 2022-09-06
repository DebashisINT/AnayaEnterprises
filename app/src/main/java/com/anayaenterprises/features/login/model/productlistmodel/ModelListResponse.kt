package com.anayaenterprises.features.login.model.productlistmodel

import com.anayaenterprises.app.domain.ModelEntity
import com.anayaenterprises.app.domain.ProductListEntity
import com.anayaenterprises.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}