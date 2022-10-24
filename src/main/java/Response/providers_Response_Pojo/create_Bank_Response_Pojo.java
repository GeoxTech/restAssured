package Response.providers_Response_Pojo;

public class create_Bank_Response_Pojo {

        private String createdDate;
        private String lastModifiedDate;
        private float id;
        private String legacyReference = null;
        private String name;
        private String slug;
        private String code;


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

        public String getLegacyReference() {
            return legacyReference;
        }

        public String getName() {
            return name;
        }

        public String getSlug() {
            return slug;
        }

        public String getCode() {
            return code;
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

        public void setLegacyReference(String legacyReference) {
            this.legacyReference = legacyReference;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public void setCode(String code) {
            this.code = code;
        }

}
