

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.rider0.re_nexus_service.*.mapper")
public class MybatisConfig {
}
