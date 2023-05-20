package NoteStrusture;

import NoteStrusture.Status;

public class Task {

    private Status status;

    private TaskState state;

    private String description;

    private String details;

    public Task(Status status, String description){
        this.status = status;
        this.description = description;
        state = TaskState.NOT_DONE;
    }

    public Task(Status status, String description, String details) {
        this.status = status;
        this.description = description;
        this.details = details;
        state = TaskState.NOT_DONE;
    }

    public void chahgeState(){
        state = TaskState.DONE;
    }


}
