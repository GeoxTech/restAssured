package pojo.providers_Request_Pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class createBank_Request_Pojo {

        private String code;
        private String name;
        private String createdDate;
        private String lastModifiedDate;
        private String slug;


    }

