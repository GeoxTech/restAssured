package Response.providers_Response_Pojo;

public class create_OperatingHour_Response_Pojo {

        private String createdDate;
        private String lastModifiedDate;
        private float id;
        private String day;
        private String startTime;
        private String endTime;
        private boolean openedAllDay;
        private boolean closedAllDay;
        private String legacyReference = null;
        private float providerId;


        // Getter Methods

        public String getCreatedDate() {
            return createdDate;
        }

        public String getLastModifiedDate() {
            return lastModifiedDate;
        }

        public float getId() {
            return id;
        }

        public String getDay() {
            return day;
        }

        public String getStartTime() {
            return startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public boolean getOpenedAllDay() {
            return openedAllDay;
        }

        public boolean getClosedAllDay() {
            return closedAllDay;
        }

        public String getLegacyReference() {
            return legacyReference;
        }

        public float getProviderId() {
            return providerId;
        }

        // Setter Methods

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public void setLastModifiedDate(String lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
        }

        public void setId(float id) {
            this.id = id;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public void setOpenedAllDay(boolean openedAllDay) {
            this.openedAllDay = openedAllDay;
        }

        public void setClosedAllDay(boolean closedAllDay) {
            this.closedAllDay = closedAllDay;
        }

        public void setLegacyReference(String legacyReference) {
            this.legacyReference = legacyReference;
        }

        public void setProviderId(float providerId) {
            this.providerId = providerId;
        }

}
