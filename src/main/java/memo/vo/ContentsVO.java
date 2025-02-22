package memo.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ContentsVO extends SearchVO{
    private int id;
    private String title;
    private String author;
    private String categoryCode;
    private String platformCode;
    private String typeCode;
    private String img;
}
