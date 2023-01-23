package com.example.task.controller;

import com.example.task.entity.TaskEntity;
import com.example.task.repository.TaskRepository;
import com.example.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
//@RequestMapping("tasks")
public class TaskController {

    private final TaskRepository taskRepository;

    @Autowired
    private TaskService taskService;
    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/showaddtask")
    public String addTask(Model model){

        //Adding Customer goes here.
        TaskEntity taskEntity = new TaskEntity();
        model.addAttribute("tasks", taskEntity);
    return "showaddtask";
    }

    @GetMapping("/")
    public String viewTask(Model model)
    {
        model.addAttribute("tasks",taskService.getAllTasks());
        return"index";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable(value = "id") long id)
    {
        this.taskService.deleteEntityById(id);
        //model.addAttribute("tasks", taskService.deleteEmployeeById(id));
        return"redirect:/";
    }
        //Save the Information to database
    @PostMapping("/saveTask")

    public String saveTask(@ModelAttribute("tasks") TaskEntity taskEntity){
        taskService.saveTask(taskEntity);
        return"redirect:/";
    }

    //Get the url associated with the edit

    @GetMapping("/showupdatetask/{id}")
    public String showUpdateTask(@PathVariable(value = "id") long id, Model model){
        //Get the Task from the TaskService

        TaskEntity taskEntity = taskService.getTaskById(id);

        //Set the Task as a model attribute to pre-populate the form
        model.addAttribute("tasks",taskEntity);
        return "edit_task";
    }

}
