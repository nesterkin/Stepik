package org.stepik.java.module3.task1helper;

import static org.stepik.java.module3.task1helper.Direction.*;

public class Robot {

    private int x;
    private int y;
    private Direction mDirection;

    public Robot(Direction direction, int x, int y) {
        mDirection = direction;
        this.x = x;
        this.y = y;
    }

    public Direction getDirection() {
        return mDirection;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            case UP: {
                mDirection = LEFT;
                break;
            }
            case LEFT: {
                mDirection = DOWN;
                break;
            }
            case DOWN: {
                mDirection = RIGHT;
                break;
            }
            case RIGHT: {
                mDirection = UP;
                break;
            }
        }
    }

    public void turnRight() {
        switch (getDirection()) {
            case UP: {
                mDirection = RIGHT;
                break;
            }
            case RIGHT: {
                mDirection = DOWN;
                break;
            }
            case DOWN: {
                mDirection = LEFT;
                break;
            }
            case LEFT: {
                mDirection = UP;
                break;
            }
        }
    }

    public void stepForward() {
        switch (getDirection()) {
            case UP: {
                y++;
                break;
            }
            case RIGHT: {
                x++;
                break;
            }
            case DOWN: {
                y--;
                break;
            }
            case LEFT: {
                x--;
                break;
            }
        }
    }
}