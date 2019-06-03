class Bike implements Vehicle
{
	
	public void speedUp(int speed)
	{
		System.out.println("going with speed of "+speed);
		
	}
	
	
	public void changeGear(int gear){
		
		System.out.println("using "+gear);
	}
	
	
	
	public void applyBreak(boolean flag)
	{
		System.out.println("applying the breaks ..."+flag);
		
	}
	
	


}