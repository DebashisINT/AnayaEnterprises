package com.anayaenterprises.features.viewAllOrder.interf

import com.anayaenterprises.app.domain.NewOrderColorEntity
import com.anayaenterprises.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}