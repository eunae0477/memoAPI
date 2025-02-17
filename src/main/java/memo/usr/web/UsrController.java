package memo.usr.web;

import lombok.RequiredArgsConstructor;
import memo.usr.service.UsrService;
import memo.vo.UsrVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UsrController {

    private final UsrService usrService;

    @GetMapping(value = "/usr-list")
    private String usrList() {
        List<UsrVO> resultList = usrService.usrList();

        return "test";
    }
}
