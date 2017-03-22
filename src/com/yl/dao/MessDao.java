package com.yl.dao;

import java.util.List;

import com.yl.entity.Mess;
import com.yl.vo.MessVo;

public interface MessDao {
	
	/**
	 * ����Ա��������ѯ��Ϣ
	 * @param currentPage ��ǰҳ
	 * @param pageSize ҳ��С
	 * @param vo ������Ϣ
	 * @return ��Ϣ���󼯺�
	 */
	List<Mess> queryByName(Integer currentPage , Integer pageSize , MessVo vo , String name);
	
	/**
	 * ��ѯ������
	 * @param currentPage ��ǰҳ
	 * @param pageSize ҳ��С
	 * @param vo ������Ϣ
	 * @param name Ա������
	 * @return ������Ϣ���󼯺�
	 */
	List<Mess> querySendMess(Integer currentPage , Integer pageSize , MessVo vo , String name);
	
	/**
	 * ��ѯ�ռ���
	 * @param currentPage ��ǰҳ
	 * @param pageSize ҳ��С
	 * @param vo ������Ϣ
	 * @param name Ա������
	 * @return �ռ���Ϣ���󼯺�
	 */
	List<Mess> queryGetMess(Integer currentPage , Integer pageSize , MessVo vo , String name);
	
	/**
	 * ��ѯ�ܼ�¼����
	 * @param vo ������Ϣ
	 * @param name ����
	 * @return ����������
	 */
	int getCountByName(MessVo vo , String name);
	
	/**
	 * ��ѯ�������ܼ�¼����
	 * @param vo ������Ϣ
	 * @param name ����
	 * @return ����������������
	 */
	int getCountBySendName(MessVo vo , String name);
	
	/**
	 * ��ѯ�ռ����ܼ�¼����
	 * @param vo ������Ϣ
	 * @param name ����
	 * @return �ռ�������������
	 */
	int getCountByGetName(MessVo vo , String name);
	
	/**
	 * ͨ��id��ѯ��¼
	 * @param id ���
	 * @return ��Ϣʵ�����
	 */
	Mess queryById(Integer id);
	
	/**
	 * �����Ϣ
	 * @param mess ��Ϣʵ�����
	 */
	void save(Mess mess);
	
	/**
	 * ɾ��ָ����ŵ���Ϣ��¼
	 * @param ids ���
	 */
	void delMany(Integer[] ids);
	
	
}
