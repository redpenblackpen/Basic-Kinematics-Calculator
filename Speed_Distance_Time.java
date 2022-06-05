import java.util.Scanner;

public class Speed_Distance_Time {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 double distance, time, Speed;
	        
	        System.out.print("Press 1 to find Speed, Press 2 to find Distance, Press 3 to find Time: ");
	        int i = input.nextInt();
	        
	        System.out.println("");
	        
	        switch(i){
	            
	            case 1:
	            
	             System.out.print("Enter a distance: ");
	             distance = input.nextDouble();
	        
	             System.out.print("Enter a time: ");
	             time = input.nextDouble();
	             
	             System.out.println("");
	        
	             double AvgSpeed;
	             AvgSpeed = Speed(distance, time);
	             System.out.println("Speed: " + AvgSpeed + " km/hr");
	             
	             break;
	             
	             
	             case 2:
	            
	             System.out.print("Enter a Speed: ");
	             Speed = input.nextDouble();
	        
	             System.out.print("Enter a time: ");
	             time = input.nextDouble();
	             
	             double AvgDistance;
	             AvgDistance = Distance(Speed, time);
	             System.out.println("Distance: " + AvgDistance + " km");
	             
	             break;
	             
	             case 3:
	             
	             System.out.print("Enter distance: ");
	             distance = input.nextDouble();
	        
	             System.out.print("Enter a Speed: ");
	             Speed = input.nextDouble();
	             
	             double AvgTime;
	             AvgTime = Time(distance, Speed);
	             System.out.println("Time: " + AvgTime + " hrs");
	             
	             break;
	             
	             default:
	             System.out.println("You entered a wrong input! ");
	             break;
	             
	        }
	    
	      
	    }
	    
	    public static double Speed(double x, double y){
	        
	        double s;
	        s = x/y;
	        return s;
	        
	        
	    }
	    
	    
	    public static double Distance(double x, double y){
	        
	        double d;
	        d = x*y;
	        return d;
	        
	        
	    }
	    
	    public static double Time(double x, double y){
	        
	        double t;
	        t = x/y;
	        return t;
	        
	        
	    }
	    
	}
