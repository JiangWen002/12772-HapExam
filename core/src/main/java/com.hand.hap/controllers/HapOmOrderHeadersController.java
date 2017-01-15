package com.hand.hap.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.impl.RequestHelper;
import com.hand.hap.sale.dto.HapOmOrderHeaders;
import com.hand.hap.service.IHapOmOrderHeadersService;
import com.hand.hap.service.impl.HapOmOrderHeadersImpl;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Javon on 2017/1/14.
 */


@Controller
@RequestMapping("/HapOmOrderHeaders")
public class HapOmOrderHeadersController {
    @Autowired
    public IHapOmOrderHeadersService hapOmOrderHeaders;
    @RequestMapping("/order")
    @ResponseBody
    public List<HapOmOrderHeaders> query(HttpRequest r,
                                        HapOmOrderHeaders order,
                                        @RequestParam(name = "page") int page,
                                        @RequestParam(name = "pageSize") int pageSize
    ){
        IRequest I = (IRequest)r;
       return hapOmOrderHeaders.select(I,order, page,pageSize );

    }

}
