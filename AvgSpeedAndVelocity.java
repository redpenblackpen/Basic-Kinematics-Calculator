import java.util.Scanner;

public class AvgSpeedAndVelocity {
	
public static double Savg(double x, double y){
        
        double S;
        S = x / y;
        return S;
        
    }
    
    public static double Vavg(double x, double y){
        
        double V;
        V = x / y;
        return V;
        
    }

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        int i,a, b;
        double distance, distance1, distance2, distance3, distance4, displacement, time;
      
       
        
        System.out.print("Press 1 to find Average Speed or Press 2 to find Average Velocity: ");
        i = input.nextInt();
         
        switch(i){
            
            case 1:
                System.out.print("Enter distance1: ");
                distance1 = input.nextDouble();
                System.out.print("Enter distance2: ");
                distance2 = input.nextDouble();
                
                distance = distance1 + distance2;
                
                System.out.print("Enter time: ");
                time = input.nextDouble();
            
                
                double AvgSpeed;
                AvgSpeed = Savg(distance, time);
                System.out.print("Average Speed is " + AvgSpeed + " km/hr");
                
                break;
            
            case 2:
           
                System.out.print("Enter distance1: ");
                distance1 = input.nextDouble();
                System.out.println("Choose direction: ");
                System.out.println("1. West");
                System.out.println("2. East");
                System.out.println("3. North");
                System.out.println("4. South");
                
                System.out.print("Enter direction: ");
                a = input.nextInt();
                
                switch(a){
                    
                    case 1:
                        System.out.println(distance1 + " west");
                        break;
                        
                    case 2:
                        System.out.println(distance1 + " east");
                         break;
                        
                    case 3: 
                        System.out.println(distance1 + " north");
                         break;
                        
                    case 4:
                        System.out.println(distance1 + " south");
                         break;
                   
                }
              
                System.out.println("");
                
                
                System.out.print("Enter distance2: ");
                distance2 = input.nextDouble();
                System.out.println("Choose direction: ");
                System.out.println("1. West");
                System.out.println("2. East");
                System.out.println("3. North");
                System.out.println("4. South");
                
                System.out.print("Enter direction: ");
                b = input.nextInt();
                
                switch(a){
                    
                    case 1:
                        System.out.println(distance2 + " west");
                         break;
                        
                    case 2:
                        System.out.println(distance2 + " east");
                         break;
                        
                    case 3: 
                        System.out.println(distance2 + " north");
                         break;
                        
                    case 4:
                        System.out.println(distance2 + " south");
                         break;
              
                }
                
                
                System.out.println("");
                
                System.out.print("Enter time: ");
                time = input.nextDouble();
                
                if(a == 2 || b == 1){
                    
                    displacement = distance1 - distance2;
                    
                    double AvgVelocity;
                    AvgVelocity = Vavg(displacement, time);
                    System.out.print("Average Velocity is " + AvgVelocity);
                    
                    break;
                    
                }
                
                
                
                if(a == 2 || b == 3){
                    
                     displacement = distance1 + distance2;
                     
                     double AvgVelocity;
                     AvgVelocity = Vavg(displacement, time);
                     System.out.print("Average Velocity" + AvgVelocity);
                     
                     break;
                    
                }
                if(a == 2 || b == 4){
                    
                     displacement = distance1 - distance2;
                     
                     double AvgVelocity;
                     AvgVelocity = Vavg(displacement, time);
                     System.out.print("Average Velocity is " + AvgVelocity + " km/hr");
                     
                     break;
                    
                }
     }
     
    }
}