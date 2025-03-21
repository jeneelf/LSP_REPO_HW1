package org.howard.edu.lsp.midterm.question5;

public class Music implements Streamable {
    void play() {
        System.out.println("Playing " );
    }
    void pause() {
        System.out.println("Pausing");
    }
    void rewind() {
        System.out.println("Rewinding");
    }
    void fastForward() {
        System.out.println("Fast forwarding");
    }
    void skip() {
        System.out.println("Skipping");
    }
    void stop() {
        System.out.println("Stopping");
    }
    
}
