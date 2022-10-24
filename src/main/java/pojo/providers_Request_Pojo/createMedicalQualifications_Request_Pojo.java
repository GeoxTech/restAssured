package pojo.providers_Request_Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Getter
@Setter
@Builder

@Generated("jsonschema2pojo")
public class createMedicalQualifications_Request_Pojo {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("createdDate")
        @Expose
        private String createdDate;
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

        public String getLastModifiedDate() {
            return lastModifiedDate;
        }

        public void setLastModifiedDate(String lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
        }

}
