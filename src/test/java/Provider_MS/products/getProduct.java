package Provider_MS.products;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_Product_Endpoint;
import static utility.RestCalls.GET_200;

public class getProduct extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get products by ID")
    @Story("Ensure that the request is able to fetch product details by ID")
    public void Get_Product_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Product_Endpoint = "/products/1");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("name", is("ALEXANDRITE Individual"));
        response.then().assertThat().body("id", is(1));
        response.then().assertThat().body("type", is("PLAN"));
        response.then().assertThat().body("planName", is("ALEXANDRITE"));
        response.then().assertThat().body("clientTypeName", is("Retail"));

    }
}
