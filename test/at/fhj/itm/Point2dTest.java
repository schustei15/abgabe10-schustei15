package at.fhj.itm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import at.fhj.itm.*;

public class Point2dTest {

	private	Point2d point2d;
	
	@Before
	public void setup(){
		point2d = new Point2d();
	}
	
	@Test
	public void testSetX(){
		point2d.setX(4.0);
		double get = point2d.getX();
		
		assertEquals(4.0, get, 0.000001);
	}

	@Test
	public void testSetY(){
		point2d.setY(7.0);
		double get = point2d.getY();
		
		assertEquals(7.0, get, 0.000001);
	}
	
	@Test
	public void testDistanceFrom(){
		point2d.setX(2.0);
		point2d.setY(1.0);
		
		Point2d point2d2 = new Point2d();
		
		point2d2.setX(0.0);
		point2d2.setY(0.0);
		
		double dist = point2d.distanceFrom(point2d2);
		
		assertEquals(2.236067978, dist, 0.000001);
	}

	@Test
	public void testDistanceFromOrigin(){
		point2d.setX(2.0);
		point2d.setY(3.0);
		
		double dist = point2d.distanceFromOrigin();
		
		assertEquals(3.605551275, dist, 0.000001);
	}
	
	@Test
	public void testSetXY(){
		point2d.setXY(6.0, 3.0);
		
		double getx = point2d.getX();
		double gety = point2d.getY();
		
		assertEquals(6.0, getx, 0.000001);
		assertEquals(3.0, gety, 0.000001);
	}
	
	@Test
	public void testtoString(){
		point2d.setXY(2.0, 0);
		
		String point = point2d.toString();
		
		assertEquals("x = 2.0 & y = 0.0", point);
	}
}
