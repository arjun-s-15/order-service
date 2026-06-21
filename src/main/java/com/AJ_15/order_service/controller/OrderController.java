package com.AJ_15.order_service.controller;

import com.AJ_15.order_service.dto.OrderRequest;
import com.AJ_15.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.createOrder(orderRequest);
        log.info("Order {} created successfully",orderRequest);
        return "Order Placed Successfully";
    }
}
