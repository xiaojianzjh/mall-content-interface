package com.mall.content.service;
import java.util.List;

import com.mall.entity.PageResult;
import com.mall.pojo.TbContentCategory;

/**
 * �����ӿ�
 * @author Administrator
 *
 */
public interface ContentCategoryService {

	/**
	 * ����ȫ���б�
	 * @return
	 */
	public List<TbContentCategory> findAll();
	
	
	/**
	 * ���ط�ҳ�б�
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * ����
	*/
	public void add(TbContentCategory contentCategory);
	
	
	/**
	 * �޸�
	 */
	public void update(TbContentCategory contentCategory);
	

	/**
	 * ����ID��ȡʵ��
	 * @param id
	 * @return
	 */
	public TbContentCategory findOne(Long id);
	
	
	/**
	 * ����ɾ��
	 * @param ids
	 */
	public void delete(Long [] ids);

	/**
	 * ��ҳ
	 * @param pageNum ��ǰҳ ��
	 * @param pageSize ÿҳ��¼��
	 * @return
	 */
	public PageResult findPage(TbContentCategory contentCategory, int pageNum,int pageSize);
	
}
