package pojo.providers_Request_Pojo.createFacilityCategory_Request_Pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;

@Getter
@Setter
@Builder

@Generated("jsonschema2pojo")
    public class createFacilityCategory_Request_Pojo {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("createdDate")
        @Expose
        private String createdDate;
        @SerializedName("customFacilities")
        @Expose
        private List<CustomFacility> customFacilities = null;
        @SerializedName("facilities")
        @Expose
        private List<Facility> facilities = null;
        @SerializedName("lastModifiedDate")
        @Expose
        private String lastModifiedDate;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public List<CustomFacility> getCustomFacilities() {
            return customFacilities;
        }

        public void setCustomFacilities(List<CustomFacility> customFacilities) {
            this.customFacilities = customFacilities;
        }

        public List<Facility> getFacilities() {
            return facilities;
        }

        public void setFacilities(List<Facility> facilities) {
            this.facilities = facilities;
        }

        public String getLastModifiedDate() {
            return lastModifiedDate;
        }

        public void setLastModifiedDate(String lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
        }


}
