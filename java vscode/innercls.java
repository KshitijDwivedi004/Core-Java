class a{

    public void show(){
        System.out.println("in show");
    }
    class b{
        public void display(){
            System.out.println("displaying.. in display");
        }
    class b2{
        public void display2(){
            System.out.println("displaying.. in display2");
        }
    }
}

public class innercClass {
    public static void main(String[] args) {
        
        a obj = new a();
        a.b obj1 = obj.new b();
        a.b obj2 = new a.b();
        obj.show();
        obj1.display();
        obj2.display();
    }
}
}