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
public class updateProviderSpecialization_Template_Pojo {

        @SerializedName("createdDate")
        @Expose
        private String createdDate;
        @SerializedName("lastModifiedDate")
        @Expose
        private String lastModifiedDate;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("alternativeName")
        @Expose
        private String alternativeName;
        @SerializedName("careType")
        @Expose
        private String careType;
        @SerializedName("topReasons")
        @Expose
        private String topReasons;
        @SerializedName("legacyReference")
        @Expose
        private Integer legacyReference;

}
