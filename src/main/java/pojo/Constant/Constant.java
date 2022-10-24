package pojo.Constant;

import Base.TestBase;

public class Constant extends TestBase {
    //Notification MicroService
    public static String add_sms_template_EndPoint = "/basic-templates";
    public static String Update_sms_template_EndPoint = "/basic-templates";
    public static String Get_All_sms_template_EndPoint = "/basic-templates";
    public static String Get_sms_template_ID_EndPoint = "/basic-templates/6";
    public static String Get_sms_template_Invalid_ID_EndPoint = "/basic-templates/600";
    public static String Send_SMS_Template_EndPoint = "/notifications";
    public static String Delete_SMS_Template_EndPoint = "/basic-templates/";

    //Enrollee MicroService
    public static String Get_All_Favorite_Pharmacy_Endpoint ="/enrollees-favorite-pharmacy/";
    public static String Fetch_Pharmacy_List = "/wella-health-pharmacy";

    public static String Get_Pharmacy_ByName = "/pharmacy-providers/all?query=Allive pharmacy";

    //Provider MicroService
    public static String Exclude_Blacklisted_Pharmacy = "/exclude-black-listed-pharmacies";
    public static String Get_Address_State = "/address-states/15";
    public static String Get_ALL_Address_State = "/address-states";
    public static String Get_All_Amount_Debited = "/amount-debiteds";
    public static String Get_Amount_Debited = "/amount-debiteds/5";
    public static String Get_Amount_Deposited = "/amount-depositeds/30";
    public static String Get_All_Amount_Deposited = "/amount-depositeds";
    public static String Get_All_Bank_Account = "/bank-accounts";
    public static String Get_Bank_Account = "/bank-accounts/2";
    public static String Get_Bank_Type = "/bank-types/7";
    public static String Get_All_Bank_Type = "/bank-types";
    public static String Get_All_Banks = "/banks?offset=3767957&page=3767957&pageNumber=3767957&pageSize=3767957&paged=true&size=3767957&sort=dolore pariatur&sort=esse Lorem Ut aliqua dolor&sort.sorted=true&sort.unsorted=true&unpaged=true";
    public static String Get_Banks = "banks/1";
    public static String Create_Facility = "/facilities";
    public static String Get_All_Facility = "/facilities?offset=3767957&page=3767957&pageNumber=3767957&pageSize=3767957&paged=true&size=3767957&sort=dolore pariatur&sort=esse Lorem Ut aliqua dolor&sort.sorted=true&sort.unsorted=true&unpaged=true";
    public static String Get_All_Facility_ByCategory = "/facility-categories";
    public static String Get_All_Locations = "/locations";
    public static String Get_All_Medical_Qualification = "/medical-qualifications";
    public static String Get_All_Opening_Hour = "/operating-hours";
    public static  String Create_Bank_Endpoint = "/banks";
    public static String Get_Countries_Endpoint = "/countries";
    public static String Get_PhoneNumber_Endpoint = "/phone-numbers";
    public static String Get_Product_Endpoint = "/products";
    public static String Get_ProviderAdmin_Endpoint = "/provider-admins";
    public static String Get_ProviderHospitalInformation_Endpoint = "/provider-hospital-informations";
    public static String Get_ProviderImages_Endpoint = "/provider-images";
    public static String Get_ProviderMedicalStaff_Endpoint = "/provider-medical-staffs";
    public static String Get_Providers_Endpoint = "/providers";
    public static String Get_ProviderService_Endpoint = "/provider-services";
    public static String Get_ProviderSpecialization_Endpoint = "/provider-specializations";
    public static String Get_ProviderToProviderSpecialization_Endpoint = "/provider-to-provider-specilizations";
    public static String Get_Tiers_Endpoint = "/tiers";
    public static String Get_Types_Endpoint = "/types";


}
