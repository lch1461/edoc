package cn.ebook.controller;

import cn.ebook.entity.EbookCategory;
import cn.ebook.entity.EbookEntry;
import cn.ebook.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Package: cn.ebook.controller
 * @Description:
 * @Author 吕晨寒
 * @Create 2021年04月03日 11时49分59秒
 */
@Controller
public class EbookController {

    @Autowired
    EbookService ebookService;

    @RequestMapping("list")
    public String list(@RequestParam(value = "categoryId",required = false)Integer categoryId, Model model){
        List<EbookEntry> entryList = ebookService.getEbookEntryByCid(categoryId);
        List<EbookCategory> categoryList = ebookService.ebookCategoryList();
        model.addAttribute("entryList",entryList);
        model.addAttribute("categoryList",categoryList);
        return "list";
    }

    @RequestMapping("deleteEntry")
    @ResponseBody
    public String deleteEntry(@RequestParam("id")Integer id){
        return ebookService.deleteEntryById(id)==1?"ok":"no";
    }

    @RequestMapping("toadd")
    public String add(){
        return "add";
    }

    @RequestMapping("add")
    public String addEntry(EbookEntry ebookEntry,Model model){
        ebookEntry.setCategoryId(2);
        ebookService.add(ebookEntry);
        model.addAttribute("ebookEntry",ebookEntry);
        return "redirect:list";
    }

    @RequestMapping("toupdate")
    public String update(@RequestParam("id")Integer id,Model model){
        EbookEntry ebookEntry = ebookService.updateById(id);
        model.addAttribute("ebookEntry",ebookEntry);
        return "update";
    }

    @RequestMapping("update")
    public String updateEntru(EbookEntry ebookEntry){
        ebookService.updateEntry(ebookEntry);
        return "redirect:list";
    }
}
