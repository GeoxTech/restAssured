package Enrollee_MS;

import Base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.testng.Assert.assertEquals;
import static pojo.Constant.Constant.Get_All_Favorite_Pharmacy_Endpoint;
import static utility.RestCalls.POST_201;
import static utility.Utility.generateStringFromResource;

public class Create_Enrollee_FavoritePharmacy extends TestBase {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Ensure that a new Enrollee favorite pharmacy can be added")
    @Story("Ability to add a new favourite pharmacy to an enrollee")
    public void Add_Enrollee_FavoritePharmacy_201() throws InterruptedException, IOException {
        //Map<String,Object> contentMap = convertStringToMap(generateStringFromResource("./src/main/java/Payload/Add_Enrollee_FavoritePharmacy.json"));
        Response response = POST_201(Get_All_Favorite_Pharmacy_Endpoint, generateStringFromResource("./src/main/java/Payload/Add_Enrollee_FavoritePharmacy.json"));
        response.prettyPeek().then().spec(responseSpec_201);

        assertEquals(response.jsonPath().getInt("enrolleeId"), 3);
        assertEquals(response.jsonPath().getInt("pharmacyCode"), "AB");

    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Ensure that a duplicate Template cant be added")
    @Story("Ability to add a unique SMS Template")
    public void Add_Enrollee_FavoritePharmacy_500() throws InterruptedException, IOException {
        Response response = POST_201(Get_All_Favorite_Pharmacy_Endpoint, generateStringFromResource("./src/main/java/Payload/Add_Enrollee_FavoritePharmacy.json"));
        response.prettyPeek().then().spec(responseSpec_201);

        response.then().assertThat().body("status", is(500));
        response.then().assertThat().body("detail", is("An error occurred : Enrollee favorite pharmacy already exists"));
    }


}
