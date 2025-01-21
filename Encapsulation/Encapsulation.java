class Person {
    private String name; // private = restricted access

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John Doe");
        String temp=myObj.getName();
        System.out.println(temp);
    }
}