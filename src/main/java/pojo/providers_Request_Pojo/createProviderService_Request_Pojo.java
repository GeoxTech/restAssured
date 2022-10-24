package pojo.providers_Request_Pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class createProviderService_Request_Pojo {

        private String name;
        private String createdDate;
        private float legacyReference;
        private String lastModifiedDate;

}
