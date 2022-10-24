package pojo.providers_Request_Pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class createProviderAdmin_Request_Pojo {

        private String email;
        private String firstName;
        private String lastName;
        private String createdDate;
        private String lastModifiedDate;
        private String personReference;
        private String phoneNumber;
        private float providerId;
        private String providerName;
        private String role;
        private String userReference;

}
