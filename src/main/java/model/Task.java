package model;

import javax.persistence.*;

@Entity
@Table(name="Task_Table")
public class Task {

    @Id
    @GeneratedValue
    @Column(name="task_id")
    private long taskId;

    @Column(name="task_name")
    private String taskName;

    @Column(name="task_location")
    private String taskLocation;

    public Task() {}

    public Task(long taskId, String taskName, String taskLocation) {
        super();
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskLocation = taskLocation;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskLocation() {
        return taskLocation;
    }

    public void setTaskLocation(String taskLocation) {
        this.taskLocation = taskLocation;
    }

    @Override
    public String toString() {
        return "Task [taskId=" + taskId + ", taskName=" + taskName + ", taskLocation=" + taskLocation + "]";
    }
}
