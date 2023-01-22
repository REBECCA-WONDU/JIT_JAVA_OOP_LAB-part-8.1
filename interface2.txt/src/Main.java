interface Trinagle{

    void display(int length,int breadth);
}
interface Polygon{
    void display(int length,int breadth);
}
class Rectangle implements Trinagle, Polygon{

    @Override
    public void display(int length, int breadth) {
        System.out.println("the area is "+  length*breadth);
    }
}

class Main{
    public static void main(String[] args){
        Rectangle obj1=new Rectangle();

        obj1.display(5,6);

    }
}