import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import unq.Point;

public class PointTest {

	private Point point0;
	private Point pointx3y8;
	private Point pointx2y2;
	
	@Before
	public void setUp() throws Exception {
		point0 = new Point();
		pointx3y8 = new Point(3, 8);
		pointx2y2 = new Point(2, 2);
	}
	
	@Test
	public void test001_pointAtx0y0() {
		assertEquals(0, point0.getX());
		assertEquals(0, point0.getY());
	}
	
	@Test
	public void test002_pointAtx3y8() {
		assertEquals(3, pointx3y8.getX());
		assertEquals(8, pointx3y8.getY());
	}
	
	@Test
	public void test003_movePointTox5y7() {
		pointx3y8.movePointTo(5,7);
		
		assertEquals(5, pointx3y8.getX());
		assertEquals(7, pointx3y8.getY());
	}

	@Test
	public void test004_sumPoints() {
		pointx3y8.sumWithPoint(pointx2y2);
		assertEquals(5, pointx3y8.getX());
		assertEquals(10, pointx3y8.getY());
	}
}
