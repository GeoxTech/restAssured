package Response.providers_Response_Pojo;

public class create_Country_Response_Pojo {

        private String createdDate;
        private String lastModifiedDate;
        private float id;
        private String name;
        private String nationality = null;
        private String dialling_code = null;
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

        public String getNationality() {
            return nationality;
        }

        public String getDialling_code() {
            return dialling_code;
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

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public void setDialling_code(String dialling_code) {
            this.dialling_code = dialling_code;
        }

        public void setLegacyReference(String legacyReference) {
            this.legacyReference = legacyReference;
        }
}
