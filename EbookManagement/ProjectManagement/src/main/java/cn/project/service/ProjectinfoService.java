package cn.project.service;

import cn.project.entity.Projectinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Package: cn.project.service
 * @Description:
 * @Author 吕晨寒
 * @Create 2021年04月05日 13时46分37秒
 */
public interface ProjectinfoService {

    List<Projectinfo> getProjectInfoByPage(Integer status,Integer page,Integer limit);

    Integer getProjectInfoCount(Integer status);

    Projectinfo getProjectInfoById(Integer id);

    Integer modifyProject(Integer id,Integer status);
}
