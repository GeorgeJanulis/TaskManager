@Component
public class TaskUIController {

    @FXML private ListView<String> taskListView;
    @FXML private TextField taskInput;

    @Autowired
    private TaskService taskService; // Inject the Service

    @FXML
    public void initialize() {
        // Load existing tasks from H2 on startup
        refreshTasks();
    }

    @FXML
    public void handleAddTask() {
        String text = taskInput.getText();
        if (!text.isEmpty()) {
            taskService.save(text); // Save to DB
            taskInput.clear();
            refreshTasks(); // Update the UI list
        }
    }

    private void refreshTasks() {
        taskListView.getItems().clear();
        taskService.findAll().forEach(task ->
                taskListView.getItems().add(task.getTitle())
        );
    }
}