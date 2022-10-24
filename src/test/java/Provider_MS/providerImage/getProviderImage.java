package Provider_MS.providerImage;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_ProviderImages_Endpoint;
import static utility.RestCalls.GET_200;

public class getProviderImage extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider image by ID")
    @Story("Ensure that the request is able to fetch provider image details by ID")
    public void Get_ProviderImage_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderImages_Endpoint = "/provider-images/7");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("originalName", is("thiaw-sa68ffb050e6.png"));
        response.then().assertThat().body("id", is(7));
        response.then().assertThat().body("key", is("html;charset=UTF-8/thiaw-sa68ffb050e6-36ba.png"));

    }
}
