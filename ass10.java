// Create a class called TemperatureConverter with methods to convert temperatures 
// between Celsius and Fahrenheit. Create an object of this class and use its methods to convert temperatures.
//C = (°F − 32) x 5/9
//F = (°C × 9/5) + 32
class TemperatureConverter{
    // float celsius;
    // float fahrenheit;
    float celsius(float fa){
        float c=((fa-32)*5)/9;
        return c;
    }
    float fahrenheit(float ce){
        float f=(ce*9)/5+32;
        return f;
    }
}
public class ass10 {
    public static void main(String[] args){
        TemperatureConverter temp=new TemperatureConverter();
       System.out.println(temp.celsius(10));
       System.out.println(temp.fahrenheit(20)); 
    }
}
