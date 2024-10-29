

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.UUID;

@Service
@Slf4j
public class TemplateServiceImpl implements TemplateServices {
    @Autowired
    private TemplateMapper userMapper;
}
