package GroupTest;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.rmi.server.ServerCloneException;

public class GroupTest {

    @Test(groups = "Server")
    public void ServerMethod1(){
        System.out.println("服务端111");
    }
    @Test(groups = "Server")
    public void ServerMethod2(){
        System.out.println("服务端222");
    }
    @Test(groups = "Client")
    public void ClientMethod1(){
        System.out.println("客户端111");
    }
    @Test(groups = "Client")
    public void ClientMethod2(){
        System.out.println("客户端222");
    }

    @BeforeGroups("Server")
    public void BeforeGroup(){
        System.out.println("服务端运行之前！");
    }
    @AfterGroups("Server")
    public void AfterGroup(){
        System.out.println("服务端运行之后！");
    }
}
