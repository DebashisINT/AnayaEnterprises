package com.anayaenterprises.features.viewAllOrder.interf

import com.anayaenterprises.app.domain.NewOrderGenderEntity
import com.anayaenterprises.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}