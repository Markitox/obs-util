package obs.util.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Video {
  private String id;
  private String showName;
  private String showTitle;
  private String showSubtitle;
  private String logoUrl = "";
  private Boolean logoCircled = Boolean.FALSE;
  private FileProps startTimeInfo = null;

  private List<Resource> resources;
  private List<Participant> participants;
  private YouTubeBroadcast youTube;
}
