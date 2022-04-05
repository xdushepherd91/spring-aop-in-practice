package com.xdushepherd.spring.aop.proxy.factory;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author wangqianyi03
 * @date 2022/4/5 16:34
 */
public class Main {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new AccessLogAdvice());
        proxyFactory.addInterface(IOrderService.class);
        proxyFactory.setTarget(new DefaultOrderService());
        IOrderService proxy = (IOrderService) proxyFactory.getProxy();
        proxy.createOrder(1L, 2L);
    }
}
