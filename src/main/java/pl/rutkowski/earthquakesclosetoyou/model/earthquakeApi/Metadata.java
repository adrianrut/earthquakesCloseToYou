
package pl.rutkowski.earthquakesclosetoyou.model.earthquakeApi;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Metadata {

    private Long generated;
    private String url;
    private String title;
    private Integer status;
    private String api;
    private Integer count;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("generated");
        sb.append('=');
        sb.append(((this.generated == null)?"<null>":this.generated));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("api");
        sb.append('=');
        sb.append(((this.api == null)?"<null>":this.api));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
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
        result = ((result* 31)+((this.generated == null)? 0 :this.generated.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.api == null)? 0 :this.api.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Metadata rhs)) {
            return false;
        }
        return Objects.equals(this.generated, rhs.generated) && Objects.equals(this.count, rhs.count) &&
                Objects.equals(this.api, rhs.api) && Objects.equals(this.title, rhs.title) &&
                Objects.equals(this.url, rhs.url) && Objects.equals(this.status, rhs.status);
    }

}
