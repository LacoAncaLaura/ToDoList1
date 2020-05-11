package org.fasttrackit.transfer;

public class UpdateTaskRequest {
    private boolean done;

    @Override
    public String toString() {
        return "UpdateTaskRequest{" +
                "done=" + done +
                '}';
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
