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
import static pojo.PayloadManager.UpdateProviderImage_Payload;
import static utility.RestCalls.PUT_200;

public class updateProviderImage extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Ensure that the provider image endpoint can be updated")
    @Story("An Endpoint to Update Provider image")
    public void Update_ProviderImage() throws InterruptedException, IOException {
        Response response = PUT_200(Get_ProviderImages_Endpoint, UpdateProviderImage_Payload());
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().body("id", is(14));
        response.then().assertThat().body("key", is("dolorR"));
        response.then().assertThat().body("providerId", is(374));
        response.then().assertThat().body("url", is("eu nulla "));



    }
}
