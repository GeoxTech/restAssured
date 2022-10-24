package pojo.providers_Request_Pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class createFacility_Request_Pojo {

        private float categoryId;
        private String code;
        private String name;
        private String createdDate;
        private String lastModifiedDate;

}
