package com.anayaenterprises.features.document.api

import com.anayaenterprises.features.dymanicSection.api.DynamicApi
import com.anayaenterprises.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}