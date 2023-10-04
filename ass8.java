// Create a new class called ElectricCar that inherits from the Car class.
//  Add an additional attribute battery_size to the ElectricCar class. 
//  Create an object of ElectricCar and access its attributes.

// Override the start_engine method in the ElectricCar class to print
//  "Electric motor started" instead of "Engine started." Create an object of ElectricCar and call this method

// Add private attributes to the Car class, such as _mileage and _fuel_level. 
// Create getter and setter methods for these attributes. Demonstrate using the
//  getter and setter to access and modify these attributes.

// Add a class variable num_cars to the Car class that keeps track of the number of cars created.
//  Create a class method that returns the current count of cars. Test this by creating multiple 
//  car objects and calling the class method.

// Implement the __str__ method in the Car class to return a string representation of 
// a car, including its make, model, and year. Then, create a car object and print it.

class car{
    int model_year;
    String name;
    private int as_mileage;
    private int _fuel_level;
    int num_cars;

    int count(int num_cars){
        this.num_cars=num_cars;
        return num_cars;
    }
    

    
    public String  __str__() {
        return "car [model_year=" + model_year + ", name=" + name + "]";
    }
    public void setAs_mileage(int as_mileage) {
        this.as_mileage = as_mileage;
    }


    public void set_fuel_level(int _fuel_level) {
        this._fuel_level = _fuel_level;
    }


    public int getAs_mileage() {
        return as_mileage;
    }


    public int get_fuel_level() {
        return _fuel_level;
    }


    void start_engine(){
        System.out.println("Engine Started");
    }
}
class ElectricCar extends car{
    int battery_size;
    void start_engine(){
        System.out.println("Electric engine started");
    }
}
public class ass8 {
    public static void main(String[] args){
        ElectricCar e1 = new ElectricCar();
        e1.battery_size=1000;
        System.out.println(e1.battery_size);
        ElectricCar e2=new ElectricCar();
        e2.start_engine();
        car c1=new car();
        c1.setAs_mileage(100);
        c1.set_fuel_level(20);
        System.out.println(c1.get_fuel_level());
        System.out.println(c1.getAs_mileage());
        System.out.println(c1.count(10));
        car c2=new car();
        c2.name="bmw";
        c2.model_year=2020;
        System.out.println(c2.__str__());
    }
}
