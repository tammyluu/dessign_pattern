package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlayListControl {
    private List<Command> history = new ArrayList<>();

    public void executeCommand (Command command) {
        command.execute();
        history.add(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.remove(history.size() - 1);
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }
}
