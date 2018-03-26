package sweeper;

class Matrix {
	private Box[][] matrix;

	Matrix(Box box){
		matrix = new Box[Ranges.getSize().x][Ranges.getSize().y];
		for(Coord coord: Ranges.getAllCoords())
			matrix[coord.x][coord.y] = box;
	}

	Box get(Coord coord){
		if(Ranges.inRage(coord)) {
			return matrix[coord.x][coord.y];
		}
		return null;
	}

	void set(Coord coord, Box box){
		if (Ranges.inRage(coord)){
			matrix[coord.x][coord.y] = box;
		}
	}
}
