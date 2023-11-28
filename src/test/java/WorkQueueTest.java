import org.example.Task;
import org.example.TaskReceiver;
import org.example.TaskRemover;
import org.example.WorkQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkQueueTest {

    WorkQueue workQueue;

    Task task;

    @BeforeEach
    void setup(){
        workQueue = new WorkQueue();
        task = new Task(1);
    }

    @Test
    void deveReceberTask(){
        TaskReceiver taskReceiver = new TaskReceiver(task);
        workQueue.executarTarefa(taskReceiver);
        assertEquals("Tarefa recebida", task.getStatus());
    }
    @Test
    void deveRemoverTask(){
        TaskRemover taskRemover = new TaskRemover(task);
        workQueue.executarTarefa(taskRemover);
        assertEquals("Tarefa removida", task.getStatus());
    }


    @Test
    void deveCancelarRemoverTask(){
        TaskReceiver taskReceiver = new TaskReceiver(task);
        TaskRemover taskRemover = new TaskRemover(task);
        workQueue.executarTarefa(taskReceiver);
        workQueue.executarTarefa(taskRemover);
        workQueue.cancelarUltimaTarefa();

        assertEquals("Tarefa recebida", task.getStatus());
    }

    @Test
    void deveCancelarReceberTask(){
        TaskReceiver taskReceiver = new TaskReceiver(task);
        TaskRemover taskRemover = new TaskRemover(task);
        workQueue.executarTarefa(taskRemover);
        workQueue.executarTarefa(taskReceiver);
        workQueue.cancelarUltimaTarefa();

        assertEquals("Tarefa removida", task.getStatus());
    }
}
