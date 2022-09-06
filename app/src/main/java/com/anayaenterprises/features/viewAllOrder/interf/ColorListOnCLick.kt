package com.anayaenterprises.features.viewAllOrder.interf

import com.anayaenterprises.app.domain.NewOrderGenderEntity
import com.anayaenterprises.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}