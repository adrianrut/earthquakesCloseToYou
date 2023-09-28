
package pl.rutkowski.earthquakesclosetoyou.model.earthquakeApi;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class Geometry {

    private String type;
    private List<Double> coordinates = null;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Geometry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("coordinates");
        sb.append('=');
        sb.append(((this.coordinates == null)?"<null>":this.coordinates));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.coordinates == null)? 0 :this.coordinates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Geometry rhs)) {
            return false;
        }
        return Objects.equals(this.type, rhs.type) && (Objects.equals(this.coordinates, rhs.coordinates));
    }

}
