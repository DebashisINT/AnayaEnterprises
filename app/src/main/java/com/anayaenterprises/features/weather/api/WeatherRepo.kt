package com.anayaenterprises.features.weather.api

import com.anayaenterprises.base.BaseResponse
import com.anayaenterprises.features.task.api.TaskApi
import com.anayaenterprises.features.task.model.AddTaskInputModel
import com.anayaenterprises.features.weather.model.ForeCastAPIResponse
import com.anayaenterprises.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}