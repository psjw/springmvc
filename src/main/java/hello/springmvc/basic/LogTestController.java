package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@Controller -> return view 이름이 반환
@RestController //String 바로 반환
//@Slf4j
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());
    private final Logger log = LoggerFactory.getLogger(LogTestController.class);
    
    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name);
        log.trace(" trace my log="+ name); //이렇게 사용하면 안됨 -> info설정시 출력되면 안됨
        //log.trace를 호출하기전에
        // 1. 치환 " trace my log="+ "Spring"
        // 2. 연산 " trace my log=Spring" -> 쓸모 없는 연산이 일어남
        // 3. 메서드 호출 log.trace(" trace my log=Spring")

        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info(" info log={}",name);
        log.warn(" warn log={}",name);
        log.error("error log={}",name);

        return "ok";
    }
}
