package memo.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ScoreVO {
    private int id;
    private int usrId;
    private int contentsId;
    private int score;
}