package Provider_MS.banks;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_Banks;
import static utility.RestCalls.GET_200;

public class getBank extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get bank details")
    @Story("Ensure that the request is able to fetch bank details.")
    public void Get_Bank_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Banks = "banks/1");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("name", is("Access Bank Plc."));
        response.then().assertThat().body("slug", is("access-bank"));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get bank details")
    @Story("Ensure that the request is able to fetch bank details.")
    public void Get_Bank_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_Banks);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
