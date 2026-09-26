interface shapes{
    public double getarea();
}
class rectangle implements shapes{
    private float width;
    private float height;
    public rectangle(float width, float height){
        this.width=width;
        this.height=height;
    }
    @Override 
    public double getarea(){
        return width*height;
    }
}
class circle implements shapes{
    private float radius;
    public circle(){
    this.radius=radius;
    }
    @Override 
    public double getarea(float radius){
        return radius*radius*Math.PI;
    }
}
class areacalculator{
    public double sumareas(shapes[] shape){
        double totalarea=0;
        for(shapes s:shape){
            totalarea+=s.getarea();
        }
        return totalarea;
    }
}
// main class
class calculateshapes{
    public static void main(String[] args){
        //create arrays(polymorphism)
        shapes[] sh=new shapes[2];
        sh[0]=new rectangle(2, 14);
        sh[1]=new circle(7);
        areacalculator cal=new areacalculator();
        double totalarea=new cal.sumareas(sh);
        System.out.println("total area: "+totalarea);
    }
}
