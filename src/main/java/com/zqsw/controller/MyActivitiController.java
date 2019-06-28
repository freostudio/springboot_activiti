package com.zqsw.controller;

import com.zqsw.service.MyActivitiService;
import org.springframework.web.bind.annotation.RestController;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/*****
 *
 * MyActivitiController 
 * @author ：Liye /ZQSW
 * @date ：2019/6/17 9:17
 *  类功能描述 :
 *
 *****/
@RestController
public class MyActivitiController {
    @Autowired
    private MyActivitiService myService;

    @RequestMapping(value = "/process")
    public String startProcessInstance(@RequestParam String assignee) {
        return myService.startProcess(assignee);
    }

    @RequestMapping(value = "/tasks/{assignee}")
    public String getTasks(@PathVariable("assignee") String assignee) {
        List<Task> tasks = myService.getTasks(assignee);
        return tasks.toString();
    }

    @RequestMapping(value = "/completetask")
    public String completeTask(@RequestParam String id) {
        myService.completeTask(id);
        return "Task with id " + id + " has been completed!";
    }
}
