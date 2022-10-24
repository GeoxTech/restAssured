package pojo;

import Response.Providers_Update_Pojo.*;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import pojo.Constant.Update_SMS_Template.Update_SMS_Template_Pojo;
import pojo.SMS_Template.sms_Template;
import pojo.providers_Request_Pojo.*;
import pojo.providers_Request_Pojo.createFacilityCategory_Request_Pojo.createFacilityCategory_Request_Pojo;

import java.util.ArrayList;

import static utility.Utility.fetchvalue;

public class PayloadManager {

    private static Gson gson = new Gson();

    public static String AuthorizationPayload() {
        return gson.toJson(LoginPojo.builder().login(fetchvalue("Email"))
                .password(fetchvalue("Password")).build());
    }

    public static String Add_SMS_Template_Payload() {
        return gson.toJson(sms_Template.builder().name(new Faker().app().name() + " " + new Faker().name().fullName())
                .content(new Faker().name().fullName()).build());
    }

    public static String Update_SMS_Template_Payload() {
        return gson.toJson(Update_SMS_Template_Pojo.builder()
                .id(5)
                .name(new Faker().app().name())
                .content(new Faker().name().fullName()).build());
    }

    // Request Pojo for Provider MS
    public static String create_Bank_Payload() {
        createBank_Request_Pojo Request = createBank_Request_Pojo.builder()
                .code(new Faker().number().digit())
                .name(new Faker().name().name())
                .createdDate("1985-09-02T22:31:46.751Z")
                .lastModifiedDate("2012-12-24T09:39:55.717Z")
                .slug(new Faker().name().fullName())
                .build();
        return gson.toJson(Request);
    }

    public static String create_Bank_Type_Payload() {
        createBankType_Request_Pojo Request = createBankType_Request_Pojo.builder()
                .name(new Faker().name().name())
                .createdDate("2022-09-01T08:11:39.677851Z")
                .lastModifiedDate("2012-12-24T09:39:55.717Z")
                .build();
        return gson.toJson(Request);
    }

    public static String create_Address_State_Payload() {
        createAddressState_Request_Pojo Request = createAddressState_Request_Pojo.builder()
                .legacyReference(new Faker().number().randomNumber())
                .name(new Faker().name().name())
                .code(new Faker().country().name())
                .salesRegion("SOUTH_EAST")
                .zoneId(4)
                .localGovernmentAreas("null")
                .build();
        return gson.toJson(Request);
    }

    public static String create_Country_Payload() {
        createCountry_Request_Pojo Request = createCountry_Request_Pojo.builder()
                .name(new Faker().country().name())
                .createdDate("2022-09-01T08:11:39.677851Z")
                .lastModifiedDate("2012-12-24T09:39:55.717Z")
                .build();
        return gson.toJson(Request);
    }

    public static String create_Facility_Payload() {
        createFacility_Request_Pojo Request = createFacility_Request_Pojo.builder()
                .categoryId(9)
                .code(new Faker().code().ean8())
                .name(new Faker().name().fullName())
                .createdDate("2022-09-01T08:11:39.677851Z")
                .lastModifiedDate("2012-12-24T09:39:55.717Z")
                .build();
        return gson.toJson(Request);
    }

    public static String create_FacilityCategory_Payload() {
        createFacilityCategory_Request_Pojo Request = createFacilityCategory_Request_Pojo.builder()
                .customFacilities(new ArrayList<>())
                .facilities(new ArrayList<>())
                .name(new Faker().name().fullName())
                .createdDate("2022-09-01T08:11:39.677851Z")
                .lastModifiedDate("2012-12-24T09:39:55.717Z")
                .build();
        return gson.toJson(Request);
    }

