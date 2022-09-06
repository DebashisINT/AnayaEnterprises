package com.anayaenterprises.features.location.shopRevisitStatus

import com.anayaenterprises.features.location.shopdurationapi.ShopDurationApi
import com.anayaenterprises.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}