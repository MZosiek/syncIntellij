public class ParentTest {
    public static void main(String[] args) {


      /*  Parent ojciec = new Parent();

        ojciec.name = "Marcin";
        ojciec.age = 32;
        ojciec.sex="male";
        ojciec.child();
        ojciec.parentName = "Jerzego"


        ojciec.describe();
        ojciec.describeAge(); */

        Son syn = new Son( "Marcin", "Tomasz", 3,"male" ,"no","football");

        syn.child();



        syn.describe();
        syn.describeAge();
        syn.plays();

        Doughter córa = new Doughter( "Marta", "Ania", 5,"female","AGH");

        córa.child();

        córa.doughterDescribe();
        córa.describe();
        córa.describeAge();

    }
}
