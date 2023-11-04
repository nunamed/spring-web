package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository('commentDao')
@Mapper
public interface CommentDao {
    public Comment selectCommentById(Integer id);
    public List<Comment> selectAllComment();
}
