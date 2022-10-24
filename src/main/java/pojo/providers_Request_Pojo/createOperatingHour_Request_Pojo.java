package pojo.providers_Request_Pojo;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class createOperatingHour_Request_Pojo {

        private String day;
        private boolean closedAllDay;
        private String createdDate;
        private String endTime;
        private String lastModifiedDate;
        private boolean openedAllDay;
        private float providerId;
        private String startTime;


}
