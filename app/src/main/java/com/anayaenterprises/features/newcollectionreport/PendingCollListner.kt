package com.anayaenterprises.features.newcollectionreport

import com.anayaenterprises.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}