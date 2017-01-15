package com.hand.hap.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.sale.dto.Order;
import com.hand.hap.system.service.IBaseService;

import java.util.List;

/**
 * Created by Javon on 2017/1/15.
 */
public interface IOrderService extends ProxySelf<IOrderService>, IBaseService<Order> {
    public List<Order> selectOrder(IRequest requestContext, Order order, int page, int pageSize);
}
