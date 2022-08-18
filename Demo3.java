class Date {

  private int day;
  private int month;
  private int year;


  // Default constructor
  public Date() {
    // We must define the default values for day, month, and year
    this.day = 0;
    this.month = 0;
    this.year = 0;
  }

  // Parameterized constructor
  public Date(int day, int month, int year){
    // The arguments are used as values
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // A simple print function
  public void printDate(){ 
    System.out.println("Date: " + day + "/" + month + "/" + year);
  }
  
}

class Demo3 {
  
  public static void main(String args[]) {
    // Call the Date constructor to create its object;
    Date date = new Date(1, 8, 2018); // Object created with specified values!
    date.printDate();
  }
  
}
