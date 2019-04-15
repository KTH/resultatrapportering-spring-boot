package se.kth.resultatrapportering;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ResultatrapporteringController {

  private final ResultatrapporteringService resultatrapportering;

  @PostMapping("/export")
  @ResponseBody
  public String export(@RequestParam("custom_canvas_course_id") int canvasCourseId) {
    resultatrapportering.exportCanvasCourseGradesToLadokBetyg(canvasCourseId);
    return "Export finished successfully";
  }
}
