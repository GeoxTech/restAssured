package Provider_MS.addressState;

import Base.TestFlight;
import Response.providers_Response_Pojo.create_AddressState_Response_Pojo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static pojo.Constant.Constant.Get_ALL_Address_State;
import static pojo.PayloadManager.create_Address_State_Payload;
import static utility.RestCalls.POST_201;

public class createAddressState extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An endpoint to create Address State")
    @Story("Ability to create a new address state")
    public void create_Address_State_valid() throws InterruptedException, IOException {
        Response response = POST_201(Get_ALL_Address_State, create_Address_State_Payload());

        create_AddressState_Response_Pojo Response_pojo = response.prettyPeek().then().spec(responseSpec_201)
                .extract()
                .as(create_AddressState_Response_Pojo.class);

        assertNotNull(Response_pojo.getName());
        assertNotNull(Response_pojo.getCreatedDate());
        assertNotNull(Response_pojo.getLastModifiedDate());
        assertEquals(response.jsonPath().getInt("zoneId"), 4);
    }
}
