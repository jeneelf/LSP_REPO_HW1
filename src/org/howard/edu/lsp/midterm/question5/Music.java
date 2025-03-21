package org.howard.edu.lsp.midterm.question5;

public class Music implements StreamingService {
    private String songName;//instance variable

    public Music(String songName) {
        this.songName = songName;
    }//constructor
    void play() {
        System.out.println("Playing song: " + songName);
    }

    void pause() {
        System.out.println("Pausing song: " + songName);
    }
    void rewind() {
        System.out.println("Rewinding song: " + songName);
    }

    void fastForward() {
        System.out.println("Fast forwarding song: " + songName);
    }
    void skip() {
        System.out.println("Skipping song: " + songName);
    }
    void stop() {
        System.out.println("Stopping song: " + songName);
    }
  

}
