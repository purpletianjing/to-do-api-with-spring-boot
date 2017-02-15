package controller;

import model.ToDoItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoItemController {

    @RequestMapping("/todoitems")
    public List<ToDoItem> getAllToDoItems() {
        return null;
    }
}
