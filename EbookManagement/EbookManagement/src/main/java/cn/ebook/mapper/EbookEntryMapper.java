package cn.ebook.mapper;

import cn.ebook.entity.EbookEntry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Package: cn.ebook.mapper
 * @Description:
 * @Author 吕晨寒
 * @Create 2021年04月03日 11时58分02秒
 */
public interface EbookEntryMapper {


    List<EbookEntry> getEbookEntryByCid(@Param("cid") Integer cid);

    Integer deleteEntryById(@Param("id")Integer id);

    int add(EbookEntry ebookEntry);

    EbookEntry updateById(Integer id);

    int updateEntry(EbookEntry ebookEntry);
}
