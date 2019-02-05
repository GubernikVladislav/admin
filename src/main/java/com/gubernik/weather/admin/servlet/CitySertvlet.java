package com.gubernik.weather.admin.servlet;

import com.gubernik.weather.admin.servise.JmsService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CitySertvlet extends HttpServlet {

    private final JmsService jmsService;

    @Autowired
    public CitySertvlet(JmsService jmsService) {
        this.jmsService = jmsService;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cityName = req.getParameter("city");
        jmsService.sendJms(cityName);
    }
}
