package pojo.providers_Request_Pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class createProduct_Request_Pojo {

        private String clientTypeName;
        private String clientTypeReference;
        private String name;
        private String planName;
        private String planReference;
        private String planTypeName;
        private String planTypeReference;
        private String productReference;
        private boolean providerDefault;
        private String tierCode;
        private String type;
        private String createdDate;
        private String lastModifiedDate;

}
