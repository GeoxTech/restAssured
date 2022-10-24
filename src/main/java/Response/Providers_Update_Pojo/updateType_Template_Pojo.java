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
public class updateType_Template_Pojo {

        @SerializedName("createdDate")
        @Expose
        private String createdDate;
        @SerializedName("lastModifiedDate")
        @Expose
        private String lastModifiedDate;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("legacyReference")
        @Expose
        private Integer legacyReference;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("service")
        @Expose
        private String service;


}

