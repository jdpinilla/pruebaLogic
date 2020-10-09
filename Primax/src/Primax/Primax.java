package Primax;

import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class Primax 
{	
	static final int MARGEN_ERROR = 10;
	private int l;
	private ArrayList<Estacion> estaciones;
	public Primax(int pL)
	{
		l = pL;
	}
	public int getL()
	{
		return l;
	}
	public void setL(int pL)
	{
		this.l = pL;
	}
	public boolean esAceptable(Estacion estacion1, Estacion estacion2)
	{
		boolean acept = false;
		if(estacion1.getX() < estacion2.getX())
		{
			if(estacion1.getMax() > estacion2.getMin())
			{
				int distancia = estacion2.getX() - estacion1.getX();
				int distanciaRadios = estacion1.getMax() - estacion2.getMin();
				double porcentaje = (distanciaRadios*100)/distancia;
				if(porcentaje > MARGEN_ERROR)
					acept = false;
				else
				acept = true;
			}
			if(estacion1.getMax() < estacion2.getMin())
				acept = true;
		}
		if(estacion1.getX() > estacion2.getX())
		{
			if(estacion2.getMax() > estacion1.getMin())
			{
			int distancia = estacion1.getX() - estacion2.getX();
			int distanciaRadios = estacion2.getMax() - estacion1.getMin();
			double porcentaje = (distanciaRadios*100)/distancia;
			if(porcentaje > MARGEN_ERROR)
				acept = false;
			else
				acept = true;
		}
		}
		if(estacion2.getMax() < estacion1.getMin())
			acept = true;
		return acept;
	}
	public void agregarEstacion(int x, int b)
	{
		Estacion estacion = new Estacion(x, b);
		boolean termino = false;
		for(int i = 0; i < estaciones.size() && !termino; i ++)
		{
			if(esAceptable(estacion, estaciones.get(i))== false)
				{
					termino = true;
				}
		}
		if(termino = false)
		{
			estaciones.add(estacion);
		}
	}
}
