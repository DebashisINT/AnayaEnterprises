package com.anayaenterprises.features.lead.api

import com.anayaenterprises.features.NewQuotation.api.GetQuotListRegRepository
import com.anayaenterprises.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}