package cn.ebook.service.impl;

import cn.ebook.entity.EbookCategory;
import cn.ebook.entity.EbookEntry;
import cn.ebook.mapper.EbookCategoryMapper;
import cn.ebook.mapper.EbookEntryMapper;
import cn.ebook.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: cn.ebook.service.impl
 * @Description:
 * @Author 吕晨寒
 * @Create 2021年04月03日 12时49分33秒
 */
@Service
public class EbookServiceImpl implements EbookService {

    @Autowired
    EbookEntryMapper ebookEntryMapper;

    @Autowired
    EbookCategoryMapper ebookCategoryMapper;


    @Override
    public List<EbookEntry> getEbookEntryByCid(Integer cid) {
        return ebookEntryMapper.getEbookEntryByCid(cid);
    }

    @Override
    public List<EbookCategory> ebookCategoryList() {
        return ebookCategoryMapper.ebookCategoryList()  ;
    }

    @Override
    public Integer deleteEntryById(Integer id) {
        return ebookEntryMapper.deleteEntryById(id);
    }

    @Override
    public int add(EbookEntry ebookEntry) {
        return ebookEntryMapper.add(ebookEntry);
    }

    @Override
    public EbookEntry updateById(Integer id) {
        return ebookEntryMapper.updateById(id);
    }

    @Override
    public int updateEntry(EbookEntry ebookEntry) {
        return ebookEntryMapper.updateEntry(ebookEntry);
    }
}
