package org.stepik.java.module3;

import org.stepik.java.module3.task1helper.Direction;
import org.stepik.java.module3.task1helper.Robot;

public class Task1 {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.DOWN, 0, 0);
        moveRobot(robot, 3, 3);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int getX = robot.getX();
        int getY = robot.getY();
        for (int k = 0; k < 4; k++) {
            switch (robot.getDirection()) {
                case UP: {
                    if (toY > getY) {
                        for (int i = 0; i < Math.abs(toY - getY); i++) {
                            robot.stepForward();
                        }
                    }
                    robot.turnRight();
                    break;
                }
                case RIGHT: {
                    if (toX > getX) {
                        for (int i = 0; i < Math.abs(toX - getX); i++) {
                            robot.stepForward();
                        }
                    }
                    robot.turnRight();
                    break;
                }
                case DOWN: {
                    if (toY < getY) {
                        for (int i = 0; i < Math.abs(getY - toY); i++) {
                            robot.stepForward();
                        }
                    }
                    robot.turnRight();
                    break;
                }
                case LEFT: {
                    if (toX < getX) {
                        for (int i = 0; i < Math.abs(getX - toX); i++) {
                            robot.stepForward();
                        }
                    }
                    robot.turnRight();
                    break;
                }
            }
        }

        System.out.println(robot.getX() + " " + robot.getY());
    }
}
