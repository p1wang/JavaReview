package staticVarTest;

public class TestClass {

    private String courses="before history";


    public void enroll(){

        courses = "history";

    }

    public void enrollOutput(){
        System.out.println(courses);
    }
    
}
