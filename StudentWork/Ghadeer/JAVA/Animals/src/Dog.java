public class Dog implements Animal {
    private String name;
    Dog (){
        setName("bubby");
    }
    Dog (String name){
        setName(name);
    }
    public void talk(){
        System.out.println("park,park,park,park,..... ");
    }
    public void eat(){
        System.out.println(getName()+" yummm");

    }
        //accessor
        public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
