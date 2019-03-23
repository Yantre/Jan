package com.yantre;

import java.util.ArrayList;
import java.util.List;

// объявляем класс
public class Zadacha
{
	public Zadacha () {}

	public Zadacha (String name) {
		this.name = name;
	}


	// создаем конструктор
	public Zadacha (String name, int month, int year) {

		this.name = name;
		this.month = month;
		this.year = year;
		this.sostojnie = false;
		this.endDay = 31;
		//this.podZadachi = new ArrayList<>();
	}

	public Zadacha (String name, int month, int year, int endDay) {

		this.name = name;
		this.month = month;
		this.year = year;
		this.sostojnie = false;
		this.endDay = endDay;
	}


	// аттрибуты класса
	private String name;
	private boolean sostojnie;
	private int month;
	private int year;
	private int endDay;

	private List<Zadacha> podZadachi;// = new ArrayList<>();

	public List<Zadacha> getPodZadachi()
	{
		return podZadachi;
	}

	public void setPodZadachi(List<Zadacha> podZadachi)
	{
		this.podZadachi = podZadachi;
	}

	// методы класса
	public boolean isSostojnie()
	{
		return sostojnie;
	}

	public void setSostojnie(boolean sostojnie)
	{
		this.sostojnie = sostojnie;
	}

	public int getMonth()
	{
		return month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getEndDay()
	{
		return endDay;
	}

	public void setEndDay(int endDay)
	{
		this.endDay = endDay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString()
	{
		return "Name:" + this.name + ", Month:"+ this.month +", year:"+this.year + ", sostojnie:" + this.sostojnie + ", endDay: " +this.endDay ;
	}
}
