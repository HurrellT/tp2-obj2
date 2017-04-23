package unq;

public class Point {
	
	private Integer x;
	private Integer y;
	
	public Point(int x, int y) {
		setXY(x, y);
	}

	private void setXY(int x, int y) {
		setX(x);
		setY(y);
	}

	private void setX(int x) {
		this.x = x;
	}

	private void setY(int y) {
		this.y = y;
	}

	public Point() {
		setXY(0, 0);
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void movePointTo(int x, int y) {
		setXY(x, y);		
	}

	public void sumWithPoint(Point pointx2y2) {
		setXY(x + pointx2y2.getX(), y + pointx2y2.getY());		
	}
}
