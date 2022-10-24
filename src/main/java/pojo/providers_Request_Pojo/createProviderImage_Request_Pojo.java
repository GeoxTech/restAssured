package pojo.providers_Request_Pojo;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class createProviderImage_Request_Pojo {

        private String createdDate;
        private String key;
        private String lastModifiedDate;
        private String originalName;
        private float providerId;
        private float legacyReference;
        private String url;

}
