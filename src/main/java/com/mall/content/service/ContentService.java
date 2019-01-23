package com.mall.content.service;
import java.util.List;

import com.mall.entity.PageResult;
import com.mall.pojo.TbContent;

/**
 * �����ӿ�
 * @author Administrator
 *
 */
public interface ContentService {

	/**
	 * ����ȫ���б�
	 * @return
	 */
	public List<TbContent> findAll();
	
	
	/**
	 * ���ط�ҳ�б�
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * ����
	*/
	public void add(TbContent content);
	
	
	/**
	 * �޸�
	 */
	public void update(TbContent content);
	

	/**
	 * ����ID��ȡʵ��
	 * @param id
	 * @return
	 */
	public TbContent findOne(Long id);
	
	
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
	public PageResult findPage(TbContent content, int pageNum,int pageSize);
	
	/**
	 * ���ݹ������ID��ѯ�б�
	 * @param key
	 * @return
	 */
	public List<TbContent> findByCategoryId(Long categoryId);

}
