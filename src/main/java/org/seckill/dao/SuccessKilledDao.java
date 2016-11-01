package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {

	/**
	 * ���빺����ϸ,�ɹ����ظ�
	 * @param seckillId
	 * @param userPhone
	 * @return ����Ľ��������
	 */
	int insertSuccessKilled(long seckillId,long userPhone);
	
	/**
	 * ����id ��ѯ SuccessKilled ��Я����ɱ��Ʒ����ʵ��
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);
	
	
}
