package Response.providers_Response_Pojo;

public class create_FacilityCategory_Response_Pojo {

        private String createdDate;
        private String lastModifiedDate;
        private float id;
        private String name;
        private String legacyReference = null;


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

        public String getName() {
            return name;
        }

        public String getLegacyReference() {
            return legacyReference;
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

        public void setName(String name) {
            this.name = name;
        }

        public void setLegacyReference(String legacyReference) {
            this.legacyReference = legacyReference;
        }
}
