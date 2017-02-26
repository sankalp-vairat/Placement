package Geometric;

public class Line {

	Point p1;
	Point q1;
	public Line(Point p1,Point q1) {
		this.p1=p1;
		this.q1=q1;
	}
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getQ1() {
		return q1;
	}
	public void setQ1(Point q1) {
		this.q1 = q1;
	}
}
