
package pl.rutkowski.earthquakesclosetoyou.model.googleMapsApi;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GoogleMapsResponseDto {

    private List<Candidate> candidates;
    private String status;
    public List<Object> htmlAttributions;
    public Result result;


}
