package pojo.providers_Request_Pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class createLocation_Request_Pojo {

        private String createdDate;
        private String lastModifiedDate;
        private float legacyReference;
        private String name;

}
