package dubbo.out.food.dao;

import org.springframework.stereotype.Repository;

import dubbo.out.food.model.Sender;

@Repository("senderDao")
public interface SenderDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Sender record);

    int insertSelective(Sender record);

    Sender selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sender record);

    int updateByPrimaryKey(Sender record);
}