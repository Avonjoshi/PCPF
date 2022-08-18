// Car class
class Car {
  
  private int speed; // member field speed

  // Setter method to set the speed of the car
  public void setSpeed(int x) {
    speed = x; 
  }

  // Getter method to get the speed of the car
  public int getSpeed() {
    return speed; 
  }
  
}

class Demo {
  
   public static void main(String args[]) {
     Car car = new Car();
     car.setSpeed(100); // calling the setter method
     System.out.println(car.getSpeed()); // calling the getter method
   } 
  
} 
