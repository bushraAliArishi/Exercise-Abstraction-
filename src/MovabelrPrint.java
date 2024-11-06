public class MovabelrPrint implements Movable {
    private int x,y,xSpeed,ySpeed;

    public MovabelrPrint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y-=ySpeed;

    }

    @Override
    public void moveDown() {
        y+=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    @Override
    public String toString() {
        return " x=" + x +" y=" + y +" xSpeed=" + xSpeed +" ySpeed=" + ySpeed;

    }
}
