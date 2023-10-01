
package pl.rutkowski.earthquakesclosetoyou.model.earthquakeApi;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Properties {

    private Double mag;
    private String place;
    private Long time;
    private Long updated;
    private Object tz;
    private String url;
    private String detail;
    private Object felt;
    private Object cdi;
    private Object mmi;
    private Object alert;
    private String status;
    private Integer tsunami;
    private Integer sig;
    private String net;
    private String code;
    private String ids;
    private String sources;
    private String types;
    private Integer nst;
    private Double dmin;
    private Double rms;
    private Double gap;
    private String magType;
    private String type;
    private String title;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Properties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mag");
        sb.append('=');
        sb.append(((this.mag == null)?"<null>":this.mag));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("updated");
        sb.append('=');
        sb.append(((this.updated == null)?"<null>":this.updated));
        sb.append(',');
        sb.append("tz");
        sb.append('=');
        sb.append(((this.tz == null)?"<null>":this.tz));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("felt");
        sb.append('=');
        sb.append(((this.felt == null)?"<null>":this.felt));
        sb.append(',');
        sb.append("cdi");
        sb.append('=');
        sb.append(((this.cdi == null)?"<null>":this.cdi));
        sb.append(',');
        sb.append("mmi");
        sb.append('=');
        sb.append(((this.mmi == null)?"<null>":this.mmi));
        sb.append(',');
        sb.append("alert");
        sb.append('=');
        sb.append(((this.alert == null)?"<null>":this.alert));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("tsunami");
        sb.append('=');
        sb.append(((this.tsunami == null)?"<null>":this.tsunami));
        sb.append(',');
        sb.append("sig");
        sb.append('=');
        sb.append(((this.sig == null)?"<null>":this.sig));
        sb.append(',');
        sb.append("net");
        sb.append('=');
        sb.append(((this.net == null)?"<null>":this.net));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("ids");
        sb.append('=');
        sb.append(((this.ids == null)?"<null>":this.ids));
        sb.append(',');
        sb.append("sources");
        sb.append('=');
        sb.append(((this.sources == null)?"<null>":this.sources));
        sb.append(',');
        sb.append("types");
        sb.append('=');
        sb.append(((this.types == null)?"<null>":this.types));
        sb.append(',');
        sb.append("nst");
        sb.append('=');
        sb.append(((this.nst == null)?"<null>":this.nst));
        sb.append(',');
        sb.append("dmin");
        sb.append('=');
        sb.append(((this.dmin == null)?"<null>":this.dmin));
        sb.append(',');
        sb.append("rms");
        sb.append('=');
        sb.append(((this.rms == null)?"<null>":this.rms));
        sb.append(',');
        sb.append("gap");
        sb.append('=');
        sb.append(((this.gap == null)?"<null>":this.gap));
        sb.append(',');
        sb.append("magType");
        sb.append('=');
        sb.append(((this.magType == null)?"<null>":this.magType));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        result = ((result* 31)+((this.dmin == null)? 0 :this.dmin.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.sources == null)? 0 :this.sources.hashCode()));
        result = ((result* 31)+((this.tz == null)? 0 :this.tz.hashCode()));
        result = ((result* 31)+((this.mmi == null)? 0 :this.mmi.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.magType == null)? 0 :this.magType.hashCode()));
        result = ((result* 31)+((this.nst == null)? 0 :this.nst.hashCode()));
        result = ((result* 31)+((this.sig == null)? 0 :this.sig.hashCode()));
        result = ((result* 31)+((this.tsunami == null)? 0 :this.tsunami.hashCode()));
        result = ((result* 31)+((this.mag == null)? 0 :this.mag.hashCode()));
        result = ((result* 31)+((this.alert == null)? 0 :this.alert.hashCode()));
        result = ((result* 31)+((this.gap == null)? 0 :this.gap.hashCode()));
        result = ((result* 31)+((this.rms == null)? 0 :this.rms.hashCode()));
        result = ((result* 31)+((this.place == null)? 0 :this.place.hashCode()));
        result = ((result* 31)+((this.net == null)? 0 :this.net.hashCode()));
        result = ((result* 31)+((this.types == null)? 0 :this.types.hashCode()));
        result = ((result* 31)+((this.felt == null)? 0 :this.felt.hashCode()));
        result = ((result* 31)+((this.cdi == null)? 0 :this.cdi.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.ids == null)? 0 :this.ids.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.updated == null)? 0 :this.updated.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Properties rhs)) {
            return false;
        }
        return Objects.equals(this.dmin, rhs.dmin) && Objects.equals(this.code, rhs.code) &&
                Objects.equals(this.sources, rhs.sources) && (Objects.equals(this.tz, rhs.tz) ||
                this.tz != null && this.tz.equals(rhs.tz)) && (Objects.equals(this.mmi, rhs.mmi) ||
                this.mmi != null && this.mmi.equals(rhs.mmi)) && Objects.equals(this.type, rhs.type) &&
                Objects.equals(this.title, rhs.title) && Objects.equals(this.magType, rhs.magType) &&
                Objects.equals(this.nst, rhs.nst) && Objects.equals(this.sig, rhs.sig) &&
                Objects.equals(this.tsunami, rhs.tsunami) && Objects.equals(this.mag, rhs.mag) &&
                (Objects.equals(this.alert, rhs.alert) || this.alert != null && this.alert.equals(rhs.alert)) &&
                Objects.equals(this.gap, rhs.gap) && Objects.equals(this.rms, rhs.rms) &&
                Objects.equals(this.place, rhs.place) && Objects.equals(this.net, rhs.net) &&
                Objects.equals(this.types, rhs.types) && (Objects.equals(this.felt, rhs.felt) ||
                this.felt != null && this.felt.equals(rhs.felt)) && (Objects.equals(this.cdi, rhs.cdi) ||
                this.cdi != null && this.cdi.equals(rhs.cdi)) && Objects.equals(this.url, rhs.url) &&
                Objects.equals(this.ids, rhs.ids) && Objects.equals(this.time, rhs.time) &&
                Objects.equals(this.detail, rhs.detail) && Objects.equals(this.updated, rhs.updated) &&
                Objects.equals(this.status, rhs.status);
    }

}
