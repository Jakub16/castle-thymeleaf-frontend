package com.castle.thymeleaffrontend.controllers;

import com.castle.webapi.services.IWeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ThymeleafController {

    private final IWeatherService weatherService;

    @GetMapping("/")
    public String homePageDailyForecast(Model model) {
        model.addAttribute("weather",weatherService.getLatestCurrentWeatherDto().getBody());
        model.addAttribute("dailyWeather", weatherService.getLatestDailyWeatherDto().getBody());
        return "homepage_daily";
    }

    @GetMapping("/hourly_forecast")
    public String homePageHourlyForecast(Model model) {
        model.addAttribute("weather",weatherService.getLatestCurrentWeatherDto().getBody());
        model.addAttribute("hourlyWeather", weatherService.getLatestHourlyWeatherDto().getBody());
        return "homepage_hourly";
    }
}
