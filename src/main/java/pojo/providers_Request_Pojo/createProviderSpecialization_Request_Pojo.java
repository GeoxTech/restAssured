package pojo.providers_Request_Pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class createProviderSpecialization_Request_Pojo {

        private String name;
        private String alternativeName;
        private String careType;
        private String createdDate;
        private String lastModifiedDate;
        private String topReasons;

}
