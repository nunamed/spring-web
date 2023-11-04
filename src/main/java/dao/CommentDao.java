package dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import POJO.Comment;
@Repository("commentDao")
@Mapper
public interface CommentDao {
    public Comment selectCommentById(Integer id);
    public List<Comment> selectAllComment();
}
