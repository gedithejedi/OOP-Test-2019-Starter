package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	private ArrayList<Colour> colours = new ArrayList<Colour>();

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		int val1 = 0;
		int val2 = 0;
		int val4 = 0;
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(800, 800);

		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		//loadColours();
		drawResistors();
	}
/*
	public void loadColours() 
	{
		Table table = loadTable("colours.csv", "header");

		for (TableRow row:table.rows()) 
		{
			Colour c = new Colour(row);
			colours.add(c);
		}
	} */

	public void printColours() 
	{
		for (Colour colour : colours) 
		{
			System.out.println(colour);
		}
	}

	public void drawResistors()
	{
		stroke(0);
		//drawing the resistors rectangles
		rect(300, 100, 100, 100);
		rect(300, 300, 100, 100);
		rect(300, 500, 100, 100);
		//drawing resistors lines
		line(200, 150, 300, 150);
		line(400, 150, 500, 150);
		//-----------------------
		line(200, 350, 300, 350);
		line(400, 350, 500, 350);
		//-----------------------
		line(200, 550, 300, 550);
		line(400, 550, 500, 550);
		//text showing the resistor values
		textSize(20);
		fill(0);
		text("val1" ,700 , 150 );
		text("val2" ,700 , 350 );
		text("val3" ,700 , 550 );
	}


}
