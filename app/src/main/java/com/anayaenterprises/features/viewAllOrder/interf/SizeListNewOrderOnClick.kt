package com.anayaenterprises.features.viewAllOrder.interf

import com.anayaenterprises.app.domain.NewOrderProductEntity
import com.anayaenterprises.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}