package ClassGroup;

import org.testng.annotations.Test;

@Test(groups = "teacher" )
public class Teacher {
    public void teacher(){
        System.out.println("teacher运行啦！");
    }
}
