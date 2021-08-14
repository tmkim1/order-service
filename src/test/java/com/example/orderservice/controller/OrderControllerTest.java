package com.example.orderservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest
@Slf4j
class OrderControllerTest {

    @MockBean
    private OrderController orderController;

    @Test
    void status() {

        //given
        //parameter 전달
        //when
        String status = orderController.status();
        //then
        log.debug(status);
        //assert

    }

    @Test
    void createOrder() {

    }

    @Test
    void getOrder() {

    }
}