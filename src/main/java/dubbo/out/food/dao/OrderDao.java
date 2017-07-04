package dubbo.out.food.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import dubbo.out.food.model.Order;
import dubbo.out.food.querybean.OrderDetailBean;

@Repository("orderDao")
public interface OrderDao {

    int insert(Order record);

    Order selectByKey(Integer id);

    int updateOrder(Order record);

    int updateByPrimaryKey(Order record);
    
    List<Order> getOrders(Map<String, Object> params);
    
    Integer getOrdersCount(Map<String, Object> params);
    /**
	 * 查看订单详情
	 * @param params
	 * @return
	 */
	List<OrderDetailBean> getOrderDetailList(@Param(value = "id")Integer id);
	/**
	 * 找出�?量最好的前n家的  shop_id list
	 * @param count
	 * @return
	 */
	List<Integer> selectOrderMastShops(@Param(value = "count") Integer count);
	/**找出评价�?高的几家�? �? shop_id 的list
	 * @param count
	 * @return
	 */
	List<Integer> selectOrderGoodestShops(@Param(value = "count") Integer count);
} 