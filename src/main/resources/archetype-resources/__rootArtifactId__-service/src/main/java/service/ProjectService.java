/**
 * <p>Copyright ® 迷彩CMS平台版权所有。</p>
 * 类名: ProjectService
 * 创建人: zhaoxg    创建时间: 2015年7月15日
 */

package ${package}.service;

import java.util.List;
import java.util.Map;

import ${package}.domain.po.ProjectPO;

/**
 * TODO <功能简述> <br/>
 * TODO <功能详细描述>
 * @author zhaoxg
 */
public interface ProjectService {
    /**
     * 
     * 新增记录
     * @param po
     * @return Exception
     */
    public int insertProject(ProjectPO po)throws Exception;
    /**
     * 
     * 更新记录
     * @param po
     * @return Exception
     */
    public int updateProjectById(ProjectPO po)throws Exception;
   
    /**
     * 
     * 查询列表
     * @param po
     * @return Exception
     */
    public List<ProjectPO> getProjectList(Map map,int pageNo,int pageSize)throws Exception;
    
    /**
     * 
     * 根据ID获取一个对象
     * @param po
     * @return Exception
     */
    public ProjectPO getProjectById(String id)throws Exception;
    
    /**
     * 
     * 根据ID删除记录
     * @param id
     * @return Exception
     */
    public int deleteProjectById(String id)throws Exception;
    
    /**
     * 
     * 查询对象列表 <br/>
     * @return
     * @throws Exception
     */
    public ProjectPO selectObject()throws Exception;
}
