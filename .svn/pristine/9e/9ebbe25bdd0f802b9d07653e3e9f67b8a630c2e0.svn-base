package at.fhj.itm;

public class CommandLinePointer extends Point2d{
	
	public int getMinArguments() {
		return 5;
	}

	
	public double pointerCommandLine(String[] args) throws NumberFormatException,
			IllegalArgumentException{
		if(args.length != getMinArguments()){
			throw new IllegalArgumentException("Wrong number of parameters");
		}
		
		String op = args[0].trim().toLowerCase();
		
		int numA = Integer.parseInt(args[1]);
		int numB = Integer.parseInt(args[2]);
		int numC = Integer.parseInt(args[3]);
		int numD = Integer.parseInt(args[4]);
		
		switch(op)
		{
			case "distance":
				double distance;
				Point2d point1 = new Point2d(numA, numB);
				Point2d point2 = new Point2d(numC, numD);
				return point1.distanceFrom(point2);
			default:
				throw new IllegalArgumentException(String.format("Unknown operator '%s'", op));
				
		}
		
	}

}
