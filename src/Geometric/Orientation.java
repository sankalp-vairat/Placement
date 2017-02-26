package Geometric;

public enum Orientation {

	CLOCKWISE (1),
	ANTICLOCKWISE (-1),
	COLINEAR (0);
	
	private final int orientation;
	
	private Orientation(int orientation) {
		this.orientation=orientation;
	}
}
