package Primax;

public class Estacion {
	//atributos de la estacion
	private int r;
	private int x;
	private int min;
	private int max;

	public Estacion(int pR, int pX)
	{
		r = pR;
		x = pX;
		min = x-r;
		max= x+r;
	}
	public int getX()
	{
		return x;
	}
	public void setX(int pX)
	{
		this.x = pX;
	}
	public int getR()
	{
		return r;
	}
	public void setR(int pR)
	{
		this.r = pR;
	}
	public int getMin()
	{
		return min;
	}
	public void setMin(int a, int b)
	{
		min = a-b;
	}
	public int getMax()
	{
		return max;
	}
	public void setMax(int a, int b)
	{
		min = a+b;
	}
	public String toString() 
	{
		String mensaje = "The station have a";
		return mensaje;
	}
}
