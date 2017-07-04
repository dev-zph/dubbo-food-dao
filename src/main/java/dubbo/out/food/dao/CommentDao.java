package dubbo.out.food.dao;

import org.springframework.stereotype.Repository;

import dubbo.out.food.model.Comment;

@Repository("commentDao")
public interface CommentDao {
	int deleteByPrimaryKey(Integer id);

	int insert(Comment record);

	int insertSelective(Comment record);

	Comment selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Comment record);

	int updateByPrimaryKeyWithBLOBs(Comment record);

	int updateByPrimaryKey(Comment record);
}