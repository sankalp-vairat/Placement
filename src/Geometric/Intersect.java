package Geometric;

public class Intersect {

	public static int clockwise=1;
	public static int antiClockwise=-1;
	public static int colinear=0;

	public static int max(int a,int b)
	{
		return (a>b?a:b);
	}

	public static int min(int a,int b)
	{
		return (a>b?b:a);
	}

	public static boolean onSegment(Point p1,Point p2,Point q1)
	{
		if(p2.x<=max(p1.x,q1.x)&&p2.x>=min(p1.x,q1.x)
				&&p2.y<=max(p1.y,q1.y)&&p2.y>=min(p1.y,q1.y))
			return true;
		return false;
	}

	public static int orientation(Point p1,Point q1,Point p2)
	{
			int o=((q1.y-p1.y)*(p2.x-q1.x))-((p2.y-q1.y)*(q1.x-p1.x));
			if(o==0)
				return colinear;
			if(o>0)
				return clockwise;
			return antiClockwise;
	}

	public static boolean intersect(Line l1,Line l2)
	{
		//find the slope of lines and check their orientations 
		//if orientations are different then 
		//they intersect each other.
		
		int o1=orientation(l1.p1, l1.q1, l2.p1);
		int o2=orientation(l1.p1, l1.q1, l2.q1);
		int o3=orientation(l2.p1, l2.q1, l1.p1);
		int o4=orientation(l2.p1, l2.q1, l1.q1);

		//special case
		//when points are co-linear and to check if they lie i=on segment or not
		
		if(o1!=o2 && o3!=o4)
			return true;
		if(o1==0 && onSegment(l1.p1, l2.p1, l1.q1))
			return true;
		if(o2==0 && onSegment(l1.p1, l2.q1, l1.q1))
			return true;
		if(o3==0 && onSegment(l2.p1, l1.p1, l2.q1))
			return true;
		if(o4==0 && onSegment(l2.p1, l1.q1, l2.q1))
			return true;		
		return false;
	}
	
	public static void main(String[] args) {
		Point p1=new Point(1,1);
		Point q1=new Point(10,1);
		Point p2=new Point(1,2);
		Point q2=new Point(10,2);
		Line l1=new Line(p1,q1);
		Line l2=new Line(p2,q2);
		if(intersect(l1, l2))
			System.out.println("Intersect");
		else
			System.out.println("Not intersect");
		
		//----------------------------------------------------------------
		
		Point p3=new Point(10,0);
		Point q3=new Point(0,10);
		Point p4=new Point(0,0);
		Point q4=new Point(10,10);
		Line l3=new Line(p3,q3);
		Line l4=new Line(p4,q4);
		if(intersect(l3, l4))
			System.out.println("Intersect");
		else
			System.out.println("Not intersect");
	}
}
