package com.anayaenterprises.features.login.model.productlistmodel

import com.anayaenterprises.app.domain.ProductListEntity
import com.anayaenterprises.base.BaseResponse

/**
 * Created by Saikat on 20-11-2018.
 */
class ProductListResponseModel : BaseResponse() {
    //var product_list: ArrayList<ProductListDataModel>? = null
    var product_list: ArrayList<ProductListEntity>? = null
}