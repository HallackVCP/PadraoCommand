package org.example;

public class TaskReceiver implements ITask {

    private Task task;

    public TaskReceiver(Task task) {
        this.task = task;
    }
    @Override
    public void registrar() {
        this.task.receberTarefa();
    }

    @Override
    public void cancelar() {
        this.task.removerTarefa();
    }
}
