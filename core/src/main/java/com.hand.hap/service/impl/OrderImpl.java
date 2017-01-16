package com.hand.hap.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.sale.dto.Order;
import com.hand.hap.sale.mapper.OrderMapper;
import com.hand.hap.service.IOrderService;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Javon on 2017/1/15.
 */
@Service
public class OrderImpl extends BaseServiceImpl<Order> implements IOrderService{
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectOrder(IRequest requestContext, Order order, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return orderMapper.selectByCondition(order);
    }
}
