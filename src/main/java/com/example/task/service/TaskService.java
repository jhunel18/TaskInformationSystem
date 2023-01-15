package com.example.task.service;

import com.example.task.entity.TaskEntity;
import com.example.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

      //Get All the Task
    public Iterable<TaskEntity> getAllTasks(){
        return taskRepository.findAll();
    }

    //Delete Task from Task Directory
    public void deleteEntityById(long id) {
        this.taskRepository.deleteById(id);
    }

    public void saveTask(TaskEntity taskEntity){
        this.taskRepository.save(taskEntity);
    }
    public TaskEntity getTaskById(long id){
        Optional <TaskEntity> optional = taskRepository.findById(id);
        TaskEntity taskEntity = null;

        if(optional.isPresent()){
            taskEntity = optional.get();
        }else{
            throw  new RuntimeException("Task is not found for id ::" + id);
        }
        return taskEntity;
    }

}
