package dubbo_l;

import org.apache.log4j.Logger;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dubbo.test.DubboProviderTestService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/spring-context.xml" })
public class DubboTest {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(DubboTest.class);

	@Resource(name="dubbo.dubboProviderTestService")
	private DubboProviderTestService dubboProviderTestService;
	
	@Test
	public void testProvider(){
		logger.info("===测试dubbo==="+dubboProviderTestService.getHelloWord());
	}
	
}
