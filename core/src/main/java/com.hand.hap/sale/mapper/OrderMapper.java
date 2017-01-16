package com.hand.hap.sale.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.sale.dto.Order;

import java.util.List;

/**
 * Created by Javon on 2017/1/15.
 */
public interface OrderMapper extends Mapper<Order> {

    List<Order> selectByCondition(Order o);
}
