package Response.providers_Response_Pojo;



public class create_ProviderImage_Response_Pojo {

        private String createdDate;
        private String lastModifiedDate;
        private float id;
        private String originalName;
        private String key;
        private String url;
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

        public String getOriginalName() {
            return originalName;
        }

        public String getKey() {
            return key;
        }

        public String getUrl() {
            return url;
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

        public void setOriginalName(String originalName) {
            this.originalName = originalName;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setLegacyReference(String legacyReference) {
            this.legacyReference = legacyReference;
        }

        public void setProviderId(float providerId) {
            this.providerId = providerId;
        }
}
