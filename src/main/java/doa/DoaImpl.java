package doa;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("dao")
public class DoaImpl implements IDao {

    private final Logger logger = Logger.getLogger(DoaImpl.class.getName());

    public double getData() {
        logger.info("Version base de données");
        return Math.random()*40;
    }
}
