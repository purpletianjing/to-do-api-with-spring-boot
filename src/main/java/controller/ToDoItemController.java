package controller;

import mapper.ToDoItemMapper;
import model.ToDoItem;
import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sql_session.SqlSessionBuilder;

import java.io.IOException;
import java.util.List;

@RestController
public class ToDoItemController {

    @RequestMapping("/todo_items")
    public List<ToDoItem> getAllToDoItems() throws IOException {
        SqlSession sqlSession = SqlSessionBuilder.getSqlSession();
        ToDoItemMapper itemMapper = sqlSession.getMapper(ToDoItemMapper.class);
        return itemMapper.getAllItems();
    }
}
