package Response.Providers_Update_Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.processing.Generated;

@Builder
@Getter
@Setter
@ToString

@Generated("jsonschema2pojo")
public class updateProviderAdmin_Template_Pojo {

        @SerializedName("createdDate")
        @Expose
        private String createdDate;
        @SerializedName("lastModifiedDate")
        @Expose
        private String lastModifiedDate;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;
        @SerializedName("phoneNumber")
        @Expose
        private String phoneNumber;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("personReference")
        @Expose
        private String personReference;
        @SerializedName("userReference")
        @Expose
        private String userReference;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("legacyReference")
        @Expose
        private Object legacyReference;
        @SerializedName("isEmployee")
        @Expose
        private Object isEmployee;
        @SerializedName("providerId")
        @Expose
        private Integer providerId;
        @SerializedName("providerLegacyReference")
        @Expose
        private Object providerLegacyReference;
        @SerializedName("providerName")
        @Expose
        private Object providerName;
        @SerializedName("admin")
        @Expose
        private Object admin;
        @SerializedName("lastLogin")
        @Expose
        private Object lastLogin;
        @SerializedName("roles")
        @Expose
        private Object roles;

}
