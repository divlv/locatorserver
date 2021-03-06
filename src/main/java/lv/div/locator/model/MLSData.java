package lv.div.locator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Mozilla Location Services location points
 */
@Entity
@Table(name = "mlsdata")
public class MLSData {

    public static final int LAT_LON_DATA_LEN = 16;

    @Id
    @SequenceGenerator(name = "mlsdata_id_seq", sequenceName = "mlsdata_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mlsdata_id_seq")
    @Column(name = "id", updatable = false)
    private Integer id;

    @Column(name = "latitude", length = LAT_LON_DATA_LEN)
    private String latitude;

    @Column(name = "longitude", length = LAT_LON_DATA_LEN)
    private String longitude;

    @Column(name = "accuracy")
    private Double accuracy;

    @Column(name = "deviceid", length = 36)
    private String deviceId;

    @Column(name = "devicename", length = 32)
    private String deviceName;

    @Column(name = "inserted")
    private Timestamp inserted = new Timestamp((new Date()).getTime());

    @Column(name = "tag")
    private Integer tag;

    public MLSData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Timestamp getInserted() {
        return inserted;
    }

    public void setInserted(Timestamp inserted) {
        this.inserted = inserted;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MLSData mlsData = (MLSData) o;

        if (accuracy != null ? !accuracy.equals(mlsData.accuracy) : mlsData.accuracy != null) {
            return false;
        }
        if (deviceId != null ? !deviceId.equals(mlsData.deviceId) : mlsData.deviceId != null) {
            return false;
        }
        if (deviceName != null ? !deviceName.equals(mlsData.deviceName) : mlsData.deviceName != null) {
            return false;
        }
        if (id != null ? !id.equals(mlsData.id) : mlsData.id != null) {
            return false;
        }
        if (inserted != null ? !inserted.equals(mlsData.inserted) : mlsData.inserted != null) {
            return false;
        }
        if (latitude != null ? !latitude.equals(mlsData.latitude) : mlsData.latitude != null) {
            return false;
        }
        if (longitude != null ? !longitude.equals(mlsData.longitude) : mlsData.longitude != null) {
            return false;
        }
        if (tag != null ? !tag.equals(mlsData.tag) : mlsData.tag != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (accuracy != null ? accuracy.hashCode() : 0);
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (deviceName != null ? deviceName.hashCode() : 0);
        result = 31 * result + (inserted != null ? inserted.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        return result;
    }
}
