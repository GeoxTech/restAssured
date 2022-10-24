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
public class updateProviderImage_Template_Pojo {

        @SerializedName("createdDate")
        @Expose
        private String createdDate;
        @SerializedName("lastModifiedDate")
        @Expose
        private String lastModifiedDate;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("originalName")
        @Expose
        private String originalName;
        @SerializedName("key")
        @Expose
        private String key;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("legacyReference")
        @Expose
        private Integer legacyReference;
        @SerializedName("providerId")
        @Expose
        private Integer providerId;

}
