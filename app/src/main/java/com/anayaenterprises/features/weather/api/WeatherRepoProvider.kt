package com.anayaenterprises.features.weather.api

import com.anayaenterprises.features.task.api.TaskApi
import com.anayaenterprises.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}