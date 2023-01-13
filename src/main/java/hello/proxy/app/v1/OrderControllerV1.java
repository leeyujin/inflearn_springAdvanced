package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping// 스프링은 @Controller 또는 @RequestMapping이 있어야 스프링 컨트롤러로 인식
@ResponseBody
public interface OrderControllerV1 {

    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId); // i/f는 @RequestParam을 명시해줘야 제대로 동작함 (java version예따라 상이)

    @GetMapping("/v1/no-log")
    String noLog();
}
