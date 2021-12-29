public class Parent {

    public String parentName;
    public String name;
    public int age;
    public String sex;
    public String childType;

    public Parent ( String parentName, String name , int age, String sex){
        this.parentName = parentName;
        this.name=name;
        this.age = age;
        this.sex = sex;

    }

    public void child() {
        switch (sex) {
            case "male":
                childType = "son";
                break;
            case "female":
                childType = "doughter";
                break;
        }
    }

    public void describe(){
        System.out.println(name + " is a " + childType + " of " + parentName) ;
        }

    public void describeAge(){
        System.out.println(name + " is " + age + " years old");
    }


}
