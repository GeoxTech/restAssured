package Response.providers_Response_Pojo;

public class create_Facility_Response_Pojo {

        private String createdDate;
        private String lastModifiedDate;
        private float id;
        private String name;
        private String code;
        private String legacyReference = null;
        private float categoryId;


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

        public String getCode() {
            return code;
        }

        public String getLegacyReference() {
            return legacyReference;
        }

        public float getCategoryId() {
            return categoryId;
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

        public void setCode(String code) {
            this.code = code;
        }

        public void setLegacyReference(String legacyReference) {
            this.legacyReference = legacyReference;
        }

        public void setCategoryId(float categoryId) {
            this.categoryId = categoryId;
        }
}
