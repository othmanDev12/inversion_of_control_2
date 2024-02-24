package ext;

import doa.IDao;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("dao2")
public class DoaImpl2 implements IDao {

    private final Logger logger = Logger.getLogger(DoaImpl2.class.getName());

    @Override
    public double getData() {
        logger.info("version Capteurs");
        return 6000;
    }
}
