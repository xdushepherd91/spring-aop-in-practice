package com.xdushepherd.spring.aop.proxy.factory;

/**
 * @author wangqianyi03
 * @date 2022/4/5 16:50
 */
public class DefaultOrderService implements IOrderService{

    @Override
    public void createOrder(Long productId, Long count) {
        System.out.printf("product(%d) is sell%n", productId);
    }
}
