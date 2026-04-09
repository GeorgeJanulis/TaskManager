package com.yourname.taskmanager.service;

import com.yourname.taskmanager.model.Task;
import com.yourname.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> findAll() { return repository.findAll(); }

    public void save(String title) {
        Task task = new Task();
        task.setTitle(title);
        repository.save(task);
    }
}