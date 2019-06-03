class Car implements Vehicle
{
	
	public void speedUp(int speed)
	{
		System.out.println("car going with speed of "+speed);
		
	}
	
	
	public void changeGear(int gear){
		
		System.out.println("car using "+gear);
	}
	
	
	
	public void applyBreak(boolean flag)
	{
		System.out.println("applying the breaks for car ..."+flag);
		
	}
	
	


}