    public static String create_Amount_Debited_Payload() {
        createAmountDebited_Request_Pojo Request = createAmountDebited_Request_Pojo.builder()
                .amount(new Faker().number().randomNumber())
                .createdDate("2022-10-04T15:50:33.511905Z")
                .lastModifiedDate("2022-10-04T15:50:33.511905Z")
                .providerId(4)
                .build();
        return gson.toJson(Request);
    }

    public static String create_Location_Payload() {
        createLocation_Request_Pojo Request = createLocation_Request_Pojo.builder()
                .name(new Faker().country().capital())
                .createdDate("2022-10-04T15:50:33.511905Z")
                .lastModifiedDate("2022-10-04T15:50:33.511905Z")
                .legacyReference(new Faker().number().randomNumber())
                .build();
        return gson.toJson(Request);
    }

    public static String create_MedicalQualification_Payload() {
        createMedicalQualifications_Request_Pojo Request = createMedicalQualifications_Request_Pojo.builder()
                .name(new Faker().educator().course())
                .createdDate("2021-05-10T12:02:04.104Z")
                .lastModifiedDate("1978-03-10T22:05:43.626Z")
                .build();
        return gson.toJson(Request);
    }

    public static String create_OperatingHour_Payload() {
        createOperatingHour_Request_Pojo Request = createOperatingHour_Request_Pojo.builder()
                .day("tuesday")
                .closedAllDay(false)
                .createdDate("2022-10-04T15:50:33.511905Z")
                .endTime("2004-04-08T12:43:05.116Z")
                .lastModifiedDate("2022-10-04T15:50:33.511905Z")
                .openedAllDay(false)
                .providerId(375)
                .startTime("2013-05-19T03:54:46.739Z")
                .build();
        return gson.toJson(Request);
    }

