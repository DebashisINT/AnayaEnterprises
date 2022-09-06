package com.anayaenterprises.features.dashboard.presentation.api.dayStartEnd

import com.anayaenterprises.features.stockCompetetorStock.api.AddCompStockApi
import com.anayaenterprises.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}