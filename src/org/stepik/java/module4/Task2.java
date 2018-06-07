package org.stepik.java.module4;

import org.stepik.java.module4.task2helper.RobotConnection;
import org.stepik.java.module4.task2helper.RobotConnectionException;
import org.stepik.java.module4.task2helper.RobotConnectionManager;

public class Task2 {
    public static void main(String[] args) {
        RobotConnectionManager robotConnectionManager = () -> new RobotConnection() {
            @Override
            public void moveRobotTo(int x, int y) {
            }

            @Override
            public void close() {
            }
        };
        moveRobot(robotConnectionManager, 3, 5);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        for (int i = 0; i < 3; i++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException e) {
                e.printStackTrace();
            }
            if (i == 2) {
                throw new RobotConnectionException("");
            }
        }
    }
}