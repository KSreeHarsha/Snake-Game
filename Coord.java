public final class Coord
{
	int x;
	int y;
	public Coord(int iX, int iY)
	{
		x = iX;
		y = iY;
	}
	public Coord(Coord initial)
	{
		x = initial.getX();
		y = initial.getY();
	}

	public int hashCode()
	{
		
		return x * y + x + y;
	}

	public boolean isEqual(Coord other)
	{
		return equals(other);
	}

	public boolean equals(Object other)
	{
		if (this == other) return true;

		if (!(other instanceof Coord)) return false;
		Coord tOther = (Coord) other; 

		if (other != null && x == tOther.getX() && y == tOther.getY())
			return true;
		else
			return false;
	}	

	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public String toString()
	{
		return "".format("(%d,%d)",getX(), getY());
	}
}
 
