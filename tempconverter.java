import java.util.Scanner;
interface start{
    float convert();
}
class temperature implements start{
    private float temp;
    public temperature(float temp){
        this.temp=temp;
    }
    @Override
    public float convert(){
        return (this.temp-32)*5/9;
    }
}
class tempconverter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the temperature in farenheit to convert to celcius: ");
        float temp=sc.nextFloat();
        temperature t=new temperature(temp);
        System.out.println("temperature in celcius: "+t.convert());
    }
}