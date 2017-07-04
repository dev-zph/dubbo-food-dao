package dubbo.out.food.dao;

import org.springframework.stereotype.Repository;

import dubbo.out.food.model.ShopSender;

@Repository("shopSenderDao")
public interface ShopSenderDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopSender record);

    int insertSelective(ShopSender record);

    ShopSender selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopSender record);

    int updateByPrimaryKey(ShopSender record);
}