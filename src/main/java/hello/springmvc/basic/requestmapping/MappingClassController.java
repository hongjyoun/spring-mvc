package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users") // 이걸 하면, 원래 @GetMapping 안에 @GetMapping("/mapping/users") 이런 식으로 적혀있던건데, 그런 중복을 다 없애준다.
public class MappingClassController {

  @GetMapping()
  public String user() {
    return "get users";
  }

  @PostMapping()
  public String addUser() {
    return "post users";
  }

  @GetMapping("/{userId}")
  public String findUser(@PathVariable String userId) {
    return "get userid=" + userId;
  }

  @PatchMapping("/{userId}")
  public String updateUser(@PathVariable String userId) {
    return "update userid=" + userId;
  }

  @DeleteMapping("/{userId}")
  public String deleteUser(@PathVariable String userId) {
    return "delete userid=" + userId;
  }
}
