package miscFiles;

public class addVectors {
	public static double oldX1, oldX2, oldX3, oldY1, oldY2,oldY3, oldR1,oldR2,oldR3;
	public static double oldA1,oldA2,oldA3;
	public static double newX;
	public static double newY;
	public static double newRadius;
	public static double newAngle;
	public static double newScalar;
	public static double newCross;

	public static void addTwoCart(double x1, double x2, double y1, double y2){
		oldX1=x1;
		oldX2=x2;
		oldY1=y1;
		oldY2=y2;
		
		newX=x1+x2;
		newY=y1+y2;
		//take this out sson
		
	}
	
	public static void addThreeCart(double x1, double x2, double y1, double y2, 
			double x3, double y3){
		oldX1=x1;
		oldX2=x2;
		oldY1=y1;
		oldY2=y2;
		oldX3=x3;
		oldY3=y3;
		newX=x1+x2+x3;
		newY=y1+y2+y3;
	}
	
	public static void addTwoPolar(double r1, double a1, double r2, double a2){
		oldR1=r1;
		oldR2=r2;
		oldA1=a1;
		oldA2=a2;
		newX=r1*Math.cos(a1)+r2*Math.cos(a2);
		newY=r1*Math.sin(a1)+r2*Math.sin(a2);
		newRadius=Math.sqrt((newX*newX)+(newY*newY));
		newAngle =Math.atan(newY/newX);
	}
	public static void addThreePolar(double r1, double a1, double r2, double a2,
			double r3, double a3){
		oldR1=r1;
		oldR2=r2;
		oldA1=a1;
		oldA2=a2;
		oldR3=r3;
		oldA3=a3;
		newX=r1*Math.cos(a1)+r2*Math.cos(a2)+r3*Math.cos(a3);
		newY=r1*Math.sin(a1)+r2*Math.sin(a2)+r3*Math.sin(a3);
		newRadius=Math.sqrt((newX*newX)+(newY*newY));
		newAngle =Math.atan(newY/newX);
		
	}
	
	public static double cartScalar(double x1, double x2, double y1, double y2){
		oldX1=x1;
		oldX2=x2;
		oldY1=y1;
		oldY2=y2;
		newScalar=(x1*x2)+(y1*y2);
		return newScalar;
	}
	
	public double polarScalar(double r1, double a1, double r2, double a2){
		oldR1=r1;
		oldR2=r2;
		oldA1=a1;
		oldA2=a2;
		newScalar=(r1*Math.cos(a1)*r2*Math.cos(a2))+(r1*Math.sin(a1)*r2*Math.sin(a2));
		return newScalar;
	}
	
	public static void cartVectProduct(double x1, double x2, double y1, double y2){
		oldX1=x1;
		oldX2=x2;
		oldY1=y1;
		oldY2=y2;
		newCross=(x1*y2)-(x2*y1);
	
	}
	
	public static void polarVectProduct(double r1, double a1, double r2, double a2){
		oldR1=r1;
		oldR2=r2;
		oldA1=a1;
		oldA2=a2;
		newCross=(r1*Math.cos(a1)*r2*Math.sin(a2))-(r1*Math.sin(a1)*r2*Math.cos(a2));
		
	}
}
