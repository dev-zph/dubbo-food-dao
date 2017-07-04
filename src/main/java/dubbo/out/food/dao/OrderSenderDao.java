package dubbo.out.food.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import dubbo.out.food.model.OrderSender;
import dubbo.out.food.querybean.OrderBeanForSender;

@Repository("orderSenderDao")
public interface OrderSenderDao {

    int insert(OrderSender record);

    OrderSender selectByKey(Integer id);
    /**
     * 根据orderId查询 接单记录
     * @param orderId
     * @return
     */
    OrderSender getSenderOrderByOrderId(@Param(value = "orderId") Integer orderId);
    
    /**
     * 
     * @param param
     * @return
     */
    List<OrderBeanForSender> getOrderListForSender(Map<String, Object> param);
}