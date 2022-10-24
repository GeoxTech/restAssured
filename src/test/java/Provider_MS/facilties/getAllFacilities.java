package Provider_MS.facilties;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_All_Facility;
import static utility.RestCalls.GET_200;

public class getAllFacilities extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all facilities details")
    @Story("Ensure that the request is able to fetch all facilities and their details.")
    public void Get_All_Facility_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_All_Facility = "/facilities?offset=3767957&page=3767957&pageNumber=3767957&pageSize=3767957&paged=true&size=3767957&sort=dolore pariatur&sort=esse Lorem Ut aliqua dolor&sort.sorted=true&sort.unsorted=true&unpaged=true");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all facilities details")
    @Story("Ensure that the request is able to fetch all facilities and their details")
    public void Get_All_Facility_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_Facility);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
