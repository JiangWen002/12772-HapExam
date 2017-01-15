package com.hand.hap.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.sale.dto.Order;
import com.hand.hap.service.IOrderService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Javon on 2017/1/15.
 */

public class OrderController extends BaseController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping(path = "/order",method = RequestMethod.POST)
    public ResponseData select(HttpServletRequest request, Order order,
                               @RequestParam(name = "page",required = false,defaultValue = "1")int page,
                               @RequestParam(name = "pageSize",required = false,defaultValue = "10")int pageSize){
        IRequest requestContext = this.createRequestContext(request);
        List<Order> orders = orderService.selectOrder(requestContext,order,page,pageSize);
        ResponseData responseData = new ResponseData(orders);

        return responseData;
    }
}
