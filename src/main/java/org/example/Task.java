package org.example;

public class Task {

    private Integer id;

    private String status;


    public Task(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void receberTarefa(){
        this.setStatus("Tarefa recebida");
    }

    public void removerTarefa(){
        this.setStatus("Tarefa removida");
    }
}
