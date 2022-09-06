package com.anayaenterprises.features.orderList.model

import com.anayaenterprises.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}