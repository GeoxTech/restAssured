package Provider_MS.providerAdmin;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_ProviderAdmin_Endpoint;
import static utility.RestCalls.GET_200;

public class getProviderAdmin extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider admin by ID")
    @Story("Ensure that the request is able to fetch provider admin details by ID")
    public void Get_ProviderAdmin_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderAdmin_Endpoint = "/provider-admins/10");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("firstName", is("R-Jolad"));
        response.then().assertThat().body("lastName", is("provider"));
        response.then().assertThat().body("phoneNumber", is("2348132646940"));
        response.then().assertThat().body("email", is("r.jolad@kang.pe"));
        response.then().assertThat().body("providerId", is(8));

    }
}
