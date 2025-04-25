package org.howard.edu.lspfinal.question2;

/**
 * exception thrown when a duplicate of task is added to list
 */
public class DuplicateTaskException extends Exception {
    public DuplicateTaskException(String message) {
        super(message);
    }
}
