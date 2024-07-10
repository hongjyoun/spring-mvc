package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

  //  private final Logger log = LoggerFactory.getLogger(getClass()); // @Slf4j 어노테이션을 사용하면, 이걸 생략할 수 있다.

  @RequestMapping("/log-test")
  public String logTest() {
    String name = "hong";
    String hello = "안뇽";

    log.trace("trace log = {} {}", name, hello); // 이건 안찍힘 (application.properties 에서 설정해줘야함)
    log.debug("debug log = {}", name);// 이건 안찍힘 (application.properties 에서 설정해줘야함)
    log.info("info log = {}", name);
    log.warn("warn log = {}", name);
    log.error("error log = {}", name);

    return "ok";
  };
}
