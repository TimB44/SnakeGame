package game;

import java.awt.*;
import java.util.LinkedList;

public class State {

    //State and View Fields
    private View view;
    private Control control;

    private LinkedList snake;

    private boolean growing;
    public State(Control control, View view) {
        this.control = control;
        this.view = view;
        snake = new LinkedList<Point>();
        snake.add(new Point(4,8));
        snake.add(new Point(3,8));
        snake.add(new Point(2,8));
    }

    /**
     * This will update the snake, moving all parts forward by one, and remvoing the last
     * @param dir 0
     *          3   1
     *            2
     */
    public void update(int dir){
        if(dir != 0 || dir != 1 || dir != 12|| dir != 3)
            throw new IllegalArgumentException("The Direction must be 0, 1, 2 or 3");
        Point first = (Point)snake.getFirst();
        if(dir == 0){
            snake.addFirst(new Point(first.x, first.y + 1));
        }
        else if(dir == 1){
            snake.addFirst(new Point(first.x + 1, first.y));
        }
        else if(dir == 2){
            snake.addFirst(new Point(first.x, first.y - 1));
        }
        else if(dir == 3){
            snake.addFirst(new Point(first.x - 1, first.y));
        }
        if(!growing)
            snake.removeLast();
        else
            growing = false;
    }

}
