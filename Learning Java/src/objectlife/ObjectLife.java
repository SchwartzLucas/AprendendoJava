package objectlife;

public class ObjectLife{
    public int area( int l, int w){
        int result = l * w;
        
        return result;
    }

    class Client {
        public static void main(String[] args){
            ObjectLife of = new ObjectLife();
            int area = of.area(3,5);

            System.out.println("Area is: " + area);
            of = null; // explicitly deferences the variable
        }
    }
    
}
