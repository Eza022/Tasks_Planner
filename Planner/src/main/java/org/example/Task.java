package org.example;

public class Task {
    private String title;
    private String description;
    private String startTime;
    private String endTime;
    private int priority;

    // Constructors, getters, and setters
    public Task(String title, String description, String startTime, String endTime, int priority) {
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority=priority;

    }

    public void setTittle(String newTitle){
        this.title= newTitle;

    }
    public String getTitle(){
        return title;
    }

    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    public String getDescription(){
        return description;
    }
    public void setStartTime(String newStartTime){
        this.startTime=newStartTime;
    }
    public String getStartTime(){
        return startTime;
    }

    public void setEndTime(String newEndTime){
        this.endTime= newEndTime;
    }

    public String getEndTime(){
        return endTime;
    }

    public void setPriority(int newPriority){
        this.priority = newPriority;
    }

    public int getPriority(){
        return priority;
    }
}

