package parking;

import set1.util.ScannerValidate;
import entity.ParkingEntity;
public class Parking {

	public static void main(String[] args) {
		int[] parking=new int[100];
		boolean quit = true;
		int id=0;
		String vehNum="";
	    int hour=0,hourNow=0,minute=0,minuteNow=0;
		do {
			System.out.println("\n");
			System.out.println("Enter your choice\n"+"1> Automatically check for the available parking\n"
					+ "2> Enter the vehicle number coming in for parking.\n"
					+ "3> Enter the entry time of a vehicle.\r\n"
					+ "4> Automatically allocate the empty slot for parking.\r\n"
					+ "5> Calculate the parking fee based on the time duration of parking. Parking fee is Rs 50"
					+ "for fist 2 hours after which Rs 30/hr. \n"
					+ "6> Exit");
			System.out.println("\n");
			int input=ScannerValidate.getValidInt();
			switch(input)
			{
			case 1:
				   System.out.println("parking available at slots are");
				   for(int i=id;i<parking.length;i++)
				   {
					System.out.print(i+",") ;  
				   }
				   id++;
				   System.out.println("\n");
				break;
			case 2:
				 System.out.println("enter the vehicle number");
				 ScannerValidate.scanner.next();
				  vehNum=ScannerValidate.getString();
				  
				break;
			case 3:
				System.out.println("enter the time");
				hour=ScannerValidate.getTime();
              minute=ScannerValidate.getMinute();
				break;
			case 4:System.out.println("slot allocated for "+vehNum+" is ==="+id);
				break;
			case 5:
				System.out.println("enter the current time");
				System.out.println("enter the time");
				hourNow=ScannerValidate.getTime();
               minuteNow=ScannerValidate.getMinute();
                calFees(hour,hourNow);
				break;
			case 6:quit=false;
				break;
				default:
					System.out.println("invalied choice");
			}
		} while (quit);
	}
	public static void calFees (int hour,int hourNow) {
		int cal=hourNow-hour;
		if(cal<0)
		{
			System.out.println(cal*-1);
		}
		else
			System.out.println(cal);
			
				
	}
	

}
