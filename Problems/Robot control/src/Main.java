class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
robot.stepForward();
        // your implementation here
        int pozycjaPoczatkowaX;
        int pozycjaPoczatkowaY;

        pozycjaPoczatkowaX = robot.getX();
        pozycjaPoczatkowaY = robot.getY();
        int lokalizacjaPoX = pozycjaPoczatkowaX - toX;
        int lokalizacjaPoY = pozycjaPoczatkowaY - toY;


        while (pozycjaPoczatkowaX != toX || pozycjaPoczatkowaY != toY) {
            if (lokalizacjaPoX != 0) {
                if (lokalizacjaPoX > 0) {
                    //trzeba zrobic zmiane kierunku na gora
                    while (robot.getDirection() != Direction.LEFT) {
                        if (robot.getDirection() == Direction.UP) {
                            robot.turnLeft();
                        } else if (robot.getDirection() == Direction.DOWN) {
                            robot.turnRight();
                        } else if (robot.getDirection() == Direction.RIGHT) {
                            robot.turnRight();
                        }
                    }

                }
                if (lokalizacjaPoX < 0) {
                    //trzeba zrobic zmiane kierunku na dol
                    while (robot.getDirection() != Direction.RIGHT) {
                        if (robot.getDirection() == Direction.LEFT) {
                            robot.turnLeft();
                        } else if (robot.getDirection() == Direction.UP) {
                            robot.turnRight();
                        } else if (robot.getDirection() == Direction.DOWN) {
                            robot.turnLeft();
                        }
                    }
                }
//mamy obroconego robota

                while (robot.getX()!=toX)
                {
                    robot.stepForward();
                }
            }
            //teraz czas na Y


            if (pozycjaPoczatkowaY != 0) {
                if (lokalizacjaPoY > 0) {
                    while (robot.getDirection() != Direction.DOWN) {
                        if (robot.getDirection() == Direction.RIGHT) {
                            robot.turnRight();
                        } else if (robot.getDirection() == Direction.UP) {
                            robot.turnRight();
                        } else if (robot.getDirection() == Direction.LEFT) {
                            robot.turnLeft();
                        }


                    }

                } else if (lokalizacjaPoY < 0) {
                    while (robot.getDirection() != Direction.UP) {


                        if (robot.getDirection() == Direction.DOWN) {
                            robot.turnRight();
                        } else if (robot.getDirection() == Direction.LEFT) {
                            robot.turnRight();
                        } else if (robot.getDirection() == Direction.RIGHT) {
                            robot.turnLeft();
                        }

                    }
//mamy oprocony

                    }

               while (robot.getY()!=toY)
               {
                   robot.stepForward();
               }

            }


        }


    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


public class Main {

    public static void main (String [] args) {
        // Pozycja i kierunek początkowy robota
        Robot robot = new Robot (0, 0, Direction.UP);

        // Pozycja celu
        Move.moveRobot (robot, 0, 10);

        // Nowa pozycja robota po wykonaniu funkcji ruchu
        System.out.println (robot.getX () + " " + robot.getY ());
    }
}

