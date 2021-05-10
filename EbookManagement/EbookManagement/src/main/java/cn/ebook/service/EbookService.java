package cn.ebook.service;

import cn.ebook.entity.EbookCategory;
import cn.ebook.entity.EbookEntry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Package: cn.ebook.service
 * @Description:
 * @Author 吕晨寒
 * @Create 2021年04月03日 12时48分58秒
 */
public interface EbookService {

    List<EbookEntry> getEbookEntryByCid(Integer cid);

    List<EbookCategory> ebookCategoryList();

    Integer deleteEntryById(@Param("id")Integer id);

    int add(EbookEntry ebookEntry);

    EbookEntry updateById(Integer id);

    int updateEntry(EbookEntry ebookEntry);
}
