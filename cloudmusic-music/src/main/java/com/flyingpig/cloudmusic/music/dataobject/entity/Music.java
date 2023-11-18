package com.flyingpig.cloudmusic.music.dataobject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author flyingpig
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("music")
public class Music {
    //雪花算法生成
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private String introduce;
    private String picture;
    private String path;
    private Long likeNum;
    private Long uploadUser;
    private String singer;
}