package com.anayaenterprises.features.viewAllOrder.interf

import com.anayaenterprises.app.domain.NewOrderGenderEntity
import com.anayaenterprises.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}