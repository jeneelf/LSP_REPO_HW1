package org.howard.edu.lsp.midterm.question5;

public class Movie {
    package org.howard.edu.lsp.midterm.question5;

    public class Music implements Streamable {
        private String movieTitle;//instance variable
    
        public Music(String movieTitle) {
            this.movieTitle = movieTitle;
        }//constructor  
        void play() {
            System.out.println("Playing movie: " + movieTitle);
        }
        void pause() {
            System.out.println("Pausing movie: " + movieTitle);
        }
        void rewind() {
            System.out.println("Rewinding movie: " + movieTitle);
        }
        void fastForward() {
            System.out.println("Fast forwarding movie: " + movieTitle);
        }
        void skip() {
            System.out.println("Skipping movie: " + movieTitle);
        }
        void stop() {
            System.out.println("Stopping movie: " + movieTitle);
    }
      
}
