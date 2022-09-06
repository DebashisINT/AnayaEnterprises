package com.anayaenterprises.features.survey.api

import com.anayaenterprises.features.photoReg.api.GetUserListPhotoRegApi
import com.anayaenterprises.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}