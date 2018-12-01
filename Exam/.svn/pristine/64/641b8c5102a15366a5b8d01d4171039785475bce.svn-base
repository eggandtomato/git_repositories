package test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.hzit.entity.Paper;
import com.hzit.util.HBUtil;

public class PaperTest {
	@Test
	public void getObj() {
		Session session = HBUtil.getCurrentSession();
		Transaction ts = session.beginTransaction();
		try {
			Paper p = session.load(Paper.class, 1);
			System.out.println("P="+p);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
