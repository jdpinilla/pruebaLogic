package Primax;

import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class Primax 
{	
	private int l;
	private ArrayList<Estacion> estaciones;
	private double porcentaje;
	private int repeticion;
	public Primax(int pL)
	{
		l = pL;
	}
	public double getPorcentaje()
	{
		return porcentaje;
	}
	public void setPorcentaje(double pPorcentaje)
	{
		this.porcentaje = pPorcentaje;
	}
	public int getRepeticion()
	{
		return repeticion;
	}
	public void setRepeticion(int pRepeticion)
	{
		this.repeticion = pRepeticion;
	}
	public int getL()
	{
		return l;
	}
	public void setL(int pL)
	{
		this.l = pL;
	}
	public Double darPorcentaje(ArrayList<Estacion> estacionesT)
	{	
		double porcent =0 ;
		Estacion estaciontemp;
		int recorrido = 0;
			for(int i =0; i < estacionesT.size(); i ++)
			{
				estaciontemp = estacionesT.get(i);
				if(estaciontemp != null)
				{
					recorrido += estacionesT.get(i).getR();
					if(recorrido > l)
					recorrido -= estacionesT.get(i).getR();	
				}
			}
		porcent = (100*recorrido)/l;
		return porcent;
	}
	public int darRepeticiones(ArrayList<Estacion> estacionesT)
	{
		int repeticiones = 0;
		for(int i =0; i < estacionesT.size(); i ++)
		{
			Estacion estaciontemp1 = estacionesT.get(i);
			for(int j = 0; j<estacionesT.size(); j++)
			{
				Estacion estaciontemp2 = estacionesT.get(j);
				if(estaciontemp1 != estaciontemp2)
				{
					if(estaciontemp1.getX() <= estaciontemp2.getMax() && estaciontemp2.getX() >= estaciontemp2.getMin())
					{
						repeticiones ++;
					}
				}
			}
		}
		return repeticiones;
	}
	public void agregarEstacion(int x, int b)
	{
		Estacion estacion = new Estacion(x, b);
		estaciones.add(estacion);
	}
	
	/**public boolean verificarEstaciones(Estacion estacion)
	{
		boolean estado;
		Estacion estacionTemp;
		for(int i =0 ; i < estaciones.	size(); i ++)
		{
			estacionTemp = estaciones.get(i);
			if(estacion.et)
		}
		
	}
	public ArrayList<Estacion> darListaMasEficiente()
	{
		Estacion estacionT1;
		ArrayList<Estacion> estacionesEficientes = new ArrayList<Estacion>();
		if(estacionesEficientes.size() == 0)
		{
			
		}
	}*/
	public void añadirEstacion(Estacion estacion)
	{
		if(estaciones.size() == 0)
		{
			estaciones.add(estacion);
		}
		else
		{
			
		}
	}
	public void borrarEstaciones()
	{
		for(int i = 0; i < estaciones.size() ; i++)
		{
			
		}
	}
}
