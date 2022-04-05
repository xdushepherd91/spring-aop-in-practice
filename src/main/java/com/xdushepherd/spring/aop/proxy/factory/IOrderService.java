package com.xdushepherd.spring.aop.proxy.factory;

/**
 * @author wangqianyi03
 * @date 2022/4/5 16:48
 */
public interface IOrderService {

    void createOrder(Long productId, Long count);

}
