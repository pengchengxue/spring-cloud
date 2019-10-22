package com.macro.mall.tiny.component;

import com.macro.mall.tiny.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @Description:    取消订单消息的处理者
 * @Author:         pcx
 * @CreateDate:     2019/8/5 15:31
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/5 15:31
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Component
public class CancelOrderReceiver {

    private static Logger LOGGER =LoggerFactory.getLogger(CancelOrderReceiver.class);
    @Autowired
    private OmsPortalOrderService portalOrderService;
    @RabbitHandler
    public void handle(Long orderId){
        LOGGER.info("receive delay message orderId:{}",orderId);
        portalOrderService.cancelOrder(orderId);
    }

}
