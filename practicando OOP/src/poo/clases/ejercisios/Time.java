package poo.clases.ejercisios;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	
	public Time(int hour,int minute,int second) {//Constructor.No1
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	public int getHour() {
		return hour;
	}
	
	
	public int getMinute() {
		return minute;
	}
	
	
	public int getSecond() {
		return second;
	}
	
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	
	public void setTime(int hour,int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	public String toString() {
		return "Hour: " + hour + " Minute: " + minute + " Second: " + second;
	}
	
	
	public Time nextSecond() {
		int hour = this.hour;
		int minute = this.minute;
		int second = this.second;
		Time fecha = new Time(hour,minute,second+1);
		return fecha;
		
	}
	
	
	public Time previousSecond() {
		int hour = this.hour;
		int minute = this.minute;
		int second = this.second;
		Time fecha = new Time(hour,minute,second-1);
		return fecha;
	}
}
