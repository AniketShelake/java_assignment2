//Create a class called Car with attributes like make, model, and year. 
//Then, create an object of this class and print its attributes.

//Add a method to the Car class called start_engine that prints "Engine started" 
//when called. Create an object of the Car class and call this method.

//Modify the Car class to have a constructor that initializes the attributes. 
//Create multiple car objects with different attributes using the constructor

class Car{
    String model;
        int make;
        int year;
    Car(String mo, int ma, int y){
          model=mo;
          make=ma;
          year=y;
    }
   
    void start_engine(){
          System.out.println("Engine started");
    }
    void display(){
        System.out.println(model+","+make+","+year+",");
    }
}
class ass1{
    public static void main(String[] args){
        Car cr=new Car("bmw",111,2000);
        //System.out.println(cr.model+","+cr.make+","+cr.year+",");
        cr.start_engine();
        cr.display();
        Car cb=new Car("maruti", 12345, 2000);
        cb.display();
        
    }
}