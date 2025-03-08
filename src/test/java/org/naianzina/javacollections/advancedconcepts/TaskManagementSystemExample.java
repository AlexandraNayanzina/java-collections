package org.naianzina.javacollections.advancedconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Task{

    String name;
    boolean isComplete;

    Task(String name){
        this.name = name;
        this.isComplete = false;
    }

    @Override
    public String toString(){
        return name + (isComplete? " Completed " : "");
    }

}

public class TaskManagementSystemExample {

    public static void main(String [] args){

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1"));
        tasks.add(new Task("Task 2"));
        tasks.add(new Task("Task 3"));
        tasks.add(new Task("Task 4"));
        ListIterator<Task> tasksListIterator =  tasks.listIterator();

        while(tasksListIterator.hasNext()){
            Task task = tasksListIterator.next();

            // mark Task 2 as completed
            if(task.name.equals("Task 2")){
                task.isComplete = true;
            }

            if(task.name.equals("Task 1")){
                tasksListIterator.add(new Task("Task 1.1"));
            }

        }

        for (Task task:tasks){
            System.out.println(task);
        }



    }
}
