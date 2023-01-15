package game;

import javax.swing.*;

/**
 * This Class is the Main controlling class of the game. It will update
 * the snake, and keep the game going.
 */
public class Control implements Runnable {

    //State and View Fields
    private State state;
    private View view;

    /**
     * This method calls the run method. All work in constructing the object will be
     * done in that method.
     */
    public Control() {
        SwingUtilities.invokeLater(this);
    }

    /**
     * This method Build the control object
     */
    @Override
    public void run() {
        //Making view and state objects
        view = new View(this, state);
        state = new State(this, view);

    }
}
