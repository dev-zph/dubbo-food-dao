/**
 * 
 */
package dubbo.out.food.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import dubbo.out.food.model.CartItem;


/**
 * 购物车dao�?
 * 
 * @author 陈佳
 * @createTime 2017�?1�?23�? 上午10:39:47
 * 
 */
@Repository("cartItemDao")
public interface CartItemDao {
	/**
	 * 根据id查询cartItem对象
	 * 
	 * @param key
	 * @return
	 */
	CartItem selectById(Integer key);

	/**
	 * 根绝用户Id查询 该用户的�?有购物车里面的商�?
	 * 
	 * @param userId
	 * @return
	 */
	List<CartItem> selectByUserId(Integer userId);

	/**
	 * 插入
	 * 
	 * @param cartItem
	 */
	void insertCartItem(CartItem cartItem);

	/**
	 * 更新
	 * 
	 * @param cartItem
	 */
	void updateCartItem(CartItem cartItem);

	/**
	 * 查询符合条件的所有的对象集合
	 * 
	 * @param param
	 * @return
	 */
	List<CartItem> getCartItems(Map<String, Object> param);

	/**
	 * 查询符合条件的�?�记录条�?
	 * 
	 * @param param
	 * @return
	 */
	Integer getCartItemCount(Map<String, Object> param);

	/**
	 * 查询下单页面，购物车详情页面的数�?
	 * 
	 * @param param
	 * @return
	 */
	List<CartItem> getCartDetail(Map<String, Object> param);

	/**
	 * 查询购物车�?�计金额
	 * 
	 * @param param
	 * @return
	 */
	BigDecimal getCartTotalMoney(Map<String, Object> param);

	/**
	 * 根据userId 清空其购物车
	 * 
	 * @param userId
	 */
	void emptyCartItem(Integer userId);
}
