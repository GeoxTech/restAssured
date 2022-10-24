package pojo.providers_Request_Pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class createAmountDebited_Request_Pojo {

        private float amount;
        private String createdDate;
        private String lastModifiedDate;
        private float providerId;
}
