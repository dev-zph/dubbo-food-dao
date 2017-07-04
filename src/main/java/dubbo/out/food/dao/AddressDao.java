package dubbo.out.food.dao;

import org.springframework.stereotype.Repository;

import dubbo.out.food.model.Address;

@Repository("addressDao")
public interface AddressDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}