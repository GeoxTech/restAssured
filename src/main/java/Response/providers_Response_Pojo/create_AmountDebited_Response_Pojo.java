package Response.providers_Response_Pojo;

public class create_AmountDebited_Response_Pojo {

        private String createdDate;
        private String lastModifiedDate;
        private float id;
        private float amount;
        private float providerId;
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

        public float getAmount() {
            return amount;
        }

        public float getProviderId() {
            return providerId;
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

        public void setAmount(float amount) {
            this.amount = amount;
        }

        public void setProviderId(float providerId) {
            this.providerId = providerId;
        }

        public void setLegacyReference(String legacyReference) {
            this.legacyReference = legacyReference;
        }
}
