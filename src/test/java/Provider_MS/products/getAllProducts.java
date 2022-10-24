package Provider_MS.products;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_Product_Endpoint;
import static utility.RestCalls.GET_200;

public class getAllProducts extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all products")
    @Story("Ensure that the request is able to fetch all product details")
    public void Get_Product_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Product_Endpoint = "/products");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));

    }
}
