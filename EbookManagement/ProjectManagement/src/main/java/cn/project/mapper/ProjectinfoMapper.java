package cn.project.mapper;

import cn.project.entity.Projectinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Package: cn.project.mapper
 * @Description:
 * @Author 吕晨寒
 * @Create 2021年04月05日 13时40分55秒
 */
public interface ProjectinfoMapper {

    List<Projectinfo> getProjectInfoByPage(@Param("status")Integer status,@Param("page")Integer page,@Param("limit")Integer limit);

    Integer getProjectInfoCount(@Param("status")Integer status);

    Projectinfo getProjectInfoById(Integer id);

    Integer modifyProject(@Param("id")Integer id,@Param("status")Integer status);
}
