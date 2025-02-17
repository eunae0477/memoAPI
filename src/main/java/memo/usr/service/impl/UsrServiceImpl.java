package memo.usr.service.impl;

import lombok.RequiredArgsConstructor;
import memo.usr.mapper.UsrMapper;
import memo.usr.service.UsrService;
import memo.vo.UsrVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "usrService")
@RequiredArgsConstructor
public class UsrServiceImpl implements UsrService {
    private final UsrMapper usrMapper;

    @Override
    public List<UsrVO> usrList() {
        // 🚨 여기서 `usrMapper`가 `null`이면 MyBatis가 매퍼를 로드하지 못한 것임!
        if (usrMapper == null) {
            throw new RuntimeException("usrMapper가 MyBatis에 의해 주입되지 않았음!");
        }

        // 🚨 `usrList` 메서드가 존재하는지 확인하기 위해 SQL 실행 전 로그 찍기
        System.out.println("==== MyBatis UsrMapper 실행 ====");

        return usrMapper.usrList();
    }
}
