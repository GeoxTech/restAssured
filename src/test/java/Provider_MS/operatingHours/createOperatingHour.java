package Provider_MS.operatingHours;

import Base.TestFlight;
import Response.providers_Response_Pojo.create_OperatingHour_Response_Pojo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_All_Opening_Hour;
import static pojo.PayloadManager.create_OperatingHour_Payload;
import static utility.RestCalls.POST_201;

public class createOperatingHour extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An endpoint to create operating hour")
    @Story("Ability to create a new operating hour")
    public void createOperatingHour_valid() throws InterruptedException, IOException {
        Response response = POST_201(Get_All_Opening_Hour, create_OperatingHour_Payload());

        create_OperatingHour_Response_Pojo Response_pojo = response.prettyPeek().then().spec(responseSpec_201)
                .extract()
                .as(create_OperatingHour_Response_Pojo.class);

        response.then().assertThat().statusCode((201));


    }

}
