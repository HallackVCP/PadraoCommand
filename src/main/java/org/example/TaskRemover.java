package org.example;

public class TaskRemover implements ITask {

    private Task task;

    public TaskRemover(Task task) {
        this.task = task;
    }

    @Override
    public void registrar() {
        this.task.removerTarefa();
    }

    @Override
    public void cancelar() {
        this.task.receberTarefa();
    }
}
