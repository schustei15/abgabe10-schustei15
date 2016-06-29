package at.fhj.itm;

/**
 * zum setzen zweidimensionalen Punkten und berchenen von Distanzen dieser
 * @author Ingo
 *
 */
class Point2d {
	private boolean debug;
	private double x = 0;
	private double y = 0;
	private double erg;

	/**
	 * erstellt einen Point mit x und y
	 * @param px uebergibt den x Wert fuer den Point
	 * @param py uebergibt den y Wert fuer den Point
	 */
	public Point2d (double px, double py)
	{ 
		this.x = px;
		this.y = py;
	}

	/**
	 * erstellt einen Point mit x/y 0
	 */
	public Point2d () 
	{	
		this.x = 0;
		this.y = 0;
	}

	/**
	 * erstellt Point mit Point
	 * @param pt uebergibt einen Point zum erstellen des Points
	 */
	public Point2d (Point2d pt) 
	{	
		x = pt.x;
		y = pt.y;
	}

	/**
	 * wenn Debug aktiv, ausgabe der Werte
	 * @param s ueber gibt Info fuer Debug
	 */
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	/**
	 * de/aktiviert den Debug
	 * @param b Boolean fuer Debug
	 */
	public void setDebug (boolean b) {
		debug = b;
	}

	/**
	 * setzt den x Wert
	 * @param px neuer x Wert
	 */
	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		x = px;
	}

	/**
	 * Getter fuer x
	 * @return x Wert
	 */
	public double getX() {
		return x;
	}

	/**
	 * setzt den y Wert
	 * @param py neuer y Wert
	 */
	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		y = py;
	}

	/**
	 * Getter fuer y
	 * @return y Wert
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * setzt x und y Wert
	 * @param px neuer x Wert
	 * @param py neuer y Wert
	 */
	public void setXY(double px, double py) {
		dprint ("setX(): Changing value of X from " + x + " to " + px + " and setY(): Changing value of Y from " + y + " to " + py );
		x = px;
		y = py;
	}
	
	/**
	 * bestimmt Distanz zu anderem Punkt
	 * @param pt anderer Punkt
	 * @return Distanz
	 */
	public double distanceFrom (Point2d pt) {
		double xx = x - pt.x;
		
		double yy = y - pt.y;
		
		erg = Math.sqrt(Math.pow(xx, 2) + Math.pow(yy, 2));
		
		return erg;
	}

	/**
	 * bestimmt Distanz vom Nullpunkt
	 * @return Distanz
	 */
	public double distanceFromOrigin () {
		erg = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		return erg;
	}
	
	/**
	 * umwandeln des Points in einen String
	 */
	public String toString() {
		String point = "x = " + x + " & y = " + y;
		return point;
	}
}

