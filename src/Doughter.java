public class Doughter  extends  Parent{


    public String school;

    public Doughter(String parentName, String name, int age, String sex, String school) {
        super(parentName, name, age, sex);
        this.school= school;
    }

    public void doughterDescribe(){
        System.out.println(name + " goess to " + school);
    }


}