    public static String createType_Payload() {
        createType_Request_Pojo Request = createType_Request_Pojo.builder()
                .name(new Faker().medical().hospitalName())
                .service(new Faker().medical().medicineName())
                .legacyReference(new Faker().number().randomNumber())
                .createdDate("2021-05-10T12:02:04.104Z")
                .lastModifiedDate("1978-03-10T22:05:43.626Z")
                .build();
        return gson.toJson(Request);
    }
    public static String UpdateType_Payload() {
        return gson.toJson(updateType_Template_Pojo.builder()
                .id(3)
                .legacyReference((int) new Faker().number().randomNumber())
                .name("Dental Clinic")
                .service("Dental services")
                .build());
    }
    public static String createTier_Payload() {
        createTier_Request_Pojo Request = createTier_Request_Pojo.builder()
                .name(new Faker().company().industry())
                .code(new Faker().code().ean8())
                .legacyReference(new Faker().number().randomNumber())
                .createdDate("2021-05-10T12:02:04.104Z")
                .lastModifiedDate("1978-03-10T22:05:43.626Z")
                .build();
        return gson.toJson(Request);
    }
    public static String UpdateTier_Payload() {
        return gson.toJson(updateTier_Template_Pojo.builder()
                .id(8)
                .legacyReference((int) new Faker().number().randomNumber())
                .name("Dental Clinic")
                .code("251385595")
                .build());
    }
    public static String createProviderSP_Payload() {
        createProviderSpecialization_Request_Pojo Request = createProviderSpecialization_Request_Pojo.builder()
                .name(new Faker().medical().symptoms())
                .alternativeName(new Faker().code().ean8())
                .careType(new Faker().name().username())
                .topReasons(new Faker().lordOfTheRings().location())
                .createdDate("2021-05-10T12:02:04.104Z")
                .lastModifiedDate("1978-03-10T22:05:43.626Z")
                .build();
        return gson.toJson(Request);
    }
    public static String UpdateProviderSpecialization_Payload() {
        return gson.toJson(updateProviderSpecialization_Template_Pojo.builder()
                .id(1)
                .legacyReference((int) new Faker().number().randomNumber())
                .name("Surgeon")
                .alternativeName("Surgery")
                .careType("operations")
                .topReasons("<p>cool</p>")
                .build());
    }
    public static String create_ProviderService_Payload() {
        createProviderService_Request_Pojo Request = createProviderService_Request_Pojo.builder()
                .name(new Faker().job().keySkills())
                .legacyReference(new Faker().number().randomNumber())
                .createdDate("2021-05-10T12:02:04.104Z")
                .lastModifiedDate("1978-03-10T22:05:43.626Z")
                .build();
        return gson.toJson(Request);
    }
    public static String UpdateProviderService_Payload() {
        return gson.toJson(updateTier_Template_Pojo.builder()
                .id(33)
                .legacyReference((int) new Faker().number().randomNumber())
                .name(new Faker().job().keySkills())
                .legacyReference(501)
                .createdDate("2022-10-15T08:14:36.010140Z")
                .build());
    }
    public static String createProviderImage_Payload() {
        createProviderImage_Request_Pojo Request = createProviderImage_Request_Pojo.builder()
                .originalName(new Faker().name().username())
                .key(new Faker().pokemon().location())
                .providerId(374)
                .legacyReference(new Faker().number().randomNumber())
                .url(new Faker().lorem().characters())
                .createdDate("2021-05-10T12:02:04.104Z")
                .lastModifiedDate("1978-03-10T22:05:43.626Z")
                .build();
        return gson.toJson(Request);
    }
    public static String UpdateProviderImage_Payload() {
        return gson.toJson(updateProviderImage_Template_Pojo.builder()
                .id(14)
                .legacyReference((int) new Faker().number().randomNumber())
                .originalName(new Faker().job().keySkills())
                .providerId(374)
                .key("dolorR")
                .url("eu nulla ")
                .createdDate("2022-10-15T08:14:36.010140Z")
                .build());
    }
    public static String createProviderAdmin_Payload() {
        createProviderAdmin_Request_Pojo Request = createProviderAdmin_Request_Pojo.builder()
                .email(new Faker().internet().emailAddress())
                .firstName(new Faker().name().firstName())
                .lastName(new Faker().name().lastName())
                .personReference("Testing")
                .phoneNumber("09161179883")
                .providerId(374)
                .providerName(new Faker().company().name())
                .role("BILLING_OFFICER")
                .userReference(new Faker().company().buzzword())
                .createdDate("2021-05-10T12:02:04.104Z")
                .lastModifiedDate("1978-03-10T22:05:43.626Z")
                .build();
        return gson.toJson(Request);
    }
    public static String UpdateProviderAdmin_Payload() {
        return gson.toJson(updateProviderAdmin_Template_Pojo.builder()
                .id(192)
                .legacyReference((int) new Faker().number().randomNumber())
                .providerName(new Faker().company().name())
                .email(new Faker().internet().emailAddress())
                .firstName("Yaya Bello")
                .personReference("sunt et dolore qui")
                .userReference("officia cupidatat pariatur")
                .legacyReference(null)
                .lastName("Lolade")
                .providerId(374)
                .role("BILLING_OFFICER")
                .createdDate("2021-05-10T12:02:04.104Z")
                .lastModifiedDate("1978-03-10T22:05:43.626Z")
                .build());
    }
    public static String createProducts_Payload() {
        createProduct_Request_Pojo Request = createProduct_Request_Pojo.builder()
                .clientTypeName("Retail")
                .clientTypeReference(new Faker().company().buzzword())
                .name(new Faker().company().name())
                .planName(new Faker().medical().medicineName())
                .planReference("Retail")
                .planTypeName(new Faker().lordOfTheRings().character())
                .planTypeReference(new Faker().job().title())
                .productReference(new Faker().company().name())
                .providerDefault (false)
                .tierCode("culpa do voluptate veniam incididu")
                .type("COMBINED")
                .createdDate("1946-10-31T17:25:23.641Z")
                .lastModifiedDate("2006-08-16T11:40:12.783Z")
                .build();
        return gson.toJson(Request);
    }

}