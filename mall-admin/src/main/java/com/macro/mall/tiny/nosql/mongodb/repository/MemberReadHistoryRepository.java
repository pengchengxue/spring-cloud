package com.macro.mall.tiny.nosql.mongodb.repository;
import com.macro.mall.tiny.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @Description:    会员商品浏览历史Repository
 * @Author:         pcx
 * @CreateDate: 2019/8/4 22:42
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/8/4 22:42
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {


    /**
    * 根据会员id按时间倒序获取浏览记录
    * @author      pcx
    * @param  memberId 会员id
    * @return
    * @exception
    * @date        2019/8/4 22:43
    */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);

}
