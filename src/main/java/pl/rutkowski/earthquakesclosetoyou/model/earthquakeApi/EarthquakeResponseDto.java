
package pl.rutkowski.earthquakesclosetoyou.model.earthquakeApi;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class EarthquakeResponseDto {

    private String type;
    private Metadata metadata;
    private List<Feature> features = null;
    private List<Double> bbox = null;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EarthquakeResponseDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null) ? "<null>" : this.metadata));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null) ? "<null>" : this.features));
        sb.append(',');
        sb.append("bbox");
        sb.append('=');
        sb.append(((this.bbox == null) ? "<null>" : this.bbox));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.features == null) ? 0 : this.features.hashCode()));
        result = ((result * 31) + ((this.metadata == null) ? 0 : this.metadata.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.bbox == null) ? 0 : this.bbox.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EarthquakeResponseDto rhs)) {
            return false;
        }
        return (Objects.equals(this.features, rhs.features) ||
                this.features != null && this.features.equals(rhs.features)) &&
                (Objects.equals(this.metadata, rhs.metadata) ||
                        this.metadata != null && this.metadata.equals(rhs.metadata)) &&
                Objects.equals(this.type, rhs.type) && (Objects.equals(this.bbox, rhs.bbox) ||
                this.bbox != null && this.bbox.equals(rhs.bbox));
    }

}
