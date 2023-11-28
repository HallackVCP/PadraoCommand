package org.example;

import java.util.ArrayList;
import java.util.List;

public class WorkQueue {
    private List<ITask> tasks = new ArrayList<>();

    public void executarTarefa(ITask task) {
        this.tasks.add(task);
        task.registrar();
    }

    public void cancelarUltimaTarefa() {
        if (tasks.size() != 0) {
            ITask tarefa = this.tasks.get(this.tasks.size() - 1);
            tarefa.cancelar();
            this.tasks.remove(this.tasks.size() - 1);
        }
    }
}